/**
 * 
 */
package com.kshitiz.mesoketes.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.kshitiz.mesoketes.data.Battle;
import com.kshitiz.mesoketes.data.Delimiter;

/**
 * @author kshitiz
 *
 */
public class BattleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder input = new StringBuilder();
		try (FileReader inputFileReader = new FileReader(args[0]);
				BufferedReader inputFileStream = new BufferedReader(inputFileReader);) {
			String CurrentLine = inputFileStream.readLine();
			while ((CurrentLine = inputFileStream.readLine()) != null) {
				input.append(CurrentLine + Delimiter.DAYS_DELIM);
			}
			Battle battle = new Battle();
			System.out.println("Input Data is ");
			System.out.println(input.toString());
			if (battle.initialize(input.toString())) {
				System.out.println("Total Number Of Successful Atatcks on Maygans Kingdom by Tribe folks  = "
						+ battle.startTheBattle());
			}else {
				System.out.println("Try again with a valid Input Test Case data.");
			}
		} catch (IOException e) {
			System.out.println("Unable to read/process the Input Data File.");
		}		
	}

}
