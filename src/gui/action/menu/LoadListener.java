/**
 * 
 */
package gui.action.menu;

import java.io.File;

import javax.swing.JFileChooser;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 * @author Tingle Driftwood
 *
 */
public class LoadListener implements EventHandler<javafx.event.ActionEvent> {
	
	private File file;

	public LoadListener(File file){
		super();
		this.file=file;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFileChooser fileChoser = new JFileChooser();
		int returnVal = fileChoser.showOpenDialog(fileChoser);
		if (returnVal==JFileChooser.APPROVE_OPTION)
		{
			file = fileChoser.getSelectedFile();
			System.out.println(file);
		}
	}

}
