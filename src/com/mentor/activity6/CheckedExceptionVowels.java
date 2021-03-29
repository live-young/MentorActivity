package com.mentor.activity6;

import java.util.Scanner;

class FoundXException extends Exception {
	FoundXException(String msg){
	      super(msg);
	   }
	}

public class CheckedExceptionVowels {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		char[] ch = str.toLowerCase().toCharArray();
		try {
			System.out.println(checkVowels(ch));
		} catch (FoundXException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	public static int checkVowels(char[] ch) throws FoundXException {
		int count =0;
		for(int i=0; i<ch.length; i++)
			{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
			else if(ch[i]=='x') {
				FoundXException fxe = new FoundXException("Found X at "+(i+1)+" position");
				throw fxe;
			}
			}
		return count;
	}
}
