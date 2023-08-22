-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: osttra_jdbc
-- ------------------------------------------------------
-- Server version	8.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('a','b','c','d'),('e','f','g','h'),('s','d','g','h'),('a','a','d','f'),('ghy','hh','gg','dd'),('y','y','y','y'),('w','w','w','w'),('e','e','e','e'),('r','r','r','r'),('q','q','q','q'),('t','t','t','admin'),('u','u','u','admin'),('j','j','j','j'),('qw','qw','qw','qw'),('im__anmol_','hello','Anmol','Admin'),('1','GOT','George','Game'),('1','asd','dff','rfrfr'),('r','r','r','r'),('r','r','r','r'),('w','e','r','Admin'),('w','e','rr','tt'),('r','y','u','i'),('a','s','j','Admin'),('Keshav_123','hello@123','Systumm','Admin'),('s','d','ff','gg'),('d','ff','ss','Admin'),('d','f','g','Admin'),('a','s','d','Admin'),('w','d','f','Admin'),('y','tt','rr','Admin'),('rr','tt','rr','Admin'),('rr','tt','rr','Admin'),('e','r','t','e'),('q','w','e','e'),('w','w','w','Admin'),('e','r','t','Admin'),('w','s','s','Admin'),('a','s','s','Admin'),('a','ad','d','Admin'),('w','e','r','Admin'),('s','s','f','Admin'),('a','d','f','Admin'),('t','t','t','Admin'),('e','r','t','Admin'),('e','r','r','Admin'),('a','s','a','s'),('w','s','s','Admin'),('a','a','a','Admin'),('a','s','d','Admin'),('e','e','e','Admin'),('e','e','e','Admin'),('j','j','j','Admin'),('a','a','a','Admin'),('1','1','1','Admin'),('a','a','a','Admin'),('e','r','t','f'),('a','s','d','Admin'),('d','d','f','f'),('w','e','e','Admin'),('s','ff','f','Admin'),('d','f','g','Admin');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-22 22:50:40
