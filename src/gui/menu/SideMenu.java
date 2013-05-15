/**
 * 
 */
package gui.menu;

import gui.action.side.KillsListener;
import gui.action.side.ShowListener;
import gui.main.TLP;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 * @author Tingle Driftwood
 * 
 */
public class SideMenu {

	private VBox side;

	public SideMenu(BorderPane border, TLP tlp) {
		side = new VBox();

		Button showBtn = new Button("Show Log");
		showBtn.setMinWidth(75);
		showBtn.setOnAction(new ShowListener(border, tlp));
		Button killBtn = new Button("Kills");
		killBtn.setMinWidth(75);
		killBtn.setOnAction(new KillsListener(border, tlp));

		side.getChildren().addAll(showBtn, killBtn);
	}

	public VBox getSideMenu() {
		return side;
	}
}
