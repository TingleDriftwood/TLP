/**
 * Class counts number of fights.
 * Search for:
 * You begin autoattacking.
 * and
 * You stop autoattacking.
 */
package tools.analyse.combat;

import java.util.Map;

/**
 * @author Tingle Driftwood
 * 
 */
public class CombatCounter {

	public int combats;

	public CombatCounter(Map<Integer, String> clog) {
		combats = 0;
		boolean s = false;
		boolean e = false;
		String line;
		for (int i = 0; i < clog.size(); i++) {
			line = clog.get(i);
			if (line.equals("You begin autoattacking.")) {
				s = true;
			}
			if (line.equals("You stop autoattacking.")) {
				e = true;
			}
			if (s && e) {
				combats++;
				s = false;
				e = false;
			}
		}
	}

	public int getCombatCounts() {
		return combats;
	}

}
