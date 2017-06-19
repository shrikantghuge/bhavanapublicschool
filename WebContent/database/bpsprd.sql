-- --------------------------------------------------------
-- Host:                         162.222.226.38
-- Server version:               5.5.53-38.5-log - Percona Server (GPL), Release 38.5, Revision 71794d3
-- Server OS:                    Linux
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for bhavaae3_bpsprd
DROP DATABASE IF EXISTS `bhavaae3_bpsprd`;
CREATE DATABASE IF NOT EXISTS `bhavaae3_bpsprd` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bhavaae3_bpsprd`;


-- Dumping structure for table bhavaae3_bpsprd.facilities
DROP TABLE IF EXISTS `facilities`;
CREATE TABLE IF NOT EXISTS `facilities` (
  `type` varchar(50) DEFAULT NULL,
  `title` varchar(100) DEFAULT NULL,
  `imageurl` varchar(100) DEFAULT NULL,
  `description` varchar(5000) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table bhavaae3_bpsprd.facilities: 0 rows
DELETE FROM `facilities`;
/*!40000 ALTER TABLE `facilities` DISABLE KEYS */;
/*!40000 ALTER TABLE `facilities` ENABLE KEYS */;


-- Dumping structure for table bhavaae3_bpsprd.images
DROP TABLE IF EXISTS `images`;
CREATE TABLE IF NOT EXISTS `images` (
  `type` varchar(50) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `desc` varchar(500) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='all required images';

-- Dumping data for table bhavaae3_bpsprd.images: 4 rows
DELETE FROM `images`;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
INSERT INTO `images` (`type`, `name`, `url`, `desc`) VALUES
	('SLIDER', NULL, 'images/slider/toystory.jpg', 'Independence Day Celebration'),
	('SLIDER', NULL, 'images/slider/up.jpg', 'School Tour'),
	('SLIDER', NULL, 'images/slider/walle.jpg', ''),
	('SLIDER', NULL, 'images/slider/nemo.jpg', 'Entertainment at School');
/*!40000 ALTER TABLE `images` ENABLE KEYS */;


-- Dumping structure for table bhavaae3_bpsprd.newsevents
DROP TABLE IF EXISTS `newsevents`;
CREATE TABLE IF NOT EXISTS `newsevents` (
  `title` varchar(300) DEFAULT NULL,
  `imageurl` varchar(100) DEFAULT NULL,
  `description` varchar(5000) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- Dumping data for table bhavaae3_bpsprd.newsevents: 0 rows
DELETE FROM `newsevents`;
/*!40000 ALTER TABLE `newsevents` DISABLE KEYS */;
/*!40000 ALTER TABLE `newsevents` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
