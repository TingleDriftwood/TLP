/**
 * This class seperate a single combat out of the log to an new Map
 * from which easy some statistic can be done. 
 */
package tools.analyse.combat;

import java.util.Map;

/**
 * @author Tingle Driftwood
 */
public class SeperateCombatX {

	Map<Integer, String> combatLog;

	public SeperateCombatX(int x, Map<Integer, String> log) {
		int counter = 0;
		String line;
		for (int i = 0; i <= log.size(); i++) {
			line = log.get(i);
			if (line.equals("You begin autoattacking.")) {
				counter++;
				
			}
		}
	}

	public Map<Integer, String> getCombatLog() {
		return combatLog;
	}

}
