/**
 * @author kojote
 * @version 1.1
 * 
 * Template for testable children of lists
 */

package au06;

import java.util.Random;

public interface Testable {
	Random rand = new Random();
	
	abstract void log();
	abstract void addTest();
	abstract void removeTest();
	abstract void searchTest();
}