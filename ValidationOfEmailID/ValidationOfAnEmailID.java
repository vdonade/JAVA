package com.simplilearn.project;

import java.util.Scanner;
import java.util.Arrays;

public class ValidationOfAnEmailID {

	public static void main(String[] args) {
		
		String testData [] = {
				"vishal@gmail.com",
				"rina@.com","raj@.vz",
				"suni@.ab", "anki@.ez",
				"yash@.nm", "mona@.ab",
				"rohini@gmail", "Garg@.com"
						};

		
		Scanner sc = new Scanner(System.in);
		String EmailID = sc.nextLine();
				
		
		for (String s : testData) {
			if (EmailID.equals(s)) {
				System.out.println("EmailID is Valid");
			}
		}
	
		
	}
}

	
	
