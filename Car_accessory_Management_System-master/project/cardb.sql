-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: cardb
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `accessory_details`
--

DROP TABLE IF EXISTS `accessory_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accessory_details` (
  `access_id` int NOT NULL,
  `access_name` varchar(45) NOT NULL,
  `category` varchar(45) NOT NULL,
  `price` int NOT NULL,
  `price_range` varchar(45) NOT NULL,
  `recommendation` varchar(45) NOT NULL,
  `warranty` int NOT NULL,
  `foldable` varchar(45) NOT NULL,
  `water_res` varchar(45) NOT NULL,
  `color` varchar(45) NOT NULL,
  PRIMARY KEY (`access_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accessory_details`
--

LOCK TABLES `accessory_details` WRITE;
/*!40000 ALTER TABLE `accessory_details` DISABLE KEYS */;
INSERT INTO `accessory_details` VALUES (1,'bluetooth','media',1000,'medium','by company',1,'yes','yes','blue,red,black'),(2,'air bags','comfort',13000,'high','by company',3,'yes','yes','black,grey'),(3,'Air freshner','Ambience',1500,'Medium','None',1,'No','No','All colors'),(4,'USB charger','Media',500,'Low','None',0,'No','No','Black'),(5,'Seat Cover','Interior',6000,'High','By company',2,'Yes','Yes','Grey'),(6,'Buzzer','Security',7500,'High','By community',5,'No','Yes','None'),(7,'Floor Mats','Interior',450,'Low','None',1,'Yes','No','Black,Brown,Yellow'),(8,'Emergency Supply','Security',8900,'High','By company',10,'No','No','None'),(9,'Lighting','Ambience',2300,'Medium','None',3,'Yes','No','Multicolor'),(10,'Seat design','Comfort',4500,'Medium','By company',4,'No','No','Brown'),(11,'abcd','By community',12300,'High','none',4,'yes','black','yes');
/*!40000 ALTER TABLE `accessory_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin_cus_order`
--

DROP TABLE IF EXISTS `admin_cus_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_cus_order` (
  `clientid` varchar(30) DEFAULT NULL,
  `CustomerName` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobileNo` varchar(30) DEFAULT NULL,
  `adharCardNo` varchar(18) DEFAULT NULL,
  `carmodel` varchar(50) DEFAULT NULL,
  `carColour` varchar(15) DEFAULT NULL,
  `dateoforder` date DEFAULT NULL,
  `ECA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_cus_order`
--

LOCK TABLES `admin_cus_order` WRITE;
/*!40000 ALTER TABLE `admin_cus_order` DISABLE KEYS */;
INSERT INTO `admin_cus_order` VALUES ('gm22','Gayatri Magar','gayatrimagar22@gmail.com','7745670123','5566','buzzer','None','2021-12-01','No'),('gm22','Prachiti patil','patilprachiti71@gmail.com','7798345901','5678','abcd','black','2021-12-06','No');
/*!40000 ALTER TABLE `admin_cus_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admindb`
--

DROP TABLE IF EXISTS `admindb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admindb` (
  `userid` varchar(30) NOT NULL DEFAULT '',
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admindb`
--

LOCK TABLES `admindb` WRITE;
/*!40000 ALTER TABLE `admindb` DISABLE KEYS */;
INSERT INTO `admindb` VALUES ('Akshay','akshay#123'),('neha','nkn#0506'),('prathmesh','ptm@31'),('sakshi','snehal@08');
/*!40000 ALTER TABLE `admindb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cardetails`
--

DROP TABLE IF EXISTS `cardetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cardetails` (
  `car_name` varchar(25) DEFAULT NULL,
  `car_model` varchar(30) DEFAULT NULL,
  `Mileage` varchar(8) DEFAULT NULL,
  `Engine` varchar(8) DEFAULT NULL,
  `BPH` varchar(8) DEFAULT NULL,
  `Transmission` varchar(10) DEFAULT NULL,
  `TopSpeed` varchar(6) DEFAULT NULL,
  `ColourAvailable` varchar(30) DEFAULT NULL,
  `yearly_SChargee` varchar(9) DEFAULT NULL,
  `Avg_Cost` varchar(15) DEFAULT NULL,
  `fuel_type` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cardetails`
--

LOCK TABLES `cardetails` WRITE;
/*!40000 ALTER TABLE `cardetails` DISABLE KEYS */;
INSERT INTO `cardetails` VALUES ('bmw','sdcj','44','55','90','Manual','20','grey','89','100','Petrol'),('Mercedes-Benz AMG G','S','12.8','3982','510','Auto','310','Black,White,Red','181600','22700000','Petrol'),('Mercedes-Benz AMG G','Roadster','11','3900','460','Auto','302','Black,Red,Blue','176000','22000000','Petrol'),('Mercedes-Benz AMG G','R','13.3','3980','585','Auto','318','Black,White','184000','23000000','Petrol'),('Mercedes-Benz C-Class','Prime C 220d','12.5','1950','194','Auto','240','White,Gray','32000','4000000','Diesel'),('Mercedes-Benz C-Class','Progressive C 220d','10','1900','186','Auto','255','Black,Blue','35400','4425000','Diesel'),('Mercedes-Benz C-Class','C300 Cabriolet','17.9','1991','258','Auto','250','Gray,Red,White','52160','6520000','Petrol'),('Mercedes-Benz CLA','200 CDI','18','2143','136','Auto','220','Black,White','25376','3172000','Diesel'),('Mercedes-Benz CLA','Urban Sport 200','15','1991','184','Auto','235','White,Red,Gray','28792','3599000','Petrol'),('Mercedes-Benz CLA','200 CGI Sport','14.5','1991','183','Auto','235','Black,Red','27688','3461000','Petrol'),('Mercedes-Benz CLA','AMG 45','13.2','2000','385','Auto','260','Blac,White,Blue','60160','7520000','Petrol'),('Mercedes-Benz GLA Class','220 d 4MATIC','17.8','2143','170','Auto','221','Black','30912','3864000','Diesel'),('Mercedes-Benz GLA Class','200 d Style','19.3','2213','150','Auto','215','Red,Blue,White','23720','2965000','Diesel'),('Mercedes-Benz GLA Class','200 d Sport','16.5','2095','154','Auto','230','Black,White,Gray','26912','3364000','Diesel'),('bmw','abcd','56','45','120','Manual','567','black','90','77','Petrol'),('bmw','kdnj','55','44','33','Auto','98','grey','23','89','Petrol');
/*!40000 ALTER TABLE `cardetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientdb`
--

DROP TABLE IF EXISTS `clientdb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientdb` (
  `userid` varchar(30) NOT NULL,
  `password` varchar(30) DEFAULT NULL,
  `FullName` varchar(30) DEFAULT NULL,
  `MobileNo` varchar(15) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientdb`
--

LOCK TABLES `clientdb` WRITE;
/*!40000 ALTER TABLE `clientdb` DISABLE KEYS */;
INSERT INTO `clientdb` VALUES ('momos','momos1234','priti deore','8945123789','pritideore789@gmail.com','Satana, nashik'),('nkn0506','789','neha','1234567891','mine@gmail.com','jwhdbsjbzjcb'),('sakshi08','1234','sakshi sonje','9988776655','sakshisonje08@gmail.com','upendra nagar, nashik'),('sansa45','pilli89','pradnya jadhav','9854773311','pradnya@gmail.com','Stana');
/*!40000 ALTER TABLE `clientdb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `momosordertbl`
--

DROP TABLE IF EXISTS `momosordertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `momosordertbl` (
  `CustomerName` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobileNo` varchar(30) DEFAULT NULL,
  `adharCardNo` varchar(18) DEFAULT NULL,
  `carModel` varchar(30) DEFAULT NULL,
  `carColour` varchar(15) DEFAULT NULL,
  `dateoforder` date DEFAULT NULL,
  `ECA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `momosordertbl`
--

LOCK TABLES `momosordertbl` WRITE;
/*!40000 ALTER TABLE `momosordertbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `momosordertbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nkn0506ordertbl`
--

DROP TABLE IF EXISTS `nkn0506ordertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nkn0506ordertbl` (
  `CustomerName` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobileNo` varchar(30) DEFAULT NULL,
  `adharCardNo` varchar(18) DEFAULT NULL,
  `carModel` varchar(30) DEFAULT NULL,
  `carColour` varchar(15) DEFAULT NULL,
  `dateoforder` date DEFAULT NULL,
  `ECA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nkn0506ordertbl`
--

LOCK TABLES `nkn0506ordertbl` WRITE;
/*!40000 ALTER TABLE `nkn0506ordertbl` DISABLE KEYS */;
INSERT INTO `nkn0506ordertbl` VALUES ('neha nemade','mine@gmail.com','123456','7890','abcd','black','2021-11-26','YES'),('prathmesh Bonde','prathmeshbonde31@gmail.com','9876334891','4567','AMG 45','Blue','2021-11-25','No');
/*!40000 ALTER TABLE `nkn0506ordertbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sakshi08ordertbl`
--

DROP TABLE IF EXISTS `sakshi08ordertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sakshi08ordertbl` (
  `CustomerName` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobileNo` varchar(30) DEFAULT NULL,
  `adharCardNo` varchar(18) DEFAULT NULL,
  `carModel` varchar(30) DEFAULT NULL,
  `carColour` varchar(15) DEFAULT NULL,
  `dateoforder` date DEFAULT NULL,
  `ECA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sakshi08ordertbl`
--

LOCK TABLES `sakshi08ordertbl` WRITE;
/*!40000 ALTER TABLE `sakshi08ordertbl` DISABLE KEYS */;
INSERT INTO `sakshi08ordertbl` VALUES ('Sakshi sonje','sakshisonje08@gmail.com','9988776655','9067','Roadster','Red','2021-11-20','YES');
/*!40000 ALTER TABLE `sakshi08ordertbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sansa45ordertbl`
--

DROP TABLE IF EXISTS `sansa45ordertbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sansa45ordertbl` (
  `CustomerName` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `mobileNo` varchar(30) DEFAULT NULL,
  `adharCardNo` varchar(18) DEFAULT NULL,
  `carModel` varchar(30) DEFAULT NULL,
  `carColour` varchar(15) DEFAULT NULL,
  `dateoforder` date DEFAULT NULL,
  `ECA` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sansa45ordertbl`
--

LOCK TABLES `sansa45ordertbl` WRITE;
/*!40000 ALTER TABLE `sansa45ordertbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `sansa45ordertbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-12 14:43:35
