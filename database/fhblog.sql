
CREATE TABLE `fh_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL COMMENT '用户名',
  `phone` varchar(32) NOT NULL COMMENT '手机',
  `email` varchar(32) NOT NULL COMMENT '邮箱',
  `password` varchar(32) NOT NULL COMMENT '32位加密密码',
  `type` int(1) DEFAULT b'0' COMMENT '类型(管理员1，用户0....)',
  `sex` int(1) DEFAULT  NULL COMMENT '性别',
  `age` int(1) DEFAULT  NULL COMMENT '年龄',
  `desc` varchar(200) DEFAULT NULL COMMENT '个人简介',
  `hobby` varchar(100) DEFAULT NULL COMMENT '爱好',
  `headImg` varchar(100) DEFAULT NULL COMMENT '头像',
  `status` int(1) DEFAULT NULL COMMENT '状态(启用1，删除0，停用2，冻结3)',
  `created_by` varchar(32) DEFAULT NULL,
  `updated_by` varchar(32) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `fh_article` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL COMMENT 'fh_blog_user.id',
  `title` varchar(100) NOT NULL COMMENT '标题',
  `desc` varchar(1024) DEFAULT NULL COMMENT '概要',
  `content` text COMMENT '内容',
  `coverImg` varchar(100) DEFAULT NULL COMMENT '封面',
  `category_id` varchar(40) DEFAULT NULL COMMENT '类别id',
  `tag_ids` varchar(40) DEFAULT NULL COMMENT '标签id,多个,用,分开',
  `status` int(1) DEFAULT b'0' COMMENT '文章状态：0草稿，1博文',
  `is_top` int(1) DEFAULT b'0' COMMENT '置顶1，加精2，正常0',
  `hits`  int(10) DEFAULT b'0' COMMENT '点击数',
  `is_del` bit(1) DEFAULT b'0' COMMENT '删除',
  `created_by` varchar(32) DEFAULT NULL,
  `updated_by` varchar(32) DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fh_blog_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='文章内容表';

CREATE TABLE `fh_category` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL COMMENT '名称',
  `desc` varchar(256) DEFAULT NULL COMMENT '描述',
  `type` int(1) DEFAULT NULL COMMENT '类型(1分类,2标签)',
  `is_del` int(1) DEFAULT b'0' COMMENT '状态，0正常,1删除',
  `weight` int(6) DEFAULT b'1000' COMMENT '权重（从大到小)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='文章分类表';

CREATE TABLE `fh_comments` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `article_id`  bigint(20) DEFAULT  NULL COMMENT 'fh_article.id',
  `user_id`  bigint(20) DEFAULT  NULL COMMENT 'fh_user.id',
  `block_id` int(6) DEFAULT NULL COMMENT'评论所在位置',
  `pid` bigint(20) DEFAULT  NULL COMMENT '评论父id',
  `content` varchar(600) DEFAULT NULL COMMENT '内容',
  `is_del` bit(1) DEFAULT b'0' COMMENT '状态，0正常,1删除',
  `user_type` int(1) DEFAULT NULL COMMENT '评论类别（1作者，2注册访客，3游客）',
  `ip` varchar(64) DEFAULT NULL COMMENT '访问用户ip',
  `created_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_fh_article_id` (`article_id`),
  KEY `idx_fh_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='文章评论表';
