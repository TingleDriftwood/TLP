/**
 * 
 */
package gui.main;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import tools.van.log.DeleteTimeStamp;

import gui.menu.DatabaseMenu;
import gui.menu.FileMenu;
import gui.menu.LogMenu;
import gui.menu.SideMenu;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

/**
 * @author Tingle Driftwood
 * 
 */
public class TLP extends Application {

	private BorderPane border;
	private Map<Integer, String> log;
	private Map<Integer, String> clog;
	private Connection conn;

	private Stage primaryStage;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		conn = null;

		this.primaryStage = primaryStage;
		border = new BorderPane();
		log = new HashMap<Integer, String>();

		MenuBar menu = new MenuBar();
		menu.getMenus().addAll(new FileMenu(this.primaryStage, this).getFileMenu(), new LogMenu(this).getLogMenu(),
				new DatabaseMenu(this).getDatabaseMenu());

		SideMenu side = new SideMenu(border, this);

		border.setTop(menu);
		border.setLeft(side.getSideMenu());

		Scene scene = new Scene(border);

		primaryStage.setTitle("Tingle's Log Parser");
		primaryStage.setScene(scene);
		primaryStage.setHeight(300);
		primaryStage.show();
	}

	public Map<Integer, String> getLog() {
		return log;
	}

	public void setLog(Map<Integer, String> log) {
		this.log = log;
	}

	public Map<Integer, String> getCLog() {
		clog = new DeleteTimeStamp(log).getClearLog();
		return clog;
	}

	public BorderPane getBorderPane() {
		return border;
	}

	public Connection getConn() {
		return conn;
	}

}
