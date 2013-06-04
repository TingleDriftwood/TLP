/**
 * 
 */
package gui.menu;

import gui.action.side.WriteLogListener;
import gui.main.TLP;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 * @author Tingle Driftwood
 *
 */
public class DatabaseMenu {
	
	Menu databaseMenu;
	
	public DatabaseMenu(TLP tlp){
		databaseMenu = new Menu("Database");
		
		MenuItem writeItem = new MenuItem("Write");
		writeItem.setOnAction(new WriteLogListener(tlp));
		
		databaseMenu.getItems().addAll(writeItem);
	}
	
	public Menu getDatabaseMenu(){
		return databaseMenu;
	}

}
