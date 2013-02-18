/**
 * 
 */
package tools.log;

import java.io.File;
import java.util.Map;

import tools.io.LogLoader;

/**
 * @author Tingle Driftwood
 *
 */
public class TestDeleteTimeStamp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> log = new LogLoader(new File("E:\\Vanguard\\logs\\Chat_log_2013_0214_2013.txt")).getLog();
		Map<Integer, String> clog = new DeleteTimeStamp(log).getClearLog();
		System.out.println("Erste Zeile:");
		System.out.println(log.get(0));
		System.out.println(clog.get(0));
		System.out.println("Letzte Zeile:");
		System.out.println(log.get(log.size()-1));
		System.out.println(clog.get(clog.size()-1));
	}

}