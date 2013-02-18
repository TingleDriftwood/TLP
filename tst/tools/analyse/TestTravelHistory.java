/**
 * 
 */
package tools.analyse;

import java.io.File;
import java.util.Map;

import tools.io.LogLoader;
import tools.log.DeleteTimeStamp;

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
				"E:\\Vanguard\\logs\\Chat_log_2013_0214_2013.txt")).getLog();
		Map<Integer, String> clog = new DeleteTimeStamp(log).getClearLog();
		Map<Integer, String> hist = new TravelHistory(clog).getTravelHistory();
		for (int i = 0; i < hist.size(); i++) {
			System.out.println(hist.get(i));
		}
	}

}
