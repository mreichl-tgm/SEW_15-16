import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 
 * @author Re1
 *
 */

public class Translator {
	private static Scanner scnr = new Scanner(System.in);
	private static TreeMap<String, String> myBook = new TreeMap<>();
	
	public static void main(String[] args) {
		init();
	}

	private static void init() {
		while (true) {
			System.out.println("Ask me something:");
			String input = scnr.nextLine();
			Boolean found = false;
			
			if (input.equals("x")) return;
			for (Entry<String, String> e : myBook.entrySet()) {
				if (e.getKey().equals(input)) {
					System.out.println("= " + e.getValue());
					found = true;
				}
			}
			
			if (!found) {
				System.out.println("Couldn't find key, please add it:");
				String s = scnr.nextLine();
				myBook.put(input, s);
			}
		}
	}
	
}
