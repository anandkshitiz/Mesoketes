/**
 * 
 */
package com.kshitiz.mesoketes.data;

/**
 * @author kshitiz
 *
 */
public class Attack {
	
	/**
	 * @param direction
	 * @param strength
	 */
	public Attack(WallDirection direction, int strength) {
		this.direction = direction;
		this.strength = strength;
	}
	private WallDirection direction;
	private int strength;
	/**
	 * @return the direction
	 */
	public WallDirection getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(WallDirection direction) {
		this.direction = direction;
	}
	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

}
