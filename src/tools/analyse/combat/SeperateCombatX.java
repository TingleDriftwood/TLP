/**
 * This class seperate a single combat out of the log to an new Map
 * from which easy some statistic can be done. 
 */
package tools.analyse.combat;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tingle Driftwood
 */
public class SeperateCombatX {

	Map<Integer, String> combatLog;

	public SeperateCombatX(int x, Map<Integer, String> log) {
		combatLog = new HashMap<Integer, String>();
		boolean sw = false;
		int counter = 0;
		int j = 0;
		String line;
		for (int i = 0; i < log.size(); i++) {
			line = log.get(i);
			if (line.equals("You begin autoattacking.")) {
				sw = true;
				counter++;
			}
			if (counter == x && sw) {
				combatLog.put(j, line);
				j++;
			}
			if (line.equals("You stop autoattacking.")) {
				sw = false;
			}
		}
	}

	public Map<Integer, String> getCombatLog() {
		return combatLog;
	}

}
