/**
 * 
 */
package tools.db;

import gui.main.TLP;
import gui.window.Message;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Tingle Driftwood
 * 
 */
public class CreateTables {

	private Connection conn;
	private TLP tlp;
	private Statement query;

	public CreateTables(TLP tlp) {
		this.tlp = tlp;
		conn = this.tlp.getConn();
		conn = MySQLConnection.getInstance();
	}

	public boolean checkExistingTable(String table) {
		boolean exist = false;
		try {
			query = conn.createStatement();
			ResultSet rs = query
					.executeQuery("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA='tlp'");
			while (rs.next())
				if (table.equals(rs.getString("TABLE_NAME")))
					exist = true;
			rs.close();
			query.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exist;
	}

	public void createLogTable() {

		Message message = new Message();
		if (checkExistingTable("log")) {
			message.showInformationMessage("Table allready exist, do you wanna delete all data in table?");
//			message.showInformationMessage("Table log allready exists");
		} else if (conn != null) {
			String sql = "CREATE  TABLE `tlp`. `log` (`HashTag` BIGINT NOT NULL , `Character_ID` VARCHAR(45) NULL , `Information` LONGTEXT NOT NULL , PRIMARY KEY (`HashTag`) , UNIQUE INDEX `HashTag_UNIQUE` (`HashTag` ASC) ) COMMENT = 'Table to store initial log file (rare data).'";
			try {
				query = conn.createStatement();
				query.execute(sql);
				query.close();
				message.showInformationMessage("Table: log in database: tlp generated");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void createRacesTable() {
		if (conn != null) {
			String sql = "CREATE TABLE `races` (`Race_ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Unique race ID for linking with other tables,', `Game_ID` int(11) DEFAULT NULL COMMENT 'Link to Game table.', `Race` varchar(45) DEFAULT NULL COMMENT 'Name of the race.', `Alignment` tinyint(1) DEFAULT NULL COMMENT '0 - Evil Alignment\n1 - Good Alignment\nNULL - Neutral Alignment', PRIMARY KEY (`Race_ID`)) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='Standard information of the Everquest II player races.'";
			try {
				query = conn.createStatement();
				query.execute(sql);
				query.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		Message message = new Message();
		message.showInformationMessage("Table: races in database: tlp generated");
	}

	public void createTravelHistoryTable() {
		if (conn != null) {
			String sql = "CREATE TABLE `travelhistory` (`TimeStamp` datetime NOT NULL COMMENT 'Time stamp from the log file.', `Character_ID` varchar(45) NOT NULL COMMENT 'Link to Character table', `Game_ID` int(11) DEFAULT NULL COMMENT 'Link to Game table', `World` varchar(45) DEFAULT NULL COMMENT 'Name of game world.', `Continent` varchar(45) DEFAULT NULL COMMENT 'Name of Continent.', `Country` varchar(45) DEFAULT NULL COMMENT 'Name of country.', `Region` varchar(45) DEFAULT NULL COMMENT 'Name of region.', `Zone` varchar(45) DEFAULT NULL COMMENT 'Name of zone.', `Indoor` tinyint(1) DEFAULT NULL COMMENT '0 - outdoor zone; 1 - indoor zone;', `Dungeon` tinyint(1) DEFAULT NULL COMMENT '0 - not a dungeon; 1 - dungeon', `City` tinyint(1) DEFAULT NULL COMMENT '0 - not a city; 1 - city', `Allignment` varchar(45) DEFAULT NULL COMMENT 'Allignment of Zone if there is no allignment then the value will be NULL.', PRIMARY KEY (`TimeStamp`), KEY `Character` (`Character_ID`), KEY `Game` (`Game_ID`) USING HASH) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Used to save the travel history of an character'";
			try {
				query = conn.createStatement();
				query.execute(sql);
				query.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		Message message = new Message();
		message.showInformationMessage("Table: travelhistory in database: tlp generated");
	}
}