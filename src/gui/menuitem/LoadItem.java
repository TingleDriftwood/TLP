/**
 * 
 */
package gui.menuitem;

import java.io.File;

import gui.action.menu.LoadListener;
import javafx.scene.control.MenuItem;

/**
 * @author Tingle Driftwood
 * 
 */
public class LoadItem {

	private MenuItem loadItem;

	public LoadItem(File file) {
		loadItem = new MenuItem("Load");
		loadItem.setOnAction(new LoadListener(file));
	}

	public MenuItem getLoadItem() {
		return loadItem;
	}

}
