alter table eshop_property.bank_account modify column account_number varchar(50) NOT NULL COMMENT '账号';
alter table eshop_property.withdraw_cash modify column account_number varchar(50) DEFAULT NULL COMMENT '账号';