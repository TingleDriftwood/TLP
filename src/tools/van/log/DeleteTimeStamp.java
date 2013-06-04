/**
 * Class deletes all time stamps from a log file. 
 */
package tools.van.log;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tingle Driftwood
 * 
 */
public class DeleteTimeStamp {

	public Map<Integer, String> clearLog;

	public DeleteTimeStamp(Map<Integer, String> log) {
		clearLog = new HashMap<Integer, String>();
		int pos = 0;
		String line;
		for (int i = 0; i < log.size(); i++) {
			line = log.get(i);
			pos = line.lastIndexOf(']') + 2;
				line = line.substring(pos);
				clearLog.put(i, line);
		}
	}

	public Map<Integer, String> getClearLog() {
		return clearLog;
	}

}
