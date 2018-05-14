/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : qn

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-14 07:37:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_naire
-- ----------------------------
DROP TABLE IF EXISTS `user_naire`;
CREATE TABLE `user_naire` (
  `userNaireId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userId` int(10) unsigned DEFAULT NULL,
  `naireId` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`userNaireId`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_naire
-- ----------------------------
INSERT INTO `user_naire` VALUES ('1', '1', '1');
INSERT INTO `user_naire` VALUES ('2', '1', '2');
INSERT INTO `user_naire` VALUES ('3', '1', '3');
INSERT INTO `user_naire` VALUES ('5', '1', '2');
INSERT INTO `user_naire` VALUES ('9', '1', '1');
INSERT INTO `user_naire` VALUES ('13', '1', '8');
