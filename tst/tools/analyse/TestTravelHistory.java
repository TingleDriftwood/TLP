/**
 * 
 */
package tools.analyse;

import java.io.File;
import java.util.Map;

import van.tools.analyse.TravelHistory;
import van.tools.io.LogLoader;
import van.tools.log.DeleteTimeStamp;

/**
 * @author Tingle Driftwood
 * 
 */
public class TestTravelHistory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> log = new LogLoader(new File(
				"log/Demo01_log.txt")).getLog();
		Map<Integer, String> clog = new DeleteTimeStamp(log).getClearLog();
		Map<Integer, String> hist = new TravelHistory(clog).getTravelHistory();
		for (int i = 0; i < hist.size(); i++) {
			System.out.println(hist.get(i));
		}
	}

}
