/**
 * 
 */
package gui.menuitem;

import gui.action.menu.LoadListener;
import gui.main.TLP;

import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * @author mweigert
 * 
 */
public class LoadItem {

	MenuItem loadItem;

	public LoadItem(BorderPane border, TLP tlp) {
		loadItem = new MenuItem("Load");
		loadItem.setOnAction(new LoadListener(border, tlp));
	}

	public MenuItem getLoadItem() {
		return loadItem;
	}

}
