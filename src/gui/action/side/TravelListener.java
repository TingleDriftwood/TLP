/**
 * 
 */
package gui.action.side;

import java.util.HashMap;
import java.util.Map;

import tools.van.analyse.TravelHistory;

import gui.main.TLP;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

/**
 * @author Tingle Driftwood
 * 
 */
public class TravelListener implements EventHandler<ActionEvent> {

	private BorderPane border;
	private TLP tlp;
	private Map<Integer, String> log;

	public TravelListener(BorderPane border, TLP tlp) {
		super();
		this.border = border;
		this.tlp = tlp;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 log=tlp.getCLog();
		 String info="";
		 
		 Map<Integer, String> travel = new HashMap<Integer, String>();
		 TravelHistory tHist = new TravelHistory(log);
		 travel = tHist.getTravelHistory();
		 System.out.println("Zone:"+travel.size());
		 
			for (int i = 0; i < travel.size(); i++) {
				if (i > 0) {
					info += "\n";
				}
				info += travel.get(i);
				System.out.println(log.get(i));
			}

			TextArea text = new TextArea(info);
			border.setCenter(text);
	}

}
