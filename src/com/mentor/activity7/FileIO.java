package com.mentor.activity7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
public static void main(String[] args) throws IOException {
	
	List<String> arrData = new ArrayList<String>();
	arrData.add("Vidhyadhar");
	arrData.add("CTS");
	arrData.add("Hello");
	arrData.add("Shrey");
	
	FileWriter writer = new FileWriter("output.txt");
	int size = arrData.size();
	for(String str: arrData) {
		writer.write(str+"\n");
	}
	writer.close();
}

}
