import java.util.TreeSet;

/**
 * 
 * @author Markus Reichl
 * @version 11.11.2015
 * 
 * See "Au04 Lotto.pdf"
 * 
 */

public class Au04b extends Lottery {
	
	private TreeSet<Integer> lottery;
	
	public Au04b(int tips) {
		lottery = getCurrentLottery();
		
		System.out.println("Ziehung: ");
		System.out.println(lottery.toString());
		System.out.println();
		
		for (int i = 0; i < tips; i++) quickTip();
	}
	/**
	 * Calls makeTip from Lottery and prints matches
	 */
	public void quickTip() {
		TreeSet<Integer> t = makeTip(lottery);
		
		System.out.println("-> " + t.toString() + " " + t.size() + " matches!");
		System.out.println();
	}
}