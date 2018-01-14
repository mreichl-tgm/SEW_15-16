package view;

import javax.swing.JFrame;

import constants.Finals;
import constants.Variables;
import snake.*;

public class GameView extends JFrame {
	private SnakeView sv;

	public GameView(SnakeList s, Bird b, Corn[] c) {
		sv = new SnakeView(s, b, c);
		this.add(sv);
		
		setSize(Finals.W_WIDTH + Finals.TILESIZE * 3, Finals.W_HEIGHT + Finals.TILESIZE * 3);
		setResizable(false);
		setTitle(Variables.playerName);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}