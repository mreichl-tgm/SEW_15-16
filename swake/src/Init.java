import javax.swing.JOptionPane;

import constants.Imports;
import constants.Variables;

/**
 * @author Markus Reichl
 * @version 22-10-15
 * 
 * Our test class creating a new GameControl
 * -> Starts our game
 */

public class Init {
	
	public static void main(String[] args) {
		// Startup
		Variables.playerName = JOptionPane.showInputDialog("Enter your name pls:", Imports.getBoyImg());
		
		if (Variables.playerName.equals("moneyboy") || 
				Variables.playerName.equals("bobross") || 
				Variables.playerName.equals("marm")) {
			Variables.setCharacter(Variables.playerName);
		}
		
		new GameControl();
		// Go on
		while (true) {
			String s1 = "Noch 1 spielen";
			String s2 = "Sheeesh " + Variables.highScore + "$ Cash!";
			
			if (Variables.character.equals("bobross")) {
				s1 = "Just " + Variables.highScore + " happy little Accidents!";
				s2 = "We didn't make mistakes";
			} else if (Variables.character.equals("marm")) {
				s1 = "this.arr = new Array[" + Variables.highScore + "]";
				s2 = "Ich bin eine Legende";
			}
			
			if (JOptionPane.showConfirmDialog(null, s1, s2, 0, 1) != 1) new GameControl();
			else System.exit(0);
		}
	}
	
}