/**
 * 
 */
package tools.analyse;


/**
 * @author Tingle Driftwood
 *
 */
public class CheckKindOfLog {
	
	private String logType;

	public CheckKindOfLog(String str) {
		//kind of log file undefined.
		logType = new String("UNDEFINED");
		
		//Check for Everquest II log file
		int t = str.indexOf("eq2log");
		if (t!=-1) {
			logType="EVERQUEST II";
		}
	}
	
	public String getKindOfLog(){
		return logType;
	}
	
}
