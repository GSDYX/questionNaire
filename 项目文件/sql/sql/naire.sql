/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : qn

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-14 07:36:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for naire
-- ----------------------------
DROP TABLE IF EXISTS `naire`;
CREATE TABLE `naire` (
  `naireId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `naireName` char(128) NOT NULL,
  `naireAdderss` char(128) NOT NULL,
  PRIMARY KEY (`naireId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of naire
-- ----------------------------
INSERT INTO `naire` VALUES ('1', '大学生网络游戏调查', '/qnOnlineGamingJump');
INSERT INTO `naire` VALUES ('2', '大学生消费情况调查', '/qnOnlineGamingJump');
INSERT INTO `naire` VALUES ('3', '大学生就业情况调查', '/qnOnlineGamingJump');
INSERT INTO `naire` VALUES ('4', '市场调查', '/qnOnlineGamingJump');
INSERT INTO `naire` VALUES ('5', '客户满意度调查', '/qnOnlineGamingJump');
INSERT INTO `naire` VALUES ('6', '员工满意度调查', '/qnOnlineGamingJump');
INSERT INTO `naire` VALUES ('7', '教育调查', '/qnOnlineGamingJump');
INSERT INTO `naire` VALUES ('8', '家庭情况调查', '/qnOnlineGamingJump');
