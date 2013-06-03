/**
 * 
 */
package tools.db;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Tingle Driftwood
 * 
 */
public class MySQLConnection {

	private static java.sql.Connection conn = null;

	// Host name
	private static String dbHost = "127.0.0.1";

	// Port -- Standard: 3306
	private static String dbPort = "3306";

	// Database name
	private static String database = "tlp";

	// Database user
	private static String dbUser = "Tingle";

	// Database password
	private static String dbPassword = "Driftwood";

	private MySQLConnection() {
		try {
			// Loading database driver
			Class.forName("com.mysql.jdbc.Driver");
			Properties connectionProps = new Properties();

			connectionProps.put("user", "root");
			connectionProps.put("password", "TN82otB$666");

			// Initialise connection to database
			conn = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":"
			          + dbPort + "/" + database + "?" + "user=" + dbUser + "&"
			          + "password=" + dbPassword);
		} catch (ClassNotFoundException e) {
			System.out.println("Database driver not found");
		} catch (SQLException e) {
			System.out.println("Connection not possible");
		}
	}

	public static java.sql.Connection getInstance() {
		if (conn == null) {
			new MySQLConnection();
		}
		return conn;
	}

}
