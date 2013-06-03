/**
 * 
 */
package tools.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Tingle Driftwood
 * 
 */
public class TestMySQLConnection {

	private static Connection conn = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TOconn = MySQLConnection.getInstance();

		conn = MySQLConnection.getInstance();

		if (conn != null) {
			java.sql.Statement query;
			try {
				query = conn.createStatement();

				String sql = "SELECT race FROM races";
				ResultSet result = query.executeQuery(sql);

				while (result.next()) {
					System.out.println("Rasse: " + result.getString("race"));
				}
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
