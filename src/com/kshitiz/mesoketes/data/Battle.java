/**
 * 
 */
package com.kshitiz.mesoketes.data;

import java.util.List;

import java.util.ArrayList;

/**
 * @author kshitiz
 *
 */
public class Battle {
	
	private List<Day> days;

	/**
	 * @param input
	 */
	public void initialize(String input) {

		String[] inputAsArray = input.split("\\r\\n");
		Attack attack = null;
		Day day = null;
		days = new ArrayList<Day>();
		for (String s : inputAsArray) {
			String[] eachAttackInDayAsArray = s.split(":");
			List<Attack> attacks = new ArrayList<Attack>();
			for (String at : eachAttackInDayAsArray) {
				WallDirection dir = null;
				String[] a = at.trim().split("-");
				switch (a[1].trim()) {
				case "N": {
					dir = WallDirection.N;
					break;
				}
				case "E": {
					dir = WallDirection.E;
					break;
				}
				case "W": {
					dir = WallDirection.W;
					break;
				}
				case "S": {
					dir = WallDirection.S;
					break;
				}
				}
				attack = new Attack(dir, Integer.parseInt(a[2].trim()));
				attacks.add(attack);
			}
			day = new Day(s.substring(0, s.indexOf(";")), attacks);
			days.add(day);
		}

	}

	public int startTheBattle() {
		MaygansKingdom kingdom = new MaygansKingdom();
		int successfulAtacks = 0;
		List<Attack> attacks;
		if (days.size() > 0) {
			for (Day d : days) {
				attacks = d.getAttacks();
				for (Attack a : attacks) {
					switch (a.getDirection()) {
					case N: {
						kingdom.getNorth().attackTheWall(a.getStrength());
						break;
					}
					case S: {
						kingdom.getSouth().attackTheWall(a.getStrength());
						break;
					}
					case E: {
						kingdom.getEast().attackTheWall(a.getStrength());
						break;
					}
					case W: {
						kingdom.getWest().attackTheWall(a.getStrength());
						break;
					}
					}
				}
				kingdom.getNorth().repairTheWall();
				kingdom.getSouth().repairTheWall();
				kingdom.getEast().repairTheWall();
				kingdom.getWest().repairTheWall();
			}
		}
		successfulAtacks = kingdom.getNorth().getNbSuccessBreach() + kingdom.getEast().getNbSuccessBreach() + kingdom.getWest().getNbSuccessBreach()
				+ kingdom.getSouth().getNbSuccessBreach();
		return successfulAtacks;
	}

}
