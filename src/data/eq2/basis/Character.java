/**
 * 
 */
package data.eq2.basis;

import java.io.Serializable;

/**
 * @author Tingle Driftwood
 *
 */
public class Character implements Serializable{

	private static final long serialVersionUID = 996143993632100150L;

	private String charClass;
	private String charRace;
	private int level;
	
	/**
	 * @return the charClass
	 */
	public String getCharClass() {
		return charClass;
	}
	
	/**
	 * @param charClass the charClass to set
	 */
	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}
	
	/**
	 * @return the charRace
	 */
	public String getCharRace() {
		return charRace;
	}
	
	/**
	 * @param charRace the charRace to set
	 */
	public void setCharRace(String charRace) {
		this.charRace = charRace;
	}
	
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
}
