/**
 * 
 */
package tools.analyse;

import java.io.File;
import java.util.Map;

import tools.van.analyse.KillList;
import tools.van.io.LogLoader;
import tools.van.log.DeleteTimeStamp;

/**
 * @author Tingle Driftwood
 *
 */
public class TestKillList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> log = new LogLoader(new File(
				"log/Demo01_log.txt")).getLog();
		Map<Integer, String> clog = new DeleteTimeStamp(log).getClearLog();
		Map<Integer, String> kill = new KillList(clog).GetKillList();
		for (int i = 0; i < kill.size(); i++) {
			System.out.println(kill.get(i));
		}
	}

}
