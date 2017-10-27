/**
 * 
 */
package com.kshitiz.mesoketes.data;

/**
 * @author kshitiz
 *
 */
public class MaygansKingdom {
	
	private Wall north = new Wall(WallDirection.N);
	private Wall east = new Wall(WallDirection.E);
	private Wall west = new Wall(WallDirection.W);
	private Wall south = new Wall(WallDirection.S);
	/**
	 * @return the north
	 */
	public Wall getNorth() {
		return north;
	}
	/**
	 * @param north the north to set
	 */
	public void setNorth(Wall north) {
		this.north = north;
	}
	/**
	 * @return the east
	 */
	public Wall getEast() {
		return east;
	}
	/**
	 * @param east the east to set
	 */
	public void setEast(Wall east) {
		this.east = east;
	}
	/**
	 * @return the west
	 */
	public Wall getWest() {
		return west;
	}
	/**
	 * @param west the west to set
	 */
	public void setWest(Wall west) {
		this.west = west;
	}
	/**
	 * @return the south
	 */
	public Wall getSouth() {
		return south;
	}
	/**
	 * @param south the south to set
	 */
	public void setSouth(Wall south) {
		this.south = south;
	}
	
	

}
