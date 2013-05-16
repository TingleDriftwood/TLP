/**
 * 
 */
package tools.io;

import java.io.File;
import java.util.Map;

import van.tools.io.LogLoader;

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
		log = new LogLoader(new File("log/Demo01_log.txt"));
		map = log.getLog();
		System.out.println("Anzahl eingelesener Zeilen:");
		System.out.println(map.size());
		System.out.println("Erste Zeile:");
		System.out.println(map.get(0));
		System.out.println("Letzte Zeile:");
		System.out.println(map.get(map.size()-1));
	}

}
