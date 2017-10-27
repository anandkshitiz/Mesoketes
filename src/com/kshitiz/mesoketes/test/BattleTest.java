/**
 * 
 */
package com.kshitiz.mesoketes.test;



/**
 * @author ksanand
 *
 */
public class BattleTest {
	
	

	static String testData = "T1 - N - 3: T2 - S - 4: T3 - W - 2\r\n" + "T1 - E - 4: T2 - N - 3: T3 - S - 2\r\n"
			+ "T1 - W - 3: T2 - E - 5: T3 - N - 2";
	
	static String testData1 = "Day 1;T1 - S - 4: T1 - N - 2: T3 - W - 3\r\n" + 
			"Day 2;T2 - S - 5: T2 - N - 1: T3 - N - 3\r\n" + 
			"Day 3;T1 - W - 2: T1 - W - 4: T2 - N - 3: T2 - S - 4";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Build all the walls with '0' height.
		Wall north = new Wall("N");
		Wall south = new Wall("S");
		Wall east = new Wall("E");
		Wall west = new Wall("W");

		String[] array = testData1.split("\r\n");

		for (String s : array) {
			String[] values = s.split(":");
			for (String v : values) {
				String[] x = v.split("-");
				if (x[1].contains("N") && Integer.parseInt(x[2].trim()) > north.getHeight()) {					
					north.setHeight(Integer.parseInt(x[2].trim()));
					north.setNbBreach(north.getNbBreach() + 1);
				} else if (x[1].contains("E") && Integer.parseInt(x[2].trim()) > east.getHeight()) {
					east.setHeight(Integer.parseInt(x[2].trim()));
					east.setNbBreach(east.getNbBreach() + 1);
				}
				else if (x[1].contains("W") && Integer.parseInt(x[2].trim()) > west.getHeight()) {
					west.setHeight(Integer.parseInt(x[2].trim()));
					west.setNbBreach(west.getNbBreach() + 1);
				}
				else if (x[1].contains("S") && Integer.parseInt(x[2].trim()) > south.getHeight()) {
					south.setHeight(Integer.parseInt(x[2].trim()));
					south.setNbBreach(south.getNbBreach() + 1);
				}
			}
		}
		System.out.println(north.getNbBreach() + east.getNbBreach() + west.getNbBreach() + south.getNbBreach());

	}

}
