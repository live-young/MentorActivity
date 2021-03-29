package com.mentor.activity4;

import java.util.Scanner;

public class EnhancedFor {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter size of array");
	int size = kb.nextInt();
	int [] arr = new int[size];
	System.out.println("Enter elements");
	for(int i=0; i<size; i++) {
		arr[i] = kb.nextInt();
	}
	
	alPrint(arr);
}
	public static void alPrint(int [] arr) {
		int i=0;
		for(int index :arr){
			if(i%2==0) {
				System.out.println(index);
			}
			i++;
			
		}
	}
}
