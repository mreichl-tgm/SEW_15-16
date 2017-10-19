package au02_reichl;

/*
 * @author mreichl
 * Handles 3 ArrayLists and fills them with content
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Register {
	Scanner scnr;
	Random rndm;
	
	private ArrayList<Person> myHumans = new ArrayList<>();
	private ArrayList<Integer> myNumbers = new ArrayList<>();
	private ArrayList<District> myDistricts = new ArrayList<>();
	
	public Register() {
		makeHumans();
		ArrayList<Person> myList = (ArrayList<Person>) myHumans.clone();
		for (Person p : myList) {
			System.out.println(p.vname + " " + p.lname);
		}
		System.out.println();
		
		makeNumbers();
		System.out.println(myNumbers.toString());
		System.out.println();
		
		makeDistricts();
		for (District d : myDistricts) {
			System.out.println(d.zipCode + " " + d.name);
		}
		System.out.println();
	}
	
	/**
	 * Adds some humans to our list
	 */
	private void makeHumans() {
		myHumans.add(new Person("Michael", "Martinides"));
		myHumans.add(new Person("Michael", "Borko"));
		myHumans.add(new Person("Thomas", "Pamperl"));
		myHumans.add(new Person("Bettina", "Rücker"));
		myHumans.add(new Person("Claudia", "Weber"));
		myHumans.add(new Person("Gottfried", "Koppensteiner"));
		myHumans.add(new Person("Pierre", "Rieger"));
	}
	/*
	 * Adds some numbers to our list
	 */
	private void makeNumbers() {
		scnr = new Scanner(System.in);
		rndm = new Random();
		
		int numbers = -1;
		
		do {
			System.out.println("How many numbers?");
			String sn = scnr.nextLine();
			if (sn != "") {
				try {
					int in = Integer.parseInt(sn);
					if (in > -1) {
						numbers = in;
					}
				} catch (NumberFormatException e) {
					continue;
				}
			}
		} while (numbers < 0);
		
		for (int i = 0; i < numbers; i++) {
			myNumbers.add(new Integer(rndm.nextInt(100)));
		}
		
		Collections.sort(myNumbers);
	}
	/*
	 * Adds some districts to our list
	 */
	private void makeDistricts() {
		myDistricts.add(new District(1220, "Donaustadt"));
		myDistricts.add(new District(2285, "Leopoldsdorf"));
		myDistricts.add(new District(2286, "Haringsee"));
		
		Collections.sort(myDistricts);
	}
}