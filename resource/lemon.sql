/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : lemon

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2018-05-13 11:28:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(64) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '标题',
  `author_id` int(11) NOT NULL DEFAULT '0',
  `author_name` varchar(32) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `summary` varchar(500) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '摘要',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '内容',
  `markdown` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'markdown格式',
  `date_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `date_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_delete` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '删除时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for article_tag
-- ----------------------------
DROP TABLE IF EXISTS `article_tag`;
CREATE TABLE `article_tag` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `article_id` int(11) unsigned NOT NULL COMMENT '文章id',
  `tag_id` int(11) unsigned NOT NULL COMMENT ' 标签id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(64) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '' COMMENT '标签名字',
  `color` varchar(7) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '#FFFFFF' COMMENT '标签字体颜色',
  `bg_color` varchar(7) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '#000000' COMMENT '背景颜色',
  `article_number` int(11) unsigned DEFAULT '0' COMMENT '文章数量',
  `date_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `date_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `date_delete` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '删除时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(32) COLLATE utf8mb4_general_ci NOT NULL,
  `nickname` varchar(32) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `password` varchar(64) COLLATE utf8mb4_general_ci NOT NULL,
  `phone` varchar(16) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `email` varchar(64) COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `type` varchar(8) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户类型',
  `date_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `date_delete` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
