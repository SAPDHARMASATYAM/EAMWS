-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.21-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema eadb
--

CREATE DATABASE IF NOT EXISTS eadb;
USE eadb;

--
-- Definition of table `address`
--

DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `addressId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `doorNumber` varchar(45) NOT NULL,
  `street` varchar(100) NOT NULL,
  `locality` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `town` varchar(100) NOT NULL,
  `state` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  `pincode` varchar(6) NOT NULL,
  PRIMARY KEY (`addressId`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `address`
--

/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


--
-- Definition of table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `courseId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nameInEnglish` varchar(100) NOT NULL,
  `nameInRegional` varchar(100) NOT NULL,
  `numberOfModelPapers` tinyint(3) unsigned NOT NULL,
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`courseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course`
--

/*!40000 ALTER TABLE `course` DISABLE KEYS */;
/*!40000 ALTER TABLE `course` ENABLE KEYS */;


--
-- Definition of table `inistitute_courses`
--

DROP TABLE IF EXISTS `inistitute_courses`;
CREATE TABLE `inistitute_courses` (
  `inistituteId` int(10) unsigned NOT NULL,
  `courseId` int(10) unsigned NOT NULL,
  `effectieDate` datetime NOT NULL,
  `expireDate` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`inistituteId`,`courseId`) USING BTREE,
  KEY `IC_CI` (`courseId`),
  CONSTRAINT `IC_CI` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseId`),
  CONSTRAINT `IC_II` FOREIGN KEY (`inistituteId`) REFERENCES `institute` (`inistituteId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `inistitute_courses`
--

/*!40000 ALTER TABLE `inistitute_courses` DISABLE KEYS */;
/*!40000 ALTER TABLE `inistitute_courses` ENABLE KEYS */;


--
-- Definition of table `institute`
--

DROP TABLE IF EXISTS `institute`;
CREATE TABLE `institute` (
  `inistituteId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NameInEnglish` varchar(200) NOT NULL,
  `nameInRegional` varchar(200) NOT NULL,
  `addressId` int(10) unsigned NOT NULL,
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`inistituteId`),
  KEY `institute_address` (`nameInRegional`) USING BTREE,
  KEY `FK_institute_address` (`addressId`),
  CONSTRAINT `FK_institute_address` FOREIGN KEY (`addressId`) REFERENCES `address` (`addressId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `institute`
--

/*!40000 ALTER TABLE `institute` DISABLE KEYS */;
/*!40000 ALTER TABLE `institute` ENABLE KEYS */;


--
-- Definition of table `institute_course_student`
--

DROP TABLE IF EXISTS `institute_course_student`;
CREATE TABLE `institute_course_student` (
  `instituteId` int(10) unsigned NOT NULL,
  `courseId` int(10) unsigned NOT NULL,
  `studentId` varchar(100) NOT NULL,
  PRIMARY KEY (`instituteId`,`courseId`,`studentId`),
  KEY `ICS_SI` (`studentId`),
  KEY `ICS_Student_Id` (`instituteId`,`studentId`),
  CONSTRAINT `ICS_II` FOREIGN KEY (`instituteId`, `courseId`) REFERENCES `inistitute_courses` (`inistituteId`, `courseId`),
  CONSTRAINT `ICS_Student_Id` FOREIGN KEY (`instituteId`, `studentId`) REFERENCES `institute_student` (`instituteId`, `studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `institute_course_student`
--

/*!40000 ALTER TABLE `institute_course_student` DISABLE KEYS */;
/*!40000 ALTER TABLE `institute_course_student` ENABLE KEYS */;


--
-- Definition of table `institute_student`
--

DROP TABLE IF EXISTS `institute_student`;
CREATE TABLE `institute_student` (
  `instituteId` int(10) unsigned NOT NULL,
  `studentId` varchar(100) NOT NULL,
  `effectiveDate` datetime NOT NULL,
  `expireDate` datetime NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`instituteId`,`studentId`),
  KEY `student_student` (`studentId`),
  CONSTRAINT `Institute_institute` FOREIGN KEY (`instituteId`) REFERENCES `institute` (`inistituteId`),
  CONSTRAINT `student_student` FOREIGN KEY (`studentId`) REFERENCES `user` (`emailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `institute_student`
--

/*!40000 ALTER TABLE `institute_student` DISABLE KEYS */;
/*!40000 ALTER TABLE `institute_student` ENABLE KEYS */;


--
-- Definition of table `option`
--

DROP TABLE IF EXISTS `option`;
CREATE TABLE `option` (
  `optionId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `optionName` char(1) NOT NULL,
  `optionValueInEnglish` text NOT NULL,
  `optionValueInRegional` text NOT NULL,
  `optionImageInEnglish` blob NOT NULL,
  `optionImageInRegional` blob NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `questionId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`optionId`),
  KEY `Option_Question_Id` (`questionId`),
  CONSTRAINT `Option_Question_Id` FOREIGN KEY (`questionId`) REFERENCES `question` (`questionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `option`
--

/*!40000 ALTER TABLE `option` DISABLE KEYS */;
/*!40000 ALTER TABLE `option` ENABLE KEYS */;


--
-- Definition of table `practice_paper`
--

DROP TABLE IF EXISTS `practice_paper`;
CREATE TABLE `practice_paper` (
  `paperId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `paperNameInEnglish` varchar(100) NOT NULL,
  `paperNameInRegional` varchar(100) NOT NULL,
  `duration` tinyint(3) unsigned NOT NULL,
  `active` tinyint(1) NOT NULL,
  `courseId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`paperId`),
  KEY `PP_CI` (`courseId`),
  CONSTRAINT `PP_CI` FOREIGN KEY (`courseId`) REFERENCES `course` (`courseId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `practice_paper`
--

/*!40000 ALTER TABLE `practice_paper` DISABLE KEYS */;
/*!40000 ALTER TABLE `practice_paper` ENABLE KEYS */;


--
-- Definition of table `question`
--

DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `questionId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `questionInEnglish` text NOT NULL,
  `questionInRegional` text NOT NULL,
  `questionImageInEnglish` blob NOT NULL,
  `questionImageInRegional` blob NOT NULL,
  `numberOfOptions` tinyint(3) unsigned NOT NULL,
  `answer` char(1) NOT NULL,
  `sectionId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`questionId`),
  KEY `Question_Section_Id` (`sectionId`),
  CONSTRAINT `Question_Section_Id` FOREIGN KEY (`sectionId`) REFERENCES `section` (`sectionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `question`
--

/*!40000 ALTER TABLE `question` DISABLE KEYS */;
/*!40000 ALTER TABLE `question` ENABLE KEYS */;


--
-- Definition of table `section`
--

DROP TABLE IF EXISTS `section`;
CREATE TABLE `section` (
  `sectionId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nameInEnglish` varchar(100) NOT NULL,
  `nameInRegional` varchar(100) NOT NULL,
  `numberOfQuestions` tinyint(3) unsigned NOT NULL,
  `active` tinyint(1) NOT NULL,
  `practicePaperId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`sectionId`),
  KEY `Section_PP_ID` (`practicePaperId`),
  CONSTRAINT `Section_PP_ID` FOREIGN KEY (`practicePaperId`) REFERENCES `practice_paper` (`paperId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `section`
--

/*!40000 ALTER TABLE `section` DISABLE KEYS */;
/*!40000 ALTER TABLE `section` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `emailId` varchar(100) NOT NULL,
  `password` varchar(15) NOT NULL,
  `security_question1` varchar(100) NOT NULL,
  `security_answer1` varchar(50) NOT NULL,
  `security_question2` varchar(100) NOT NULL,
  `security_answer2` varchar(50) NOT NULL,
  `dateOfRegistration` datetime NOT NULL,
  `lastLogin` datetime NOT NULL,
  `address` int(10) unsigned NOT NULL,
  `active` tinyint(1) NOT NULL,
  PRIMARY KEY (`emailId`),
  KEY `user_address` (`address`),
  CONSTRAINT `user_address` FOREIGN KEY (`address`) REFERENCES `address` (`addressId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


--
-- Definition of table `user_profile`
--

DROP TABLE IF EXISTS `user_profile`;
CREATE TABLE `user_profile` (
  `emailid` varchar(100) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL,
  KEY `login_user_profile` (`emailid`),
  CONSTRAINT `login_user_profile` FOREIGN KEY (`emailid`) REFERENCES `user` (`emailId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_profile`
--

/*!40000 ALTER TABLE `user_profile` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_profile` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
