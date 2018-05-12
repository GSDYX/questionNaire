DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `adminId` int(32) AUTO_INCREMENT,
  `adminname` varchar(50) DEFAULT NULL,
  `adminpwd` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`adminId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` int(32) AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `userpwd` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `activationCode` char(64) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert  into `admin`(`adminname`,`adminpwd`) values ('root','root');
insert  into `user`(`username`,`userpwd`) values ('user','user');

-------------------------------------
-- 权限表结构
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `activationCode` char(64) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `roleName` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `permissionId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `permissionName` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`permissionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `userRoleId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userId` int(10) unsigned DEFAULT NULL,
  `roleId` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`userRoleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `rolePermissionId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `roleId` int(10) unsigned DEFAULT NULL,
  `permissionId` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`rolePermissionId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 表数据
insert  into `user`(`username`,`password`) values ('user','user');
insert  into `user`(`username`,`password`) values ('admin','admin');

INSERT INTO `role`(`roleName`) VALUES ('user');
INSERT INTO `role`(`roleName`) VALUES ('admin');

INSERT INTO `permission` (`permissionName`)VALUES ('item:view');
INSERT INTO `permission` (`permissionName`)VALUES ('item:create');

INSERT INTO `user_role` (`userId`,`roleId`) VALUES ('1', '1');
INSERT INTO `user_role` (`userId`,`roleId`) VALUES ('2', '2');

INSERT INTO `role_permission` (`roleId`,`permissionId`) VALUES ('1', '1');
INSERT INTO `role_permission` (`roleId`,`permissionId`) VALUES ('2', '1');
INSERT INTO `role_permission` (`roleId`,`permissionId`) VALUES ('2', '2');
---------------------------------------------------------------
--问卷调查 大学生网络游戏调查问卷 表
DROP TABLE IF EXISTS `qnOnlineGaming`;

CREATE TABLE `qnOnlineGaming` (
  `qnOnlineGamingId` int(32) AUTO_INCREMENT,
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-------------------------------------------------------
--用户和问卷关系表

DROP TABLE IF EXISTS `user_naire`;
CREATE TABLE `user_naire` (
  `userNaireId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `userId` int(10) unsigned DEFAULT NULL,
  `naireId` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`userNaireId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user_naire VALUE ('1','1','1');
INSERT INTO user_naire VALUE ('2','1','2');
INSERT INTO user_naire VALUE ('3','1','3');
INSERT INTO user_naire VALUE ('4','1','4');

------------------------------------------
--问卷表
DROP TABLE IF EXISTS `naire`;
CREATE TABLE `naire` (
  `naireId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `naireName` CHAR (128) NOT NULL ,
  `naireAdderss` CHAR (128) NOT NULL,
  PRIMARY KEY (`naireId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO naire VALUE ('1','大学生网络游戏调查','/qnOnlineGamingJump');
INSERT INTO naire VALUE ('2','大学生消费情况调查','/qnOnlineGamingJump');
INSERT INTO naire VALUE ('3','大学生就业情况调查','/qnOnlineGamingJump');
INSERT INTO naire VALUE ('4','市场调查','/qnOnlineGamingJump');
INSERT INTO naire VALUE ('5','客户满意度调查','/qnOnlineGamingJump');
INSERT INTO naire VALUE ('6','员工满意度调查','/qnOnlineGamingJump');
INSERT INTO naire VALUE ('7','教育调查','/qnOnlineGamingJump');
INSERT INTO naire VALUE ('8','家庭情况调查','/qnOnlineGamingJump');