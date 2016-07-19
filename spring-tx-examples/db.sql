CREATE TABLE `t_goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(200) NOT NULL COMMENT '商品名称',
  `price` double DEFAULT NULL COMMENT '商品价格',
  `start_time` datetime DEFAULT NULL COMMENT '上架时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品信息表';

CREATE TABLE `t_sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `operate_type` varchar(10) DEFAULT NULL COMMENT '操作类型',
  `method` varchar(100) DEFAULT NULL COMMENT '方法',
  `add_time` datetime DEFAULT NULL COMMENT '日志记录时间',
  `content` varchar(500) DEFAULT NULL COMMENT '操作内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统日志表';