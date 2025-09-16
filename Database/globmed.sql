-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.30 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for globmed
DROP DATABASE IF EXISTS `globmed`;
CREATE DATABASE IF NOT EXISTS `globmed` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `globmed`;

-- Dumping structure for table globmed.admin_appointment
DROP TABLE IF EXISTS `admin_appointment`;
CREATE TABLE IF NOT EXISTS `admin_appointment` (
  `appointment_id` int NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(45) NOT NULL,
  `doctor_name` varchar(45) NOT NULL,
  `appointment_date` datetime NOT NULL,
  `appointment_time` varchar(20) NOT NULL,
  `Status` varchar(15) NOT NULL DEFAULT 'Scheduled',
  PRIMARY KEY (`appointment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table globmed.admin_appointment: ~2 rows (approximately)
INSERT INTO `admin_appointment` (`appointment_id`, `patient_name`, `doctor_name`, `appointment_date`, `appointment_time`, `Status`) VALUES
	(5, 'Dasun', 'Pasan', '2025-08-31 00:00:00', '08:15 PM', 'Scheduled'),
	(6, 'Kasun', 'dasun', '2025-09-01 00:00:00', '09:05 PM', 'Cancelled');

-- Dumping structure for table globmed.admin_billing
DROP TABLE IF EXISTS `admin_billing`;
CREATE TABLE IF NOT EXISTS `admin_billing` (
  `billing_id` int NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(25) NOT NULL,
  `doctor_name` varchar(25) NOT NULL,
  `total_amount` varchar(10) NOT NULL,
  `date_issued` datetime NOT NULL,
  `payment_status` varchar(15) NOT NULL,
  PRIMARY KEY (`billing_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table globmed.admin_billing: ~2 rows (approximately)
INSERT INTO `admin_billing` (`billing_id`, `patient_name`, `doctor_name`, `total_amount`, `date_issued`, `payment_status`) VALUES
	(5, 'Kusumi', 'sari', '5000.0', '2025-09-23 00:00:00', 'Card'),
	(6, 'Kusumia', 'saria', '12349.0', '2025-09-10 00:00:00', 'Cash');

-- Dumping structure for table globmed.admin_patient
DROP TABLE IF EXISTS `admin_patient`;
CREATE TABLE IF NOT EXISTS `admin_patient` (
  `patient_id` int NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(25) NOT NULL,
  `mobile` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table globmed.admin_patient: ~5 rows (approximately)
INSERT INTO `admin_patient` (`patient_id`, `patient_name`, `mobile`, `address`) VALUES
	(2, 'sahan', '0786543231', 'colombo'),
	(4, 'Anuja', '0773480439', 'Anuradhapura'),
	(11, 'Gayan', '0773480431', 'Kandy'),
	(14, 'Gayanii', '0773480430', 'Kandy13i'),
	(15, 'Guneya', '0723480224', 'Ampara');

-- Dumping structure for table globmed.admin_roles
DROP TABLE IF EXISTS `admin_roles`;
CREATE TABLE IF NOT EXISTS `admin_roles` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `user_type` varchar(15) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `address` varchar(25) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table globmed.admin_roles: ~2 rows (approximately)
INSERT INTO `admin_roles` (`user_id`, `name`, `user_type`, `mobile`, `address`, `username`, `password`) VALUES
	(3, 'Rashmika', 'Admin', '0781245130', 'Galle', 'rash', '123'),
	(4, 'anuja', 'Doctor', '0773480439', 'Anuradhapura', 'anuja2005', '123');

-- Dumping structure for table globmed.billing
DROP TABLE IF EXISTS `billing`;
CREATE TABLE IF NOT EXISTS `billing` (
  `billing_id` int NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(45) NOT NULL,
  `doctor_name` varchar(45) NOT NULL,
  `total_amount` varchar(10) NOT NULL,
  `date_issued` datetime NOT NULL,
  `payment_status` varchar(15) NOT NULL,
  PRIMARY KEY (`billing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

-- Dumping data for table globmed.billing: ~0 rows (approximately)

-- Dumping structure for table globmed.doctor_patient
DROP TABLE IF EXISTS `doctor_patient`;
CREATE TABLE IF NOT EXISTS `doctor_patient` (
  `patient_id` int NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(45) NOT NULL,
  `age` varchar(3) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `address` varchar(45) NOT NULL,
  `diagnosis` varchar(45) NOT NULL,
  `last_visit_date` datetime NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table globmed.doctor_patient: ~2 rows (approximately)
INSERT INTO `doctor_patient` (`patient_id`, `patient_name`, `age`, `mobile`, `address`, `diagnosis`, `last_visit_date`) VALUES
	(2, 'Dasun', '41', '0773456221', 'Kandy', 'Fever', '2025-08-02 00:00:00');

-- Dumping structure for table globmed.nurse_patient
DROP TABLE IF EXISTS `nurse_patient`;
CREATE TABLE IF NOT EXISTS `nurse_patient` (
  `patient_id` int NOT NULL AUTO_INCREMENT,
  `patient_name` varchar(45) NOT NULL,
  `age` varchar(3) NOT NULL,
  `medication_given` varchar(30) NOT NULL,
  `allergies` varchar(45) NOT NULL,
  `last_visit_date` datetime NOT NULL,
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table globmed.nurse_patient: ~3 rows (approximately)
INSERT INTO `nurse_patient` (`patient_id`, `patient_name`, `age`, `medication_given`, `allergies`, `last_visit_date`) VALUES
	(1, 'Kusum', '32', 'Panadol', 'Palu / Kasanawa', '2025-08-19 00:00:00'),
	(3, 'sumudu', '15', 'Panadol', 'Palu', '2025-09-01 00:00:00');

-- Dumping structure for table globmed.stock
DROP TABLE IF EXISTS `stock`;
CREATE TABLE IF NOT EXISTS `stock` (
  `stock_id` int NOT NULL AUTO_INCREMENT,
  `medicine_name` varchar(45) NOT NULL,
  `quantity` varchar(7) NOT NULL,
  `price_per_unit` varchar(10) NOT NULL,
  `expiry_date` datetime NOT NULL,
  `status` varchar(15) NOT NULL,
  PRIMARY KEY (`stock_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table globmed.stock: ~2 rows (approximately)
INSERT INTO `stock` (`stock_id`, `medicine_name`, `quantity`, `price_per_unit`, `expiry_date`, `status`) VALUES
	(1, 'Panadol', '20', '10.0', '2026-08-18 00:00:00', 'Available'),
	(4, 'Zin', '60', '7.0', '2026-08-18 00:00:00', 'Available');

-- Dumping structure for table globmed.users
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `user_type` varchar(15) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;

-- Dumping data for table globmed.users: ~6 rows (approximately)
INSERT INTO `users` (`user_id`, `username`, `password`, `user_type`) VALUES
	(1, 'anuja', '123', 'Admin'),
	(2, 'admin', '123', 'Admin'),
	(3, 'doca', '123', 'Doctor'),
	(4, 'phar', '123', 'Pharmacist'),
	(5, 'billing', '123', 'BillingOfficer'),
	(6, 'patient', '123', 'Patient'),
	(7, 'nurse', '123', 'Nurse');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
