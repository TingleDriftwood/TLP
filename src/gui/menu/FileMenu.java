/**
 * 
 */
package gui.menu;

import gui.menuitem.ExitItem;
import gui.menuitem.LoadItem;
import gui.menuitem.SaveItem;
import javafx.scene.control.Menu;
import javafx.stage.Stage;

/**
 * @author Tingle Driftwood
 * 
 */
public class FileMenu {

	Menu fileMenu;

	public FileMenu(Stage primaryStage) {
		fileMenu = new Menu("File");

		fileMenu.getItems().addAll(new LoadItem().getLoadItem(),
				new SaveItem().getSaveItem(),
				new ExitItem(primaryStage).getExitItem());
	}

	public Menu getFileMenu() {
		return fileMenu;
	}

}
