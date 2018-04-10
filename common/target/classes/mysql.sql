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
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL,
  `password` varchar(128) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `status` tinyint(1) DEFAULT NULL,
  `activationCode` char(64) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `role_name` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `permission_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `permission_name` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `user_role_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned DEFAULT NULL,
  `role_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `role_permission_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `role_id` int(10) unsigned DEFAULT NULL,
  `permission_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`role_permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 表数据
insert  into `user`(`username`,`password`) values ('user','user');
insert  into `user`(`username`,`password`) values ('admin','admin');

INSERT INTO `role`(`role_name`) VALUES ('user');
INSERT INTO `role`(`role_name`) VALUES ('admin');

INSERT INTO `permission` (`permission_name`)VALUES ('item:view');
INSERT INTO `permission` (`permission_name`)VALUES ('item:create');

INSERT INTO `user_role` (`user_id`,`role_id`) VALUES ('1', '1');
INSERT INTO `user_role` (`user_id`,`role_id`) VALUES ('2', '2');

INSERT INTO `role_permission` (`role_id`,`permission_id`) VALUES ('1', '1');
INSERT INTO `role_permission` (`role_id`,`permission_id`) VALUES ('2', '1');
INSERT INTO `role_permission` (`role_id`,`permission_id`) VALUES ('2', '2');