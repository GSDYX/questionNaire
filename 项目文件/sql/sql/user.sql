/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : qn

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-14 07:37:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `activationCode` char(64) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'user', 'user', null, null, null);
INSERT INTO `user` VALUES ('2', 'admin', 'admin', null, null, null);
INSERT INTO `user` VALUES ('4', 'c', 'c', null, null, null);
INSERT INTO `user` VALUES ('5', 'd', 'd', null, null, null);
INSERT INTO `user` VALUES ('6', 'e', 'e', null, null, null);
INSERT INTO `user` VALUES ('7', 'f', 'f', null, null, null);
INSERT INTO `user` VALUES ('8', 'g', 'g', null, null, null);
INSERT INTO `user` VALUES ('10', 'i', 'i', null, null, null);
INSERT INTO `user` VALUES ('11', 'j', 'j', null, null, null);
INSERT INTO `user` VALUES ('12', 'k', 'k', null, null, null);
INSERT INTO `user` VALUES ('13', 'm', 'm', null, null, null);
INSERT INTO `user` VALUES ('14', 'l', 'l', null, null, null);
INSERT INTO `user` VALUES ('15', 'o', 'o', null, null, null);
INSERT INTO `user` VALUES ('16', 'p', 'p', null, null, null);
INSERT INTO `user` VALUES ('17', 'q', 'q', null, null, null);
INSERT INTO `user` VALUES ('18', 'r', 'r', null, null, null);
INSERT INTO `user` VALUES ('19', 's', 's', null, null, null);
INSERT INTO `user` VALUES ('20', 't', 't', null, null, null);
INSERT INTO `user` VALUES ('21', '1', '1', null, null, null);
INSERT INTO `user` VALUES ('22', '12', '123', null, null, null);
INSERT INTO `user` VALUES ('24', 'aaaaa', 'aaaaa', null, null, null);
INSERT INTO `user` VALUES ('25', 'ddddd', '1232', null, null, null);
INSERT INTO `user` VALUES ('26', '21312', '31231', null, null, null);
INSERT INTO `user` VALUES ('27', '2131231', '12321321', null, null, null);
INSERT INTO `user` VALUES ('28', '32131', '123123', null, null, null);
INSERT INTO `user` VALUES ('29', 'ewqe', 'wqeqwe', null, null, null);
