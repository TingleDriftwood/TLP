/**
 * 
 */
package gui.menu;

import gui.action.side.KillsListener;
import gui.action.side.ShowListener;
import gui.main.TLP;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

/**
 * @author Tingle Driftwood
 *
 */
public class LogMenu {
	
	private Menu logMenu;
	
	public LogMenu(TLP tlp){
		logMenu = new Menu("Log");
		
		MenuItem showItem = new MenuItem("Show Logfile");
		showItem.setOnAction(new ShowListener(tlp.getBorderPane(), tlp));
		
		MenuItem killsItem = new MenuItem("Kills");
		killsItem.setOnAction(new KillsListener(tlp.getBorderPane(), tlp));
		
		logMenu.getItems().addAll(showItem,killsItem);
	}
	
	public Menu getLogMenu(){
		return logMenu;
	}

}
