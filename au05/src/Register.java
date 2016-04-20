/**
 * @author mreichl
 * Handles a TreeMap of Districts by zipCode as key
 */

import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Register {
	Scanner scnr = new Scanner(System.in);
	Random rndm;
	
	private TreeMap<Integer, District> myDistricts = new TreeMap<>();
	
	public Register() {
		Integer zip;
		String name;
		String s;
		
		while (true) {
			System.out.println("What you wanna do? (a,v,e)");
			
			s = scnr.nextLine();
			if (s.equals("a")) {
				System.out.println("Add a zip code:");
				zip = Integer.parseInt(scnr.nextLine());
				System.out.println("Add a name:");
				name = scnr.nextLine();
				myDistricts.put(zip, new District(zip, name));
			} else if (s.equals("v")) {
				for (Integer i : myDistricts.keySet()) {
					System.out.println(myDistricts.get(i).zipCode + " " + myDistricts.get(i).name);
				}
			} else if (s.equals("x")) {
				return;
			}
		}
	}
}