/**
 * 
 */
package tools.analyse.combat;

import java.io.File;
import java.util.Map;

import tools.van.analyse.combat.SeperateCombatX;
import tools.van.analyse.combat.SlashingDamage;
import tools.van.io.LogLoader;
import tools.van.log.DeleteTimeStamp;

/**
 * @author Tingle Driftwood
 * 
 */
public class TestSlashingDamage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> log = new LogLoader(new File("log/Demo01_log.txt"))
				.getLog();
		Map<Integer, String> clog = new DeleteTimeStamp(log).getClearLog();
		SeperateCombatX scx = new SeperateCombatX(5, clog);
		log = scx.getCombatLog();
		SlashingDamage sd = new SlashingDamage(log);
		System.out.println("Total slashing damage output: "
				+ sd.getSlashingDamage());
	}

}
