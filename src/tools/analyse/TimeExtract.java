/**
 * Class extract the time stamp of an line in the log file.
 */
package tools.analyse;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/**
 * @author Tingle Driftwood
 * 
 */
public class TimeExtract {

	public Date time;

	public TimeExtract(Map<Integer, String> log, int lnr) {
		String timeStr = log.get(lnr).substring(1, 9);
		Calendar cal = Calendar.getInstance();
		cal.set(1974, 1, 25, Integer.valueOf(timeStr.substring(0, 2)),
				Integer.valueOf(timeStr.substring(3, 5)),
				Integer.valueOf(timeStr.substring(6)));
		time = cal.getTime();
	}

	public Date getTime() {
		return time;
	}

}
