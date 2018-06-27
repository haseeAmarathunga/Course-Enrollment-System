-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2018 at 05:59 PM
-- Server version: 5.5.32
-- PHP Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `nsbm_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE IF NOT EXISTS `students` (
  `Stu_id` char(9) NOT NULL,
  `FirstName` varchar(20) NOT NULL,
  `LastName` varchar(20) NOT NULL,
  `BirthDay` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `MobileNo` char(10) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `Faculty` varchar(30) NOT NULL,
  `CourseType` varchar(20) NOT NULL,
  `year` char(3) DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`Stu_id`, `FirstName`, `LastName`, `BirthDay`, `Address`, `MobileNo`, `Email`, `Gender`, `Faculty`, `CourseType`, `year`) VALUES
('2016BS001', 'Srinath', 'Mahagama', '1995/10/12', 'Melsiripura,kurunegala', '0711451845', 'mahagama@yahoo.com', 'Male', 'School Of Business', 'Bachelor', '1st'),
('2016BS003', 'Pasan', 'Ekanayake', '1995/10/02', 'Uhumeeya, Sri Lanka', '0711451251', 'shadowEkanayake@gmail.com', 'Male', 'School Of Business', 'Master', '2nd'),
('2016BS008', 'shyama', 'soyza', '1995/01/20', 'Moratuwa,Panadura', '0711477452', 'shayamasoyza@ymail.com', 'female', 'School Of Business', 'Bachelor', '1st'),
('2016cs001', 'Bhanuka', 'Aravinda', '1995/01/10', 'Boyagane,Kurunegala', '0711481215', 'bhanukaaravinda@gmail.com', 'Male', 'School Of Computing', 'Bachelor', '3rd'),
('2016cs002', 'Pasan', 'Jayawickrama', '1994/05/10', 'Narammala,Kurunegala', '0767548541', 'pasanJaye@gmail.com', 'Male', 'School Of Computing', 'Bachelor', '2nd'),
('2016EN002', 'Isuru', 'Banda', '1995/10/10', 'No65,Galleroad, Colombo 06', '0751421451', 'banda@hotmail.com', 'Male', 'School Of Engineering', 'Master', '1st');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
