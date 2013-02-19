/**
 * Class extract from first line of log file the date and starting time of
 * the log file.
 */
package tools.analyse;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * @author Tingle Driftwood
 * 
 */
public class DateExtract {

	public Date startZeit;

	public DateExtract(Map<Integer, String> log) {
		String line = log.get(0);
		int pos = line.indexOf("_log_");
		line = line.substring(pos + 5, line.length() - 5);
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.valueOf(line.substring(0, 4)),
				Integer.valueOf(line.substring(5, 7)) - 1,
				Integer.valueOf(line.substring(7, 9)), 0, 0, 0);
		startZeit = cal.getTime();
	}

	public Date getStartZeit() {
		return startZeit;
	}

}
