import java.util.TreeSet;

/**
 * 
 * @author Markus Reichl
 * @version 11.11.2015
 * 
 * See "Au04 Lotto.pdf"
 *
 */

public class Au04a extends Lottery {
	
	private TreeSet<Integer> t;
	
	public Au04a() {
		t = getCurrentLottery();
		
		for (Integer i2 : t) {
			System.out.print(i2 + ", ");
		}
		
		System.out.println();
	}
}
