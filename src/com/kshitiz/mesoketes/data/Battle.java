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
	public boolean initialize(String input) {
		try {
			String[] inputAsArray = input.split(Delimiter.DAYS_DELIM);
			if (inputAsArray.length > 0) {
				Attack attack = null;
				Day day = null;
				days = new ArrayList<Day>();
				for (String s : inputAsArray) {
					String[] eachAttackInDayAsArray = s.split(Delimiter.ATTACKS_DELIM);
					if (eachAttackInDayAsArray.length > 0) {
						List<Attack> attacks = new ArrayList<Attack>();
						for (String at : eachAttackInDayAsArray) {
							WallDirection dir = null;
							String[] a = at.trim().split(Delimiter.ATTACK_DELIM);
							if (a.length > 0) {
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
							} else {
								System.out.println("Invalid Input Data..Please use the Test Case data mentioned in the Input.txt file");
								return false;
							}
						}
						day = new Day(s.substring(0, s.indexOf(Delimiter.DAY_DETAIL_DELIM)), attacks);
						days.add(day);
					} else {
						System.out.println("Invalid Input Data..Please use the Test Case data mentioned in the Input.txt file");
						return false;
					}
				}
				return true;
			}
		} catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
			System.out.println("Invalid Input Data..Please use the Test Case data mentioned in the Input.txt file");
			return false;
		}
		System.out.println("Invalid Input Data..Please use the Test Case data mentioned in the Input.txt file");
		return false;
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
				// Walls are repaired only during the end of a Day.
				kingdom.getNorth().repairTheWall();
				kingdom.getSouth().repairTheWall();
				kingdom.getEast().repairTheWall();
				kingdom.getWest().repairTheWall();
			}
		}
		successfulAtacks = kingdom.getNorth().getNbSuccessBreach() + kingdom.getEast().getNbSuccessBreach()
				+ kingdom.getWest().getNbSuccessBreach() + kingdom.getSouth().getNbSuccessBreach();
		return successfulAtacks;
	}

}
