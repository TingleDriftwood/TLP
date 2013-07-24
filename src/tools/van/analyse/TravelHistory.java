/**
 * Class generates an map which holds the travel history.
 */
package tools.van.analyse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tingle Driftwood
 * 
 */
public class TravelHistory {

	public Map<Integer, String> travelhist;

	public TravelHistory(Map<Integer, String> clog) {
		travelhist = new HashMap<Integer, String>();
		int nr = 0;
		String line;
		System.out.println("Size of CLog: "+clog.size());
		for (int i = 0; i < clog.size(); i++) {
			line = clog.get(i);
			System.out.println(line);
			if (line.indexOf("You have entered")!=-1) {
			//if (line.startsWith("You have entered")) {
				travelhist.put(nr, "->" + line.substring(17));
				nr++;
				System.out.println(line);
			}
			if (line.startsWith("You have left")) {
				travelhist.put(nr, "<-" + line.substring(14));
				nr++;
				System.out.println(line);
			}
		}
	}

	public Map<Integer, String> getTravelHistory() {
		return travelhist;
	}
}
