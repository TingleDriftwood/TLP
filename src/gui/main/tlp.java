/**
 * Main method of Tingles Log Parser. 
 */
package gui.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Tingle Driftwood
 *
 */
public class TLP extends Application{
	
	private StackPane leftPane;
	private StackPane centerPane;
	private StackPane rightPane;
	private StackPane bottomPane;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Stage win = new Stage();
		win.setTitle("Tingle's Log Parser");
		win.show();
	}

}
