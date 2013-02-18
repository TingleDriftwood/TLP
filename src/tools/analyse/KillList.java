/**
 * This class generates an list of Mobs slain by player.
 */
package tools.analyse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tingle Driftwood
 * 
 */
public class KillList {

	Map<Integer, String> killList;

	public KillList(Map<Integer, String> clog) {
		killList = new HashMap<Integer, String>();
		String line;
		int nr = 0;
		for (int i = 0; i < clog.size(); i++) {
			line = clog.get(i);
			if (line.startsWith("You have slain")) {
				killList.put(nr, line.substring(15, line.length() - 1));
				nr++;
			}
		}
	}

	public Map<Integer, String> GetKillList() {
		return killList;
	}

}
