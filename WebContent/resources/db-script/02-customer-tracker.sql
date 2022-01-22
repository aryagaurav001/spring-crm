CREATE DATABASE  IF NOT EXISTS `crm`;
USE `crm`;

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

LOCK TABLES `customer` WRITE;

INSERT INTO `customer` VALUES 
	(1,'Gaurav','Arya','gaurav@aryasolutions.com'),
	(2,'Rimpi','Arya','rimpi@aryasolutions.com'),
	(3,'Dishita','Arya','dishita@aryasolutions.com'),
	(4,'Dhananjay','Arya','dhananjay@aryasolutions.com'),
	(5,'Tanisha','Rajput','tanisha@aryasolutions.com');
    
UNLOCK TABLES;