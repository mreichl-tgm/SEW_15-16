package au05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 
 * @author Re1
 *
 */

public class TheChosenOne {
	static Scanner scnr = new Scanner(System.in);
	static int day = Calendar.DAY_OF_WEEK;
	static String[] arr1;
	static String[] arr2;
	static String[] key;
	static TreeMap<String, String> tree = new TreeMap<>();
	
	public static void main(String[] args) {
		String wthl = "";
		
		try {
	        BufferedReader in = new BufferedReader(new FileReader("harry/hp0" + day + ".html"));
	        
	        StringBuilder sb = new StringBuilder();
	        
	        while ((in.readLine()) != null) {
	        	sb.append(in.readLine());
	        }
	        
	        wthl = sb.toString();
	        arr1 = wthl.split("\\s+");
	        
	        in.close();
	    } catch (IOException e) {
	    	System.out.println("Well, fucked...");
	    }
		
		while (true) {
			System.out.println("What you wanna encrypt?");
			String input = scnr.nextLine();
			
			if (input.equals("x")) break;
			arr2 = input.split("\\s+");
			
			for (int i = 0; i < arr2.length; i++) {
				tree.put(arr1[i], arr2[i]);
			}
			
			System.out.println("Encrypted:");
			System.out.println(tree.keySet().toString());
		}
		
		while (true) {
			System.out.println("What you wanna decrypt?");
			String input = scnr.nextLine();
			
			if (input.equals("x")) break;
			arr2 = input.split("\\s+");
			
			for (int i = 0; i < arr2.length; i++) {
				// I don't really care... WIP-
			}
		}
	}

}