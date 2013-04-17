/**
 * Main method of Tingles Log Parser. 
 */
package gui.main;

import gui.menu.FileMenu;
import gui.menu.MainMenu;

import java.io.File;
import java.util.Map;

import tools.io.LogLoader;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Tingle Driftwood
 * 
 */
public class TLP extends Application {

	private BorderPane border;

	private StackPane leftPane;
	private StackPane centerPane;
	private StackPane rightPane;
	private StackPane bottomPane;

	private Stage win;

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
		win = new Stage();
		win.setTitle("Tingle's Log Parser");

		border = new BorderPane();

		// Start of demo section
		LogLoader log = new LogLoader(new File("log/Demo01_log.txt"));
		Map<Integer, String> map = log.getLog();

		String str = new String();

		for (int i = 0; i < map.size(); i++) {
			if (i > 0) {
				str += "\n";
			}
			str += map.get(i);
		}
		TextArea tf = new TextArea(str);
		border.setCenter(tf);
		// End of demo section

		File file = new File("");
		
		// Define and set the menu bar
		MainMenu menu = new MainMenu();
		menu.addMenu(new FileMenu(win, file).getFileMenu());

		MenuBar menuBar = new MenuBar();
		menuBar = menu.getMenuBar();

		border.setTop(menuBar);

		win.setScene(new Scene(border));
		win.show();
	}

	public void setLeftPane(StackPane leftPane) {
		this.leftPane = leftPane;
		border.setLeft(this.leftPane);
		win.sizeToScene();
		win.show();
	}

	public void setCenterPane(StackPane centerPane) {
		this.centerPane = centerPane;
		border.setCenter(this.centerPane);
		win.sizeToScene();
		win.show();
	}

	public void setRightPane(StackPane rightPane) {
		this.rightPane = rightPane;
		border.setRight(this.rightPane);
		win.sizeToScene();
		win.show();
	}

	public void setBottomPane(StackPane bottomPane) {
		this.bottomPane = bottomPane;
		border.setBottom(this.bottomPane);
		win.sizeToScene();
		win.show();
	}
}
