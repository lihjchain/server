alter table `eshop_mall`.`comment_merchant` add column `is_have_img` tinyint(1) DEFAULT '0' COMMENT '是否存在图片' after status;
alter table `eshop_mall`.`comment_product` add column `is_have_img` tinyint(1) DEFAULT '0' COMMENT '是否存在图片' after status;