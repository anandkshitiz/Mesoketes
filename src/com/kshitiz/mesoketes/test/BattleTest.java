/**
 * 
 */
package com.kshitiz.mesoketes.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.kshitiz.mesoketes.data.Battle;

/**
 * @author kshitiz
 *
 */
public class BattleTest {

//	static String testData = "Day 1;T1 - N - 3: T2 - S - 4: T3 - W - 2\r\n"
//			+ "Day 2;T1 - E - 4: T2 - N - 3: T3 - S - 2\r\n" + "Day 3;T1 - W - 3: T2 - E - 5: T3 - N - 2";
//
//	static String testData1 = "Day 1;T1 - S - 4: T1 - N - 2: T3 - W - 3\r\n"
//			+ "Day 2;T2 - S - 5: T2 - N - 1: T3 - N - 3\r\n" + "Day 3;T1 - W - 2: T1 - W - 4: T2 - N - 3: T2 - S - 4";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder input = new StringBuilder();
		try (
			 FileReader inputFileReader = new FileReader(args[0]);
			 BufferedReader inputFileStream = new BufferedReader(inputFileReader);
			) {
			String CurrentLine = inputFileStream.readLine();
			while ((CurrentLine = inputFileStream.readLine()) != null) {
				input.append(CurrentLine + "\r\n");
			}			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		Battle battle = new Battle();
		battle.initialize(input.toString());
		System.out.println("Success = " + battle.startTheBattle());

	}

}
