ALTER TABLE `eshop_game`.`game_mind_attend_record` MODIFY COLUMN `status` tinyint(2) DEFAULT NULL COMMENT '0-初始化 1-参与成功 2-参与失败 3-游戏成功 4-游戏失败 5-退还' AFTER `attend_star`;
ALTER TABLE `eshop_game`.`game_puzzle_attend_record` MODIFY COLUMN `status` tinyint(2) DEFAULT NULL COMMENT '0-初始化 1-参与成功 2-参与失败 3-游戏成功 4-游戏失败 5-退还' AFTER `attend_star`;