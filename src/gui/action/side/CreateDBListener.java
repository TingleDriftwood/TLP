/**
 * 
 */
package gui.action.side;

import gui.main.TLP;
import tools.db.CreateTables;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Tingle Driftwood
 *
 */
public class CreateDBListener implements EventHandler<ActionEvent>{

	private TLP tlp;
	
	public CreateDBListener(TLP tlp) {
		this.tlp=tlp;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		CreateTables creator = new CreateTables(tlp);
		creator.createLogTable();
//		creator.createRacesTable();
//		creator.createTravelHistoryTable();
		System.out.println("log exist: "+creator.checkExistingTable("log"));
		System.out.println("races exist: "+creator.checkExistingTable("races"));
		System.out.println("travelhistory exist: "+creator.checkExistingTable("travelhistory"));
	}

}
