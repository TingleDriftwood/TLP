/**
 * 
 */
package van.tools.analyse.combat;

import java.util.Map;

/**
 * @author Tingle Driftwood
 * 
 */
public class CountIncomingDamage {

	int dmg;

	public CountIncomingDamage(Map<Integer, String> log) {
		String line;
		int x;
		int z;
		for (int i = 0; i < log.size(); i++) {
			line = log.get(i);
			if (line.contains("hits you for")) {
				x = line.indexOf("<highlight>") + 11;
				z = line.indexOf("</color>");
				line = line.substring(x, z);
				try{
					dmg = dmg + Integer.valueOf(line);
				}
				catch(NumberFormatException e){
					System.out.println("Keine Intergerzahl");
				}
			}
		}
	}

	public int getDamage() {
		return dmg;
	}
}
