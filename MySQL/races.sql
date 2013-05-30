CREATE TABLE `races` (
  `Race_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Unique race ID for linking with other tables,',
  `Game_ID` int(11) DEFAULT NULL COMMENT 'Link to Game table.',
  `Race` varchar(45) DEFAULT NULL COMMENT 'Name of the race.',
  `Alignment` tinyint(1) DEFAULT NULL COMMENT '0 - Evil Alignment\n1 - Good Alignment\nNULL - Neutral Alignment',
  PRIMARY KEY (`Race_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='Standard information of the Everquest II player races.'