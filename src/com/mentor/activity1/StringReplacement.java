package com.mentor.activity1;

import java.util.Scanner;

public class StringReplacement {
      public static void main(String[] args) {
    	  Scanner kb = new Scanner(System.in);
    	  System.out.println("Enter your phone number");
    	  String number = kb.nextLine();
    	  System.out.println(replace(number));
    	  
	
}
      	public static String replace(String number) {
      		int size = number.length();
      		char [] arr = number.toCharArray();
      		for(int i=0; i<size-4; i++)
      		{
      			arr[i]='X';
      		}
      		String str = new String(arr);
			return str;
      	}
}
