alter table product_category add column `is_virtual` tinyint(1) unsigned NOT NULL DEFAULT 0 COMMENT '是否虚拟商品,0否 1是'