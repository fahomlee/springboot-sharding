-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        8.0.15 - MySQL Community Server - GPL
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.3.0.4984
-- --------------------------------------------------------


-- 导出 testdb0 的数据库结构
CREATE DATABASE IF NOT EXISTS `testdb0` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `testdb0`;


-- 导出  表 testdb0.t_order0 结构
CREATE TABLE IF NOT EXISTS `t_order0` (
  `order_id` varchar(50) NOT NULL COMMENT '主键ID',
  `user_id` varchar(50) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- 正在导出表  testdb0.t_order0 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `t_order0` DISABLE KEYS */;
INSERT INTO `t_order0` (`order_id`, `user_id`) VALUES
	('2', '2'),
	('4', '4');
/*!40000 ALTER TABLE `t_order0` ENABLE KEYS */;


-- 导出  表 testdb0.t_order1 结构
CREATE TABLE IF NOT EXISTS `t_order1` (
  `order_id` varchar(50) NOT NULL COMMENT '主键ID',
  `user_id` varchar(50) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



-- 导出  表 testdb0.t_order_item0 结构
CREATE TABLE IF NOT EXISTS `t_order_item0` (
  `order_item_id` varchar(50) NOT NULL COMMENT '主键',
  `order_id` varchar(50) NOT NULL COMMENT '订单ID',
  `user_id` varchar(50) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



-- 导出  表 testdb0.t_order_item1 结构
CREATE TABLE IF NOT EXISTS `t_order_item1` (
  `order_item_id` varchar(50) NOT NULL COMMENT '主键',
  `order_id` varchar(50) NOT NULL COMMENT '订单ID',
  `user_id` varchar(50) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




-- 导出  表 testdb0.t_user 结构
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` varchar(50) DEFAULT NULL,
  `t_user_id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



-- 导出  表 testdb0.user0 结构
CREATE TABLE IF NOT EXISTS `user0` (
  `id` varchar(50) DEFAULT NULL,
  `user_id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



-- 导出  表 testdb0.user1 结构
CREATE TABLE IF NOT EXISTS `user1` (
  `id` varchar(50) DEFAULT NULL,
  `user_id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;



--**********************数据库2**************************************
--**********************数据库2**************************************


-- 导出 testdb1 的数据库结构
CREATE DATABASE IF NOT EXISTS `testdb1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `testdb1`;


-- 导出  表 testdb1.t_order0 结构
CREATE TABLE IF NOT EXISTS `t_order0` (
  `order_id` varchar(50) NOT NULL COMMENT '主键ID',
  `user_id` varchar(50) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




-- 导出  表 testdb1.t_order1 结构
CREATE TABLE IF NOT EXISTS `t_order1` (
  `order_id` varchar(50) NOT NULL COMMENT '主键ID',
  `user_id` varchar(50) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




-- 导出  表 testdb1.t_order_item0 结构
CREATE TABLE IF NOT EXISTS `t_order_item0` (
  `order_item_id` varchar(50) NOT NULL COMMENT '主键',
  `order_id` varchar(50) NOT NULL COMMENT '订单ID',
  `user_id` varchar(50) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;




-- 导出  表 testdb1.t_order_item1 结构
CREATE TABLE IF NOT EXISTS `t_order_item1` (
  `order_item_id` varchar(50) NOT NULL COMMENT '主键',
  `order_id` varchar(50) NOT NULL COMMENT '订单ID',
  `user_id` varchar(50) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


