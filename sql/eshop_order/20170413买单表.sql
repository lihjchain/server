ALTER TABLE pay_order ADD COLUMN `merchant_num` VARCHAR (19) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '商家编号' AFTER `merchant_id`;