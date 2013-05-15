/**
 * 
 */
package gui.action.side;

import gui.main.TLP;

import java.util.HashMap;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Tingle Driftwood
 * 
 */
public class ShowListener implements EventHandler<ActionEvent> {

	private TLP tlp;
	private Map<Integer, String> log;
	private BorderPane border;

	public ShowListener(BorderPane border, TLP tlp) {
		super();
		this.border = border;
		this.tlp = tlp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String info = new String();
		log = new HashMap<Integer, String>();
		log = tlp.getLog();

		for (int i = 0; i < log.size(); i++) {
			if (i > 0) {
				info += "\n";
			}
			info += log.get(i);
		}

		TextArea text = new TextArea(info);
		border.setCenter(text);
	}

}
