-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: survey
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `response`
--

DROP TABLE IF EXISTS `response`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `response` (
  `response_id` int NOT NULL AUTO_INCREMENT,
  `question_id` int DEFAULT NULL,
  `response` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`response_id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `response`
--

LOCK TABLES `response` WRITE;
/*!40000 ALTER TABLE `response` DISABLE KEYS */;
INSERT INTO `response` VALUES (1,1,'c'),(2,1,'a'),(3,1,'c'),(4,1,'c'),(5,1,'c'),(6,1,'a'),(7,1,'b'),(8,1,'b'),(9,1,'d'),(10,1,'d'),(11,1,'a'),(12,1,'b'),(13,1,'d'),(14,1,'b'),(15,1,'c'),(16,1,'c'),(17,1,'b'),(18,1,'d'),(19,1,'c'),(20,2,'c'),(21,2,'a'),(22,2,'a'),(23,2,'d'),(24,2,'b'),(25,2,'b'),(26,2,'a'),(27,0,'d'),(28,2,'a'),(29,2,'d'),(30,2,'c'),(31,2,'d'),(32,2,'c'),(33,2,'c'),(34,2,'c'),(35,2,'d'),(36,2,'d'),(37,2,'c'),(38,2,'a'),(39,2,'b'),(40,2,'a'),(41,2,'a'),(42,2,'a'),(43,2,'c'),(44,2,'b'),(45,2,'a'),(46,2,'b'),(47,2,'b'),(48,2,'b'),(49,2,'d'),(50,2,'c'),(51,2,'b'),(52,2,'d'),(53,2,'d'),(54,2,'b'),(55,2,'b'),(56,2,'a'),(57,2,'b'),(58,2,'b'),(59,2,'b'),(60,2,'c'),(61,2,'a'),(62,2,'d');
/*!40000 ALTER TABLE `response` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-28 19:44:13
