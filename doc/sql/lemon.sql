/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : lemon

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-02-07 17:33:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `identify_type` int(5) NOT NULL COMMENT '账号类型,1-平台账号',
  `identifier` varchar(255) NOT NULL COMMENT '登录标识，登录账号',
  `credential` varchar(255) NOT NULL COMMENT '密码凭证',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态标识，0-正常，1-删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户账号信息';

-- ----------------------------
-- Records of t_account
-- ----------------------------
INSERT INTO `t_account` VALUES ('1', '3', '1', 'jianmo_o@163.com', '123456', '2017-02-07 13:56:40', '2017-02-07 13:56:52', '0');
INSERT INTO `t_account` VALUES ('2', '4', '1', 'jianmo_o@163.com', '123456', '2017-02-07 14:00:43', '2017-02-07 14:00:42', '0');
INSERT INTO `t_account` VALUES ('3', '5', '1', 'jianmo_o@163.com', '123456', '2017-02-07 14:00:59', '2017-02-07 14:00:59', '0');
INSERT INTO `t_account` VALUES ('4', '6', '1', 'jianmo_o@163.com', '123456', '2017-02-07 14:01:18', '2017-02-07 14:01:17', '0');
INSERT INTO `t_account` VALUES ('5', '7', '1', 'jianmo_o@163.com', '123456', '2017-02-07 14:03:11', '2017-02-07 14:03:11', '0');
INSERT INTO `t_account` VALUES ('6', '8', '1', 'jianmo_o@163.com', '123456', '2017-02-07 14:03:14', '2017-02-07 14:03:14', '0');

-- ----------------------------
-- Table structure for t_article
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '标题',
  `summary` varchar(400) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '摘要',
  `author` varchar(45) NOT NULL COMMENT '作者',
  `source` varchar(45) NOT NULL COMMENT '文章来源',
  `sort` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `click_no` int(11) NOT NULL DEFAULT '0' COMMENT '点击数',
  `scan_no` int(11) NOT NULL DEFAULT '0' COMMENT '浏览数',
  `comment_no` int(11) NOT NULL DEFAULT '0' COMMENT '评论数',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态标识,0-正常，1-删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章表';

-- ----------------------------
-- Records of t_article
-- ----------------------------

-- ----------------------------
-- Table structure for t_article_content
-- ----------------------------
DROP TABLE IF EXISTS `t_article_content`;
CREATE TABLE `t_article_content` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `article_id` int(11) NOT NULL COMMENT '文章id',
  `content` text COMMENT '文章内容',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章内容表';

-- ----------------------------
-- Records of t_article_content
-- ----------------------------

-- ----------------------------
-- Table structure for t_article_tag
-- ----------------------------
DROP TABLE IF EXISTS `t_article_tag`;
CREATE TABLE `t_article_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `article_id` int(11) NOT NULL,
  `tag_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='文章标签关联表';

-- ----------------------------
-- Records of t_article_tag
-- ----------------------------

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `article_id` int(11) NOT NULL COMMENT '文章id',
  `content` varchar(500) DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `delete_flag` tinyint(4) NOT NULL,
  `status` tinyint(4) NOT NULL,
  `user_head_img` varchar(255) NOT NULL COMMENT '用户头像',
  `user_name` varchar(255) NOT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='评论';

-- ----------------------------
-- Records of t_comment
-- ----------------------------

-- ----------------------------
-- Table structure for t_link
-- ----------------------------
DROP TABLE IF EXISTS `t_link`;
CREATE TABLE `t_link` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `url` varchar(255) NOT NULL COMMENT 'url',
  `describe` varchar(255) DEFAULT NULL COMMENT '连接描述',
  `name` varchar(255) NOT NULL COMMENT '连接名字',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态标识，0-未删除，1-删除',
  `image` varchar(255) DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='链接信息表';

-- ----------------------------
-- Records of t_link
-- ----------------------------

-- ----------------------------
-- Table structure for t_page
-- ----------------------------
DROP TABLE IF EXISTS `t_page`;
CREATE TABLE `t_page` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `url` varchar(45) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `sort` int(11) NOT NULL COMMENT '排序',
  `parent_id` int(11) NOT NULL COMMENT '父菜单id',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `status` tinyint(4) NOT NULL COMMENT '状态标识，0-正常，1-删除',
  `name` varchar(255) NOT NULL COMMENT '名字',
  `describe` varchar(255) DEFAULT NULL COMMENT '描述',
  `type` int(4) NOT NULL COMMENT '类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='页面资源';

-- ----------------------------
-- Records of t_page
-- ----------------------------

-- ----------------------------
-- Table structure for t_replay
-- ----------------------------
DROP TABLE IF EXISTS `t_replay`;
CREATE TABLE `t_replay` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment_id` int(11) NOT NULL COMMENT '评论id',
  `replay_id` int(11) NOT NULL COMMENT '回复人id',
  `replay_head_img` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `replay_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `content` varchar(255) NOT NULL COMMENT '回复内容',
  `target_name` varchar(255) DEFAULT NULL COMMENT '评论目标名字',
  `target_id` int(11) NOT NULL COMMENT '评论目标id',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `status` tinyint(4) NOT NULL COMMENT '评论状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='回复';

-- ----------------------------
-- Records of t_replay
-- ----------------------------

-- ----------------------------
-- Table structure for t_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_resource`;
CREATE TABLE `t_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `resource` varchar(255) NOT NULL COMMENT '资源字符串',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` int(2) NOT NULL DEFAULT '0' COMMENT '状态标识，0-正常，1-删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源表';

-- ----------------------------
-- Records of t_resource
-- ----------------------------

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(20) NOT NULL COMMENT '角色名字',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '状态标识，0-正常，1-删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of t_role
-- ----------------------------

-- ----------------------------
-- Table structure for t_role_resource
-- ----------------------------
DROP TABLE IF EXISTS `t_role_resource`;
CREATE TABLE `t_role_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `resource_id` int(11) NOT NULL COMMENT '资源id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色资源表';

-- ----------------------------
-- Records of t_role_resource
-- ----------------------------

-- ----------------------------
-- Table structure for t_tag
-- ----------------------------
DROP TABLE IF EXISTS `t_tag`;
CREATE TABLE `t_tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL COMMENT '名字',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态标识,0-正常,1-删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='标签';

-- ----------------------------
-- Records of t_tag
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(255) NOT NULL COMMENT '用户昵称',
  `head_pic` varchar(255) NOT NULL COMMENT '头像',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `email` varchar(255) DEFAULT NULL COMMENT '电子邮件',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态标识，0-正常，1-删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('3', '小明', 'xxxxxxx', '2017-02-07 13:56:39', 'jianmo_o@163.com', '2017-02-07 13:56:40', '0');
INSERT INTO `t_user` VALUES ('4', '小明', 'xxxxxxx', '2017-02-07 14:00:43', 'jianmo_o@163.com', '2017-02-07 14:00:42', '0');
INSERT INTO `t_user` VALUES ('5', '小明', 'xxxxxxx', '2017-02-07 14:00:59', 'jianmo_o@163.com', '2017-02-07 14:00:59', '0');
INSERT INTO `t_user` VALUES ('6', '小明', 'xxxxxxx', '2017-02-07 14:01:17', 'jianmo_o@163.com', '2017-02-07 14:01:17', '0');
INSERT INTO `t_user` VALUES ('7', '小明', 'xxxxxxx', '2017-02-07 14:03:11', 'jianmo_o@163.com', '2017-02-07 14:03:11', '0');
INSERT INTO `t_user` VALUES ('8', '小明', 'xxxxxxx', '2017-02-07 14:03:14', 'jianmo_o@163.com', '2017-02-07 14:03:14', '0');

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户角色关联';

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES ('1', '3', '1');
INSERT INTO `t_user_role` VALUES ('2', '4', '1');
INSERT INTO `t_user_role` VALUES ('3', '5', '1');
INSERT INTO `t_user_role` VALUES ('4', '6', '1');
INSERT INTO `t_user_role` VALUES ('5', '7', '1');
INSERT INTO `t_user_role` VALUES ('6', '8', '1');
