/**
 * 
 */
package gui.action.side;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import gui.main.TLP;
import tools.db.MySQLConnection;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Tingle Driftwood
 * 
 */
public class WriteLogListener implements EventHandler<ActionEvent> {

	private Connection conn;
	private TLP tlp;

	public WriteLogListener(TLP tlp) {
		super();
		this.tlp = tlp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		conn = tlp.getConn();

		Map<Integer, String> log = new HashMap<Integer, String>();
		log = tlp.getLog();
		// System.out.println("Size: "+log.size());

		for (int i = 0; i < log.size(); i++) {
			conn = MySQLConnection.getInstance();

			if (conn != null) {
				java.sql.Statement query;
				String sql = "INSERT INTO `tlp`.`log` (`HashTag`, `Character_ID`, `Information`) VALUES ('"
						+ i + "', '3', '" + log.get(i) + "')";
				// System.out.println(sql);
				try {
					query = conn.createStatement();
					query.execute(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
