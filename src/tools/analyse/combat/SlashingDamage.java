/**
 * 
 */
package tools.analyse.combat;

import java.util.Map;

/**
 * @author Tingle Driftwood
 * 
 */
public class SlashingDamage {

	int dmg;

	public SlashingDamage(Map<Integer, String> log) {
		String line;
		for (int i = 0; i < log.size(); i++) {
			line = log.get(i);
			if (line.contains("You slash")) {
				int x = line.indexOf("<highlight>") + 11;
				int y = line.indexOf("(") - 1;
				line = line.substring(x, y);
				try {
					dmg = dmg + Integer.valueOf(line);
				} catch (NumberFormatException e) {
					System.out.println("Keine Intergerzahl");
				}
			}
		}
	}

	public int getSlashingDamage() {
		return dmg;
	}
}
