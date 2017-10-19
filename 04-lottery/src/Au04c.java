/**
 * 
 * @author Markus Reichl
 * @version 11.11.2015
 * 
 * See "Au04 Lotto.pdf"
 * 
 */

public class Au04c extends Au04b {
	
	public Au04c(int tips) {
		super(tips);
	}
	
	public void quickTip() {
		super.quickTip();
		
		for (Integer i : getCurrentLottery()) {
			if (i == getRandomNumber()) {
				System.out.println("-> [" + i + "]" + " You are lucky!");
				System.out.println();
				break;
			}
		}
	}
}