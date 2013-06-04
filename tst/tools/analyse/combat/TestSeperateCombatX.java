/**
 * 
 */
package tools.analyse.combat;

import java.io.File;
import java.util.Map;

import tools.io.LogLoader;
import tools.van.analyse.combat.SeperateCombatX;
import tools.van.log.DeleteTimeStamp;

/**
 * @author Tingle Driftwood
 * 
 */
public class TestSeperateCombatX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> log = new LogLoader(new File("log/Demo01_log.txt"))
				.getLog();
		Map<Integer, String> clog = new DeleteTimeStamp(log).getClearLog();
		SeperateCombatX scx = new SeperateCombatX(3, clog);
		log = scx.getCombatLog();
		for (int i = 0; i < log.size(); i++) {
			System.out.println(log.get(i));
		}
	}

}
