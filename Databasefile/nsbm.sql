-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 17, 2018 at 10:04 AM
-- Server version: 5.5.32
-- PHP Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `nsbm`
--
CREATE DATABASE IF NOT EXISTS `nsbm` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `nsbm`;

-- --------------------------------------------------------

--
-- Table structure for table `lecsub`
--

CREATE TABLE IF NOT EXISTS `lecsub` (
  `ID` varchar(15) NOT NULL,
  `Sub_id` varchar(8) NOT NULL,
  `Faculty` varchar(25) NOT NULL,
  `Course` varchar(30) NOT NULL,
  `Year` varchar(5) NOT NULL,
  `Semester` varchar(5) NOT NULL,
  `Type` varchar(15) NOT NULL,
  PRIMARY KEY (`ID`,`Sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecsub`
--

INSERT INTO `lecsub` (`ID`, `Sub_id`, `Faculty`, `Course`, `Year`, `Semester`, `Type`) VALUES
('L/BM/001', 'BM1001', 'School Of Business', 'Business Management', '1st', '1st', 'Lecturer'),
('L/BM/001', 'BM1002', 'School Of Business', 'Business Management', '1st', '1st', 'Lecturer');

-- --------------------------------------------------------

--
-- Table structure for table `marksba11`
--

CREATE TABLE IF NOT EXISTS `marksba11` (
  `Stu_id` varchar(15) NOT NULL,
  `BA1001` float DEFAULT NULL,
  `BA1002` float DEFAULT NULL,
  `BA1003` float DEFAULT NULL,
  `BA1004` float DEFAULT NULL,
  `BA1005` float DEFAULT NULL,
  `BA1006` float DEFAULT NULL,
  `BA1007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marksba11`
--

INSERT INTO `marksba11` (`Stu_id`, `BA1001`, `BA1002`, `BA1003`, `BA1004`, `BA1005`, `BA1006`, `BA1007`) VALUES
('2018/BA/002', 60, 0, 0, 80, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `marksba12`
--

CREATE TABLE IF NOT EXISTS `marksba12` (
  `Stu_id` varchar(15) NOT NULL,
  `BA1008` float DEFAULT NULL,
  `BA1009` float DEFAULT NULL,
  `BA1010` float DEFAULT NULL,
  `BA1011` float DEFAULT NULL,
  `BA1012` float DEFAULT NULL,
  `BA1013` float DEFAULT NULL,
  `BA1014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksba21`
--

CREATE TABLE IF NOT EXISTS `marksba21` (
  `Stu_id` varchar(15) NOT NULL,
  `BA2001` float DEFAULT NULL,
  `BA2002` float DEFAULT NULL,
  `BA2003` float DEFAULT NULL,
  `BA2004` float DEFAULT NULL,
  `BA2005` float DEFAULT NULL,
  `BA2006` float DEFAULT NULL,
  `BA2007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksba22`
--

CREATE TABLE IF NOT EXISTS `marksba22` (
  `Stu_id` varchar(15) NOT NULL,
  `BA2008` float DEFAULT NULL,
  `BA2009` float DEFAULT NULL,
  `BA2010` float DEFAULT NULL,
  `BA2011` float DEFAULT NULL,
  `BA2012` float DEFAULT NULL,
  `BA2013` float DEFAULT NULL,
  `BA2014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksba31`
--

CREATE TABLE IF NOT EXISTS `marksba31` (
  `Stu_id` varchar(15) NOT NULL,
  `BA3001` float DEFAULT NULL,
  `BA3002` float DEFAULT NULL,
  `BA3003` float DEFAULT NULL,
  `BA3004` float DEFAULT NULL,
  `BA3005` float DEFAULT NULL,
  `BA3006` float DEFAULT NULL,
  `BA3007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksba32`
--

CREATE TABLE IF NOT EXISTS `marksba32` (
  `Stu_id` varchar(15) NOT NULL,
  `BA3008` float DEFAULT NULL,
  `BA3009` float DEFAULT NULL,
  `BA3010` float DEFAULT NULL,
  `BA3011` float DEFAULT NULL,
  `BA3012` float DEFAULT NULL,
  `BA3013` float DEFAULT NULL,
  `BA3014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksbm11`
--

CREATE TABLE IF NOT EXISTS `marksbm11` (
  `Stu_id` varchar(15) NOT NULL,
  `BM1001` float DEFAULT NULL,
  `BM1002` float DEFAULT NULL,
  `BM1003` float DEFAULT NULL,
  `BM1004` float DEFAULT NULL,
  `BM1005` float DEFAULT NULL,
  `BM1006` float DEFAULT NULL,
  `BM1007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marksbm11`
--

INSERT INTO `marksbm11` (`Stu_id`, `BM1001`, `BM1002`, `BM1003`, `BM1004`, `BM1005`, `BM1006`, `BM1007`) VALUES
('2018/BM/001', 75, 36, 64, 0, 75, 55, 60);

-- --------------------------------------------------------

--
-- Table structure for table `marksbm12`
--

CREATE TABLE IF NOT EXISTS `marksbm12` (
  `Stu_id` varchar(15) NOT NULL,
  `BM1008` float DEFAULT NULL,
  `BM1009` float DEFAULT NULL,
  `BM1010` float DEFAULT NULL,
  `BM1011` float DEFAULT NULL,
  `BM1012` float DEFAULT NULL,
  `BM1013` float DEFAULT NULL,
  `BM1014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksbm21`
--

CREATE TABLE IF NOT EXISTS `marksbm21` (
  `Stu_id` varchar(15) NOT NULL,
  `BM2001` float DEFAULT NULL,
  `BM2002` float DEFAULT NULL,
  `BM2003` float DEFAULT NULL,
  `BM2004` float DEFAULT NULL,
  `BM2005` float DEFAULT NULL,
  `BM2006` float DEFAULT NULL,
  `BM2007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marksbm21`
--

INSERT INTO `marksbm21` (`Stu_id`, `BM2001`, `BM2002`, `BM2003`, `BM2004`, `BM2005`, `BM2006`, `BM2007`) VALUES
('2017/BM/001', 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `marksbm22`
--

CREATE TABLE IF NOT EXISTS `marksbm22` (
  `Stu_id` varchar(15) NOT NULL,
  `BM2008` float DEFAULT NULL,
  `BM2009` float DEFAULT NULL,
  `BM2010` float DEFAULT NULL,
  `BM2011` float DEFAULT NULL,
  `BM2012` float DEFAULT NULL,
  `BM2013` float DEFAULT NULL,
  `BM2014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksbm31`
--

CREATE TABLE IF NOT EXISTS `marksbm31` (
  `Stu_id` varchar(15) NOT NULL,
  `BM3001` float DEFAULT NULL,
  `BM3002` float DEFAULT NULL,
  `BM3003` float DEFAULT NULL,
  `BM3004` float DEFAULT NULL,
  `BM3005` float DEFAULT NULL,
  `BM3006` float DEFAULT NULL,
  `BM3007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marksbm31`
--

INSERT INTO `marksbm31` (`Stu_id`, `BM3001`, `BM3002`, `BM3003`, `BM3004`, `BM3005`, `BM3006`, `BM3007`) VALUES
('2016/BM/001', 0, 0, 0, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `marksbm32`
--

CREATE TABLE IF NOT EXISTS `marksbm32` (
  `Stu_id` varchar(15) NOT NULL,
  `BM3008` float DEFAULT NULL,
  `BM3009` float DEFAULT NULL,
  `BM3010` float DEFAULT NULL,
  `BM3011` float DEFAULT NULL,
  `BM3012` float DEFAULT NULL,
  `BM3013` float DEFAULT NULL,
  `BM3014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksce11`
--

CREATE TABLE IF NOT EXISTS `marksce11` (
  `Stu_id` varchar(15) NOT NULL,
  `CE1001` float DEFAULT NULL,
  `CE1002` float DEFAULT NULL,
  `CE1003` float DEFAULT NULL,
  `CE1004` float DEFAULT NULL,
  `CE1005` float DEFAULT NULL,
  `CE1006` float DEFAULT NULL,
  `CE1007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksce12`
--

CREATE TABLE IF NOT EXISTS `marksce12` (
  `Stu_id` varchar(15) NOT NULL,
  `CE1008` float DEFAULT NULL,
  `CE1009` float DEFAULT NULL,
  `CE1010` float DEFAULT NULL,
  `CE1011` float DEFAULT NULL,
  `CE1012` float DEFAULT NULL,
  `CE1013` float DEFAULT NULL,
  `CE1014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksce21`
--

CREATE TABLE IF NOT EXISTS `marksce21` (
  `Stu_id` varchar(15) NOT NULL,
  `CE2001` float DEFAULT NULL,
  `CE2002` float DEFAULT NULL,
  `CE2003` float DEFAULT NULL,
  `CE2004` float DEFAULT NULL,
  `CE2005` float DEFAULT NULL,
  `CE2006` float DEFAULT NULL,
  `CE2007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksce22`
--

CREATE TABLE IF NOT EXISTS `marksce22` (
  `Stu_id` varchar(15) NOT NULL,
  `CE2008` float DEFAULT NULL,
  `CE2009` float DEFAULT NULL,
  `CE2010` float DEFAULT NULL,
  `CE2011` float DEFAULT NULL,
  `CE2012` float DEFAULT NULL,
  `CE2013` float DEFAULT NULL,
  `CE2014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksce31`
--

CREATE TABLE IF NOT EXISTS `marksce31` (
  `Stu_id` varchar(15) NOT NULL,
  `CE3001` float DEFAULT NULL,
  `CE3002` float DEFAULT NULL,
  `CE3003` float DEFAULT NULL,
  `CE3004` float DEFAULT NULL,
  `CE3005` float DEFAULT NULL,
  `CE3006` float DEFAULT NULL,
  `CE3007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksce32`
--

CREATE TABLE IF NOT EXISTS `marksce32` (
  `Stu_id` varchar(15) NOT NULL,
  `CE3008` float DEFAULT NULL,
  `CE3009` float DEFAULT NULL,
  `CE3010` float DEFAULT NULL,
  `CE3011` float DEFAULT NULL,
  `CE3012` float DEFAULT NULL,
  `CE3013` float DEFAULT NULL,
  `CE3014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `markscs11`
--

CREATE TABLE IF NOT EXISTS `markscs11` (
  `Stu_id` varchar(15) NOT NULL,
  `CS1001` float NOT NULL,
  `CS1002` float NOT NULL,
  `CS1003` float NOT NULL,
  `CS1004` float NOT NULL,
  `CS1005` float NOT NULL,
  `CS1006` float NOT NULL,
  `CS1007` float NOT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `markscs11`
--

INSERT INTO `markscs11` (`Stu_id`, `CS1001`, `CS1002`, `CS1003`, `CS1004`, `CS1005`, `CS1006`, `CS1007`) VALUES
('2018/CS/001', 78, 64, 91, 0, 0, 100, 0);

-- --------------------------------------------------------

--
-- Table structure for table `markscs12`
--

CREATE TABLE IF NOT EXISTS `markscs12` (
  `Stu_id` varchar(15) NOT NULL,
  `CS1008` float DEFAULT NULL,
  `CS1009` float DEFAULT NULL,
  `CS1010` float DEFAULT NULL,
  `CS1011` float DEFAULT NULL,
  `CS1012` float DEFAULT NULL,
  `CS1013` float DEFAULT NULL,
  `CS1014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `markscs21`
--

CREATE TABLE IF NOT EXISTS `markscs21` (
  `Stu_id` varchar(15) NOT NULL,
  `CS2001` float DEFAULT NULL,
  `CS2002` float DEFAULT NULL,
  `CS2003` float DEFAULT NULL,
  `CS2004` float DEFAULT NULL,
  `CS2005` float DEFAULT NULL,
  `CS2006` float DEFAULT NULL,
  `CS2007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `markscs22`
--

CREATE TABLE IF NOT EXISTS `markscs22` (
  `Stu_id` varchar(15) NOT NULL,
  `CS2008` float DEFAULT NULL,
  `CS2009` float DEFAULT NULL,
  `CS2010` float DEFAULT NULL,
  `CS2011` float DEFAULT NULL,
  `CS2012` float DEFAULT NULL,
  `CS2013` float DEFAULT NULL,
  `CS2014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `markscs31`
--

CREATE TABLE IF NOT EXISTS `markscs31` (
  `Stu_id` varchar(15) NOT NULL,
  `CS3001` float DEFAULT NULL,
  `CS3002` float DEFAULT NULL,
  `CS3003` float DEFAULT NULL,
  `CS3004` float DEFAULT NULL,
  `CS3005` float DEFAULT NULL,
  `CS3006` float DEFAULT NULL,
  `CS3007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `markscs32`
--

CREATE TABLE IF NOT EXISTS `markscs32` (
  `Stu_id` varchar(15) NOT NULL,
  `CS3008` float DEFAULT NULL,
  `CS3009` float DEFAULT NULL,
  `CS3010` float DEFAULT NULL,
  `CS3011` float DEFAULT NULL,
  `CS3012` float DEFAULT NULL,
  `CS3013` float DEFAULT NULL,
  `CS3014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksee11`
--

CREATE TABLE IF NOT EXISTS `marksee11` (
  `Stu_id` varchar(15) NOT NULL,
  `EE1001` float DEFAULT NULL,
  `EE1002` float DEFAULT NULL,
  `EE1003` float DEFAULT NULL,
  `EE1004` float DEFAULT NULL,
  `EE1005` float DEFAULT NULL,
  `EE1006` float DEFAULT NULL,
  `EE1007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksee12`
--

CREATE TABLE IF NOT EXISTS `marksee12` (
  `Stu_id` varchar(15) NOT NULL,
  `EE1008` float DEFAULT NULL,
  `EE1009` float DEFAULT NULL,
  `EE1010` float DEFAULT NULL,
  `EE1011` float DEFAULT NULL,
  `EE1012` float DEFAULT NULL,
  `EE1013` float DEFAULT NULL,
  `EE1014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksee21`
--

CREATE TABLE IF NOT EXISTS `marksee21` (
  `Stu_id` varchar(15) NOT NULL,
  `EE2001` float DEFAULT NULL,
  `EE2002` float DEFAULT NULL,
  `EE2003` float DEFAULT NULL,
  `EE2004` float DEFAULT NULL,
  `EE2005` float DEFAULT NULL,
  `EE2006` float DEFAULT NULL,
  `EE2007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksee22`
--

CREATE TABLE IF NOT EXISTS `marksee22` (
  `Stu_id` varchar(15) NOT NULL,
  `EE2008` float DEFAULT NULL,
  `EE2009` float DEFAULT NULL,
  `EE2010` float DEFAULT NULL,
  `EE2011` float DEFAULT NULL,
  `EE2012` float DEFAULT NULL,
  `EE2013` float DEFAULT NULL,
  `EE2014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksee31`
--

CREATE TABLE IF NOT EXISTS `marksee31` (
  `Stu_id` varchar(15) NOT NULL,
  `EE3001` float DEFAULT NULL,
  `EE3002` float DEFAULT NULL,
  `EE3003` float DEFAULT NULL,
  `EE3004` float DEFAULT NULL,
  `EE3005` float DEFAULT NULL,
  `EE3006` float DEFAULT NULL,
  `EE3007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksee32`
--

CREATE TABLE IF NOT EXISTS `marksee32` (
  `Stu_id` varchar(15) NOT NULL,
  `EE3008` float DEFAULT NULL,
  `EE3009` float DEFAULT NULL,
  `EE3010` float DEFAULT NULL,
  `EE3011` float DEFAULT NULL,
  `EE3012` float DEFAULT NULL,
  `EE3013` float DEFAULT NULL,
  `EE3014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksis11`
--

CREATE TABLE IF NOT EXISTS `marksis11` (
  `Stu_id` varchar(15) NOT NULL,
  `IS1001` float DEFAULT NULL,
  `IS1002` float DEFAULT NULL,
  `IS1003` float DEFAULT NULL,
  `IS1004` float DEFAULT NULL,
  `IS1005` float DEFAULT NULL,
  `IS1006` float DEFAULT NULL,
  `IS1007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksis12`
--

CREATE TABLE IF NOT EXISTS `marksis12` (
  `Stu_id` varchar(15) NOT NULL,
  `IS1008` float DEFAULT NULL,
  `IS1009` float DEFAULT NULL,
  `IS1010` float DEFAULT NULL,
  `IS1011` float DEFAULT NULL,
  `IS1012` float DEFAULT NULL,
  `IS1013` float DEFAULT NULL,
  `IS1014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksis21`
--

CREATE TABLE IF NOT EXISTS `marksis21` (
  `Stu_id` varchar(15) NOT NULL,
  `IS2001` float DEFAULT NULL,
  `IS2002` float DEFAULT NULL,
  `IS2003` float DEFAULT NULL,
  `IS2004` float DEFAULT NULL,
  `IS2005` float DEFAULT NULL,
  `IS2006` float DEFAULT NULL,
  `IS2007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marksis21`
--

INSERT INTO `marksis21` (`Stu_id`, `IS2001`, `IS2002`, `IS2003`, `IS2004`, `IS2005`, `IS2006`, `IS2007`) VALUES
('2017/IS/001', 70, 75, 55, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `marksis22`
--

CREATE TABLE IF NOT EXISTS `marksis22` (
  `Stu_id` varchar(15) NOT NULL,
  `IS2008` float DEFAULT NULL,
  `IS2009` float DEFAULT NULL,
  `IS2010` float DEFAULT NULL,
  `IS2011` float DEFAULT NULL,
  `IS2012` float DEFAULT NULL,
  `IS2013` float DEFAULT NULL,
  `IS2014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksis31`
--

CREATE TABLE IF NOT EXISTS `marksis31` (
  `Stu_id` varchar(15) NOT NULL,
  `IS3001` float DEFAULT NULL,
  `IS3002` float DEFAULT NULL,
  `IS3003` float DEFAULT NULL,
  `IS3004` float DEFAULT NULL,
  `IS3005` float DEFAULT NULL,
  `IS3006` float DEFAULT NULL,
  `IS3007` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `marksis32`
--

CREATE TABLE IF NOT EXISTS `marksis32` (
  `Stu_id` varchar(15) NOT NULL,
  `IS3008` float DEFAULT NULL,
  `IS3009` float DEFAULT NULL,
  `IS3010` float DEFAULT NULL,
  `IS3011` float DEFAULT NULL,
  `IS3012` float DEFAULT NULL,
  `IS3013` float DEFAULT NULL,
  `IS3014` float DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE IF NOT EXISTS `staff` (
  `ID` varchar(15) NOT NULL,
  `Faculty` varchar(20) NOT NULL,
  `Course` varchar(20) NOT NULL,
  `Type` varchar(15) NOT NULL,
  `NIC` varchar(12) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Gender` varchar(8) NOT NULL,
  `MobileNo` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Description` varchar(250) NOT NULL,
  `RegisteredDate` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`ID`, `Faculty`, `Course`, `Type`, `NIC`, `FullName`, `Address`, `Gender`, `MobileNo`, `Email`, `Description`, `RegisteredDate`) VALUES
('L/BM/001', 'School Of Business', 'Business Management', 'Lecturer', '761203454v', 'L K Jayaratne', 'Galle road Colombo 06', 'Male', '0785472541', 'jaye@gmail.com', 'Bsc Computer Science UCSC', 'Jun 30, 2018');

-- --------------------------------------------------------

--
-- Table structure for table `studentsug`
--

CREATE TABLE IF NOT EXISTS `studentsug` (
  `Stu_id` varchar(15) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `Faculty` varchar(30) NOT NULL,
  `Course` varchar(30) NOT NULL,
  `NIC` varchar(12) NOT NULL,
  `BirthDay` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `MobileNo` varchar(12) NOT NULL,
  `Nationality` varchar(20) NOT NULL,
  `EducationLevel` varchar(15) NOT NULL,
  `RegisteredDate` varchar(20) NOT NULL,
  `Year` varchar(5) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `studentsug`
--

INSERT INTO `studentsug` (`Stu_id`, `FullName`, `Faculty`, `Course`, `NIC`, `BirthDay`, `Address`, `Gender`, `MobileNo`, `Nationality`, `EducationLevel`, `RegisteredDate`, `Year`, `email`) VALUES
('2016/BM/001', 'K.P Soyza', 'School Of Business', 'Business Management', '931205412v', 'Apr 29, 1993', 'Waththala Hendala', 'Male', '0751214211', 'Sinhalese', 'G.C.E A/L', 'Jun 25, 2018', '3rd', 'soyza@gmail.com'),
('2017/BM/001', 'S.W Ekanayake', 'School Of Business', 'Business Management', '941703720v', 'Jun 18, 1994', 'Galle road, Colombo 06', 'Male', '0711459874', 'Sinhalese', 'G.C.E A/L', 'Jun 25, 2018', '2nd', 'pasanEkanayake@gmail.com'),
('2017/IS/001', 'Isuru Dilhan', 'School Of Computing', 'Information System', '961805142v', 'Jun 28, 1996', 'Ratnapura', 'Male', '0711451274', 'Sinhalese', 'G.C.E A/L', 'Jun 30, 2018', '2nd', 'isuru@gmail.com'),
('2018/BA/001', 'P.M.D Perera', 'School Of Business', 'Business Analysis', '951703190v', 'Jun 18, 1995', 'Madapatha,Piliyandala', 'female', '0711451215', 'Sinhalese', 'G.C.E O/L', 'Jun 23, 2018', '2nd', 'perera@gmail.com'),
('2018/BA/002', 'C.W Maldeniya', 'School Of Business', 'Business Analysis', '951025417v', 'Apr 11, 1995', 'Malambe, Battaramulla', 'female', '0712102102', 'Sinhalese', 'G.C.E A/L', 'Jun 25, 2018', '1st', 'maldeniya@gmail.com'),
('2018/BM/001', 'K.Bandaranayake', 'School Of Business', 'Business Management', '961703187v', 'Jun 18, 1996', 'kurunegala,Kuliyapitiya', 'Male', '0765581023', 'Sinhalese', 'G.C.E A/L', 'Jun 24, 2018', '1st', 'bandaranayakeIsuru@gmail.com'),
('2018/CS/001', 'A.H.V Darshana', 'School Of Computing', 'Computer Science', '961703190v', 'Jan 1, 1997', '63/A Gallewatta,Omalpe', 'Male', '0711491219', 'Sinhalese', 'G.C.E A/L', 'Jun 24, 2018', '1st', 'haseeamarathunga@gmail.com'),
('2018/EE/001', 'S.S Mahagama', 'School Of Engineering', 'Electronic Engineering', '951478541v', 'May 26, 1995', 'Ibbagamuwa,Kurunegala', 'Male', '0711253214', 'Tamilian', 'G.C.E A/L', 'Jun 23, 2018', '1st', 'mahagama@gmail.com'),
('2018/IS/001', 'B.H.H De Silva', 'School Of Computing', 'Information System', '9617215478v', 'Jun 20, 1996', 'Welimada,Bandarawela', 'Male', '0711487541', 'Sinhalese', 'G.C.E A/L', 'Jun 23, 2018', '1st', 'silva@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `subjectssem1`
--

CREATE TABLE IF NOT EXISTS `subjectssem1` (
  `Stu_id` varchar(15) NOT NULL,
  `Year` varchar(5) DEFAULT NULL,
  `Sem` varchar(5) DEFAULT NULL,
  `Sub1` varchar(10) NOT NULL,
  `Sub2` varchar(10) NOT NULL,
  `Sub3` varchar(10) NOT NULL,
  `Sub4` varchar(10) NOT NULL,
  PRIMARY KEY (`Stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subjectssem1`
--

INSERT INTO `subjectssem1` (`Stu_id`, `Year`, `Sem`, `Sub1`, `Sub2`, `Sub3`, `Sub4`) VALUES
('2016/BM/001', '3rd', '1st', 'BM3001', 'BM3002', 'BM3005', 'BM3006'),
('2017/BM/001', '2nd', '1st', 'BM2001', 'BM2002', 'BM2004', 'BM2006'),
('2017/IS/001', '2nd', '1st', 'IS2001', 'IS2002', 'IS2003', 'IS2006'),
('2018/BA/002', '1st', '1st', 'BA1001', 'BA1002', 'BA1004', 'BA1006'),
('2018/BM/001', '1st', '1st', 'BM1001', 'BM1002', 'BM1005', 'BM1007'),
('2018/CS/001', '1st', '1st', 'CS1001', 'CS1002', 'CS1003', 'CS1006'),
('2018/EE/001', '1st', '1st', 'EE1001', 'EE1002', 'EE1003', 'EE1006'),
('2018/IS/001', '1st', '1st', 'IS1001', 'IS1002', 'IS1004', 'IS1006');

-- --------------------------------------------------------

--
-- Table structure for table `timetableug`
--

CREATE TABLE IF NOT EXISTS `timetableug` (
  `course` varchar(30) NOT NULL DEFAULT '',
  `year` char(3) NOT NULL,
  `sem` char(3) NOT NULL,
  `time` varchar(10) NOT NULL,
  `monday` varchar(30) NOT NULL,
  `tuesday` varchar(30) NOT NULL,
  `wednesday` varchar(30) NOT NULL,
  `thursday` varchar(30) NOT NULL,
  `friday` varchar(30) NOT NULL,
  PRIMARY KEY (`course`,`year`,`sem`,`time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `timetableug`
--

INSERT INTO `timetableug` (`course`, `year`, `sem`, `time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
('Business Analysis', '1st', '1st', '8-10', 'BA1001 (LAB A Hall)', 'BA1003 (w002 Hall)', 'None (None Hall)', 'None (None Hall)', 'BA1004 (A01 Hall)'),
('Business Management', '1st', '1st', '1-3', 'BM1001 (w001 Hall)', 'BM1002 (MiniAudi Hall)', 'None (None Hall)', 'None (None Hall)', 'None (None Hall)'),
('Business Management', '1st', '1st', '10-12', 'BM1003 (LAB C Hall)', 'BM1003 (w002 Hall)', 'None (None Hall)', 'BM1003 (w002 Hall)', 'None (None Hall)'),
('Business Management', '1st', '1st', '3-5', 'BM1003 (MiniAudi Hall)', 'BM1001 (MiniAudi Hall)', 'BM1004 (w002 Hall)', 'BM1006 (w001 Hall)', 'BM1007 (w002 Hall)'),
('Business Management', '1st', '1st', '8-10', 'BM1001 (MiniAudi Hall)', 'BM1003 (w001 Hall)', 'BM1001 (MiniAudi Hall)', 'BM1004 (A01 Hall)', 'None (None Hall)');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `lecsub`
--
ALTER TABLE `lecsub`
  ADD CONSTRAINT `lecsub_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `staff` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksba11`
--
ALTER TABLE `marksba11`
  ADD CONSTRAINT `marksba11_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksba12`
--
ALTER TABLE `marksba12`
  ADD CONSTRAINT `marksba12_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksba21`
--
ALTER TABLE `marksba21`
  ADD CONSTRAINT `marksba21_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksba22`
--
ALTER TABLE `marksba22`
  ADD CONSTRAINT `marksba22_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksba31`
--
ALTER TABLE `marksba31`
  ADD CONSTRAINT `marksba31_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksba32`
--
ALTER TABLE `marksba32`
  ADD CONSTRAINT `marksba32_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksbm11`
--
ALTER TABLE `marksbm11`
  ADD CONSTRAINT `marksbm11_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksbm12`
--
ALTER TABLE `marksbm12`
  ADD CONSTRAINT `marksbm12_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksbm21`
--
ALTER TABLE `marksbm21`
  ADD CONSTRAINT `marksbm21_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksbm22`
--
ALTER TABLE `marksbm22`
  ADD CONSTRAINT `marksbm22_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksbm31`
--
ALTER TABLE `marksbm31`
  ADD CONSTRAINT `marksbm31_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksbm32`
--
ALTER TABLE `marksbm32`
  ADD CONSTRAINT `marksbm32_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksce11`
--
ALTER TABLE `marksce11`
  ADD CONSTRAINT `marksce11_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksce12`
--
ALTER TABLE `marksce12`
  ADD CONSTRAINT `marksce12_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksce21`
--
ALTER TABLE `marksce21`
  ADD CONSTRAINT `marksce21_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksce22`
--
ALTER TABLE `marksce22`
  ADD CONSTRAINT `marksce22_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksce31`
--
ALTER TABLE `marksce31`
  ADD CONSTRAINT `marksce31_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksce32`
--
ALTER TABLE `marksce32`
  ADD CONSTRAINT `marksce32_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `markscs11`
--
ALTER TABLE `markscs11`
  ADD CONSTRAINT `FkStu_id` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `markscs12`
--
ALTER TABLE `markscs12`
  ADD CONSTRAINT `markscs12_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `markscs21`
--
ALTER TABLE `markscs21`
  ADD CONSTRAINT `markscs21_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `markscs22`
--
ALTER TABLE `markscs22`
  ADD CONSTRAINT `markscs22_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `markscs31`
--
ALTER TABLE `markscs31`
  ADD CONSTRAINT `markscs31_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `markscs32`
--
ALTER TABLE `markscs32`
  ADD CONSTRAINT `markscs32_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksee11`
--
ALTER TABLE `marksee11`
  ADD CONSTRAINT `marksee11_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksee12`
--
ALTER TABLE `marksee12`
  ADD CONSTRAINT `marksee12_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksee21`
--
ALTER TABLE `marksee21`
  ADD CONSTRAINT `marksee21_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksee22`
--
ALTER TABLE `marksee22`
  ADD CONSTRAINT `marksee22_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksee31`
--
ALTER TABLE `marksee31`
  ADD CONSTRAINT `marksee31_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksee32`
--
ALTER TABLE `marksee32`
  ADD CONSTRAINT `marksee32_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksis11`
--
ALTER TABLE `marksis11`
  ADD CONSTRAINT `marksis11_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksis12`
--
ALTER TABLE `marksis12`
  ADD CONSTRAINT `marksis12_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksis21`
--
ALTER TABLE `marksis21`
  ADD CONSTRAINT `marksis21_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksis22`
--
ALTER TABLE `marksis22`
  ADD CONSTRAINT `marksis22_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksis31`
--
ALTER TABLE `marksis31`
  ADD CONSTRAINT `marksis31_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `marksis32`
--
ALTER TABLE `marksis32`
  ADD CONSTRAINT `marksis32_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `subjectssem1` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `subjectssem1`
--
ALTER TABLE `subjectssem1`
  ADD CONSTRAINT `subjectssem1_ibfk_1` FOREIGN KEY (`Stu_id`) REFERENCES `studentsug` (`Stu_id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
