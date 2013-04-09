/**
 * 
 */
package gui.menu;

import javafx.scene.control.Menu;

/**
 * @author Tingle Driftwood
 *
 */
public class FileMenu {
	
	Menu fileMenu;

	public FileMenu() {
		fileMenu = new Menu("File");
	}
	
	public Menu getFileMenu() {
		return fileMenu;
	}
	
}
