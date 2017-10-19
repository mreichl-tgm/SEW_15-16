import java.util.Random;
import java.util.TreeSet;

/**
 * 
 * @author kojote
 * @version 11.11.2015
 * 
 * Holds some basic functions for our lottery
 * 
 */

public class Lottery {
	private int counter = 1;
	private Random rand = new Random();
	private TreeSet<Integer> lottery;
	
	public Lottery() {
		lottery = playLotto();
	}
	
	public Integer getRandomNumber() {
		return rand.nextInt(44) + 1;
	}
	
	public TreeSet<Integer> playLotto() {
		TreeSet<Integer> t = new TreeSet<>();
		
		for (int i = 0; i < 6; i++) t.add(getRandomNumber());
		
		return t;
	}
	
	public TreeSet<Integer> makeTip(TreeSet<Integer> lottery) {
		TreeSet<Integer> t1 = playLotto();
		TreeSet<Integer> t2 = new TreeSet<>();
		
		System.out.println("Tip " + counter + ":");
		System.out.println(t1.toString());
		for (Integer i1 : lottery) {
			for (Integer i2 : t1) {
				if (i1.equals(i2)) {
					t2.add(i1);
				}
			}
		}
		
		counter++;
		return t2;
	}
	/**
	 * Gets currently running lottery for Au04c
	 * @return TreeSet<Integer>
	 */
	public TreeSet<Integer> getCurrentLottery() {
		return lottery;
	}
}