/**
 * 
 */
package tools.io;

import java.io.File;
import java.util.Map;

/**
 * @author Tingle Driftwood
 *
 */
public class TestLoadLog {
	
	public static Map<Integer, String> map;
	public static LogLoader log;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log = new LogLoader(new File("E:\\Vanguard\\logs\\Chat_log_2013_0214_2013.txt"));
		map = log.getLog();
		System.out.println("Anzahl eingelesener Zeilen:");
		System.out.println(map.size());
		System.out.println("Erste Zeile:");
		System.out.println(map.get(0));
		System.out.println("Letzte Zeile:");
		System.out.println(map.get(map.size()-1));
	}

}