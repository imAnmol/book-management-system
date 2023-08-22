package com.assignment;

import java.util.Scanner;

import com.assignment.service.UserService;
import com.assignment.to.User;

public class Runner {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		UserService userService = new UserService();

		boolean mainMenuFlag = true;

		while (mainMenuFlag) {

			User user = new User();

			System.out.println("\n" + "1. Registration" + "\n" + "2. Login" + "\n" + "0. Exit");

			int mainMenuInput = sc.nextInt();

			switch (mainMenuInput) {

			case 1:

				user = userService.register();

				System.out.println("\n" + "------Welcome To Osttra Book Store------");

				if (user.getRole().equals("Admin")) {
					userService.adminFunctionality(user);
				} else {
					userService.normalFunctionality(user);
				}

				break;

			case 2:
				user = userService.login();

				if (user != null) {
					System.out.println("\n" + "------Welcome To Osttra Book Store------");

					if (user.getRole().equals("Admin")) {
						userService.adminFunctionality(user);
					} else {
						userService.normalFunctionality(user);
					}
				} else {
					System.out.println("Credentials are wrong ");
				}

				break;

			case 0:
				mainMenuFlag = false;
				System.out.println("Exit Successfully");
				break;
			}

		}
	}
}
