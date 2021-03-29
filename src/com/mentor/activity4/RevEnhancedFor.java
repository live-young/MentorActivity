package com.mentor.activity4;

import java.util.Scanner;

public class RevEnhancedFor {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = kb.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter elements");
		for(int i=0; i<size; i++) {
			arr[i] = kb.nextInt();
		}
			revPrint(arr);
			kb.close();
	}
		public static void revPrint(int [] arr) {
			int i=arr.length-1;
			for(@SuppressWarnings("unused") int index:arr){
					System.out.println(arr[i]);
					i--;
			}
		}
}
