/**
 * 
 */
package gui.menu;

import gui.action.side.KillsListener;
import gui.action.side.ShowListener;
import gui.action.side.TravelListener;
import gui.action.side.WriteLogListener;
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

		Button writeLogBtn = new Button("Write Log");
		writeLogBtn.setMinWidth(75);
		writeLogBtn.setOnAction(new WriteLogListener(tlp));

		Button killBtn = new Button("Kills");
		killBtn.setMinWidth(75);
		killBtn.setOnAction(new KillsListener(border, tlp));

		Button travelBtn = new Button("Travel");
		travelBtn.setMinWidth(75);
		travelBtn.setOnAction(new TravelListener(border, tlp));

		side.getChildren().addAll(showBtn, writeLogBtn, killBtn, travelBtn);
	}

	public VBox getSideMenu() {
		return side;
	}
}
