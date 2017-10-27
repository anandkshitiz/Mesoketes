/**
 * 
 */
package com.kshitiz.mesoketes.data;

/**
 * @author kshitiz
 *
 */
public class Wall {

	/**
	 * @param height
	 * @param direction
	 */
	public Wall(WallDirection direction) {		
		this.direction = direction;
	}
	
	private int height = 0;
	private WallDirection direction;
	private int nbSuccessBreach = 0;
	
	/*
	 * After every attack "minHeightToOvercomeSimilarAttacks" is calculated using attackTheWall method.
	 * But, the actual height changes only when "repairTheWall" method is called at the end of Day.
	 */
	private int minHeightToOvercomeSimilarAttacks = 0;
	
	/**
	 * @param strength
	 * @return
	 */
	public boolean attackTheWall(int strength) {
		if (strength > this.height) {
			this.minHeightToOvercomeSimilarAttacks = strength;
			nbSuccessBreach++;
			return true;
		}
		return false;
	}
		
	/**
	 * 
	 */
	public void repairTheWall() {		
		this.height = this.minHeightToOvercomeSimilarAttacks;
	}

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
	 * @return the nbSuccessBreach
	 */
	public int getNbSuccessBreach() {
		return nbSuccessBreach;
	}

	/**
	 * @param nbSuccessBreach the nbSuccessBreach to set
	 */
	public void setNbSuccessBreach(int nbSuccessBreach) {
		this.nbSuccessBreach = nbSuccessBreach;
	}

}
