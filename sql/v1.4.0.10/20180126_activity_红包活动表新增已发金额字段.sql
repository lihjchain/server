alter table eshop_activity.help_redpacket_activity add column `sent_amount` decimal(20,2) DEFAULT NULL COMMENT '已发送金额' after `total_auto_amount`;