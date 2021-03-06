/**
 * 
 */
package tools.analyse;

import java.io.File;
import java.util.Map;

import tools.io.LogLoader;
import tools.van.analyse.TravelHistory;

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
		Map<Integer, String> clog = new LogLoader(new File(
				"log/Demo01_log.txt")).getLog();
		//Map<Integer, String> clog = new DeleteTimeStamp(log).getClearLog();
		Map<Integer, String> hist = new TravelHistory(clog).getTravelHistory();
		for (int i = 0; i < hist.size(); i++) {
			System.out.println(hist.get(i));
		}
	}

}
