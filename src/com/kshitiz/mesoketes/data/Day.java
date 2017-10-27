/**
 * 
 */
package com.kshitiz.mesoketes.data;

import java.util.List;

/**
 * @author kshitiz
 *
 */
public class Day {
	
	/**
	 * @param dayName
	 * @param attacks
	 */
	public Day(String dayName, List<Attack> attacks) {
		this.dayName = dayName;
		this.attacks = attacks;
	}
	private String dayName;
	/**
	 * @return the dayName
	 */
	public String getDayName() {
		return dayName;
	}
	/**
	 * @param dayName the dayName to set
	 */
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	/**
	 * @return the attacks
	 */
	public List<Attack> getAttacks() {
		return attacks;
	}
	/**
	 * @param attacks the attacks to set
	 */
	public void setAttacks(List<Attack> attacks) {
		this.attacks = attacks;
	}
	private List<Attack> attacks;

}
