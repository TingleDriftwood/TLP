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
		for (int i = 0; i < clog.size(); i++) {
			line = clog.get(i);
			if (line.startsWith("You have entered")) {
				travelhist.put(nr, "->" + line.substring(17));
				nr++;
			}
			if (line.startsWith("You have left")) {
				travelhist.put(nr, "<-" + line.substring(14));
				nr++;
			}
		}
	}

	public Map<Integer, String> getTravelHistory() {
		return travelhist;
	}
}
