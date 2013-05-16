/**
 * 
 */
package van.tools.analyse;

import java.util.Map;

/**
 * @author Tingle Driftwood
 *
 */
public class SpellUsed {

	Map<Integer, String> log;
	Map<Integer, String> spells;
	
	public SpellUsed(Map<Integer, String> log) {
		this.log = log;
//		int nr;
		for(int i=0;i<log.size();i++){
			
		}
	}
	
	public Map<Integer, String> getLog() {
		return log;
	}
	public Map<Integer, String> getSpells() {
		return spells;
	}
	
}
