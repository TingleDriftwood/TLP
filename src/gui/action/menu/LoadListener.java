/**
 * 
 */
package gui.action.menu;

import gui.main.TLP;

import java.io.File;

import tools.analyse.CheckKindOfLog;
import tools.io.LogLoader;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

/**
 * @author Tingle Driftwood
 * 
 */
public class LoadListener implements EventHandler<ActionEvent> {

	private BorderPane border = new BorderPane();
	private TLP tlp;

	public LoadListener(BorderPane border, TLP tlp) {
		super();
		this.border = border;
		this.tlp = tlp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		FileChooser fc = new FileChooser();

		File file = fc.showOpenDialog(null);

		LogLoader loader = new LogLoader(file);
		
		tlp.setLog(loader.getLog());
		
		HBox hBox = new HBox();
		
		Text logType = new Text(new CheckKindOfLog(file.getName()).getKindOfLog()+"  ");
		logType.setFill(Color.DARKRED);
		logType.setFont(Font.font("Arial", FontWeight.BOLD,12));
		
		Text text = new Text("Actual file: " + file.getPath());
		text.setFill(Color.BLUE);
		text.setFont(Font.font("Arial", FontPosture.ITALIC, 12));

		hBox.getChildren().addAll(logType, text);
		
		border.setBottom(hBox);
	}

}
