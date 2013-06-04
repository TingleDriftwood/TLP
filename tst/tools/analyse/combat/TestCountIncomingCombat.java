/**
 * 
 */
package tools.analyse.combat;

import java.io.File;
import java.util.Map;

import tools.io.LogLoader;
import tools.van.analyse.combat.CountIncomingDamage;
import tools.van.analyse.combat.SeperateCombatX;
import tools.van.log.DeleteTimeStamp;

/**
 * @author Tingle Driftwood
 * 
 */
public class TestCountIncomingCombat {

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
		CountIncomingDamage cid = new CountIncomingDamage(log);
		System.out.println("Total incoming Damage: " + cid.getDamage());
	}

}
