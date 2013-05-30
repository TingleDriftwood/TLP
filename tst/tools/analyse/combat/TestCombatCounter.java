/**
 * 
 */
package tools.analyse.combat;

import java.io.File;
import java.util.Map;

import tools.van.analyse.combat.CombatCounter;
import tools.van.io.LogLoader;
import tools.van.log.DeleteTimeStamp;

/**
 * @author Bunny
 *
 */
public class TestCombatCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> log = new LogLoader(new File("log/Demo01_log.txt")).getLog();
		Map<Integer, String> clog = new DeleteTimeStamp(log).getClearLog();
		CombatCounter cc = new CombatCounter(clog);
		System.out.println(cc.getCombatCounts());
	}

}
