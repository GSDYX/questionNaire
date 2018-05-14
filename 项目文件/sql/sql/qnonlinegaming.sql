/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : qn

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-14 07:37:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for qnonlinegaming
-- ----------------------------
DROP TABLE IF EXISTS `qnonlinegaming`;
CREATE TABLE `qnonlinegaming` (
  `qnOnlineGamingId` int(32) NOT NULL AUTO_INCREMENT,
  `sex` int(16) NOT NULL,
  `grade` int(16) NOT NULL,
  `times` int(16) NOT NULL,
  `relax` int(16) NOT NULL,
  `attract` char(16) NOT NULL,
  `hours` int(16) NOT NULL,
  `pressure` int(16) NOT NULL,
  `vent` int(16) NOT NULL,
  `confidence` int(16) NOT NULL,
  `lonely` int(16) NOT NULL,
  `forecast` int(16) NOT NULL,
  `stop` char(16) NOT NULL,
  PRIMARY KEY (`qnOnlineGamingId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qnonlinegaming
-- ----------------------------
INSERT INTO `qnonlinegaming` VALUES ('1', '2', '2', '1', '3', '2,3,4,7', '2', '2', '3', '1', '2', '3', '1,4,5');
INSERT INTO `qnonlinegaming` VALUES ('2', '2', '2', '1', '3', '2,3,4,7', '2', '2', '3', '1', '2', '3', '1,4,5');
INSERT INTO `qnonlinegaming` VALUES ('3', '2', '1', '2', '2', '2,3,4', '1', '2', '2', '1', '2', '2', '4,5');
