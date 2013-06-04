/**
 * 
 */
package tools.analyse;

import java.io.File;
import java.util.Map;

import tools.io.LogLoader;
import tools.van.analyse.TimeExtract;

/**
 * @author Tingle Driftwood
 *
 */
public class TestTimeExtract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> log = new LogLoader(new File("log/Demo01_log.txt")).getLog();
		System.out.println(new TimeExtract(log,5).getTime());
	}

}
