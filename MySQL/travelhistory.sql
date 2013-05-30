CREATE TABLE `travelhistory` (
  `TimeStamp` datetime NOT NULL COMMENT 'Time stamp from the log file.',
  `Character_ID` varchar(45) NOT NULL COMMENT 'Link to Character table',
  `Game_ID` int(11) DEFAULT NULL COMMENT 'Link to Game table',
  `World` varchar(45) DEFAULT NULL COMMENT 'Name of game world.',
  `Continent` varchar(45) DEFAULT NULL COMMENT 'Name of Continent.',
  `Country` varchar(45) DEFAULT NULL COMMENT 'Name of country.',
  `Region` varchar(45) DEFAULT NULL COMMENT 'Name of region.',
  `Zone` varchar(45) DEFAULT NULL COMMENT 'Name of zone.',
  `Indoor` tinyint(1) DEFAULT NULL COMMENT '0 - outdoor zone; 1 - indoor zone;',
  `Dungeon` tinyint(1) DEFAULT NULL COMMENT '0 - not a dungeon; 1 - dungeon',
  `City` tinyint(1) DEFAULT NULL COMMENT '0 - not a city; 1 - city',
  `Allignment` varchar(45) DEFAULT NULL COMMENT 'Allignment of Zone if there is no allignment then the value will be NULL.',
  PRIMARY KEY (`TimeStamp`),
  KEY `Character` (`Character_ID`),
  KEY `Game` (`Game_ID`) USING HASH
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Used to save the travel history of an character'
