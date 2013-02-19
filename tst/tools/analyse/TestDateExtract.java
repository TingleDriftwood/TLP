/**
 * 
 */
package tools.analyse;

import java.io.File;
import java.util.Map;

import tools.io.LogLoader;

/**
 * @author Tingle Driftwood
 *
 */
public class TestDateExtract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> log = new LogLoader(new File("log/Demo01_log.txt")).getLog();
		new DateExtract(log);
		System.out.println(new DateExtract(log).getStartZeit());
	}

}
