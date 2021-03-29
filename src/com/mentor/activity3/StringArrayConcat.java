package com.mentor.activity3;

import java.util.Scanner;

public class StringArrayConcat {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
  	  System.out.println("Enter size of array");
  	  int size = kb.nextInt();
  	  kb.nextLine();
  	 System.out.println("Enter elements of array");
  	 String str[] = new String[size];
  	 for(int i =0; i<size; i++) {
  		 str[i] = kb.nextLine();
  	 }
  	 System.out.println(stringConcat(str));
	}
	
	public static String stringConcat(String[] str) {
		String result = "";
		for(int i=0; i<str.length; i++)
		{
			if(str[i].equals(null)) {
				continue;
			}
			result+=str[i];
		}
		return result;
		
	}
	
	
	
}
