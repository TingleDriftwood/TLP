CREATE  TABLE `tlp`.`log` (
  `HashTag` BIGINT NOT NULL ,
  `Character_ID` VARCHAR(45) NULL ,
  `Information` LONGTEXT NOT NULL ,
  PRIMARY KEY (`HashTag`) ,
  UNIQUE INDEX `HashTag_UNIQUE` (`HashTag` ASC) )
COMMENT = 'Table to store initial log file (rare data).';
