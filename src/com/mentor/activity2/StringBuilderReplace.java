package com.mentor.activity2;

import java.util.Scanner;

public class StringBuilderReplace {
	 public static void main(String[] args) {
   	  Scanner kb = new Scanner(System.in);
   	  System.out.println("Enter your phone number");
   	  String number = kb.nextLine(); 
   	  StringBuilder sbNumber = new StringBuilder(number);
   	  System.out.println(replace(sbNumber));
   	  
	
}
     	public static StringBuilder replace(StringBuilder sbNumber) {
     		int size = sbNumber.length();
     		if(size<=4) {
     			// if size is smaller than or equal to 4 
     			//nothing to mask 
     			return sbNumber;
     		}
     		
     		for (int i = 0 ; i < size - 4 ; i++) { 
     			// note the upper limit of the for loop
     		    // sets every character to X until the fourth to last character
     		    sbNumber.setCharAt(i, 'X');
     		}
			return sbNumber;
     	}
}
