package com.assignment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.assignment.to.User;
import com.assignment.utils.DBUtils;

public class UserDAO {
	public void add(User user) {

		try {

			Connection conn = DBUtils.getConnection();

			PreparedStatement statement = conn.prepareStatement("insert into user values(?, ?, ?, ?)");

			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getName());
			statement.setString(4, user.getRole());

			statement.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("inside catch of add() of UserDAO...");
			e.printStackTrace();
		}
	}

	public User getUser(String username, String password) {
		User user = null;

		try {

			Connection conn = DBUtils.getConnection();

			PreparedStatement statement = conn
					.prepareStatement("select * from user where username = ? and password = ?");

			statement.setString(1, username);
			statement.setString(2, password);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {

				String uname = resultSet.getString(1);
				String pwd = resultSet.getString(2);
				String name = resultSet.getString(3);
				String role = resultSet.getString(4);

				user = new User(uname, pwd, name, role);
			}

		} catch (Exception e) {
			System.out.println("inside catch of getuser() of UserDAO...");
			e.printStackTrace();
		}
		return user;
	}

	public void viewProfile(User user) {
		System.out.print(user.getUsername() + " ");
		System.out.print(user.getName() + " ");
		System.out.print(user.getRole() + " ");
	}

	public void usersProfile() {
		User user = null;

		try {

			Connection conn = DBUtils.getConnection();

			PreparedStatement statement = conn.prepareStatement("select * from user");

			ResultSet resultSet = statement.executeQuery();

			while (resultSet.next()) {

				String uname = resultSet.getString(1);
				String pwd = resultSet.getString(2);
				String name = resultSet.getString(3);
				String role = resultSet.getString(4);

				user = new User(uname, pwd, name, role);
				System.out.print(user.getUsername() + " ");
				System.out.print(user.getPassword() + " ");
				System.out.print(user.getName() + " ");
				System.out.println(user.getRole() + " ");
			}

		} catch (Exception e) {
			System.out.println("inside catch of usersProfile() of UserDAO...");
			e.printStackTrace();
		}

	}
}
