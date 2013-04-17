/**
 * 
 */
package gui.menu;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

/**
 * @author Tingle Driftwood
 *
 */
public class MainMenu {
	
	MenuBar bar;

	public MainMenu() {
		bar = new MenuBar();
		
	}
	
	public MenuBar getMenuBar() {
		return bar;
	}
	
	public void addMenu(Menu menu){
		bar.getMenus().add(menu);
	}
	
}
