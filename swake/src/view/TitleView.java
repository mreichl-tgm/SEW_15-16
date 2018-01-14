package view;

import javax.swing.JFrame;

import constants.Finals;
import constants.Variables;

public class TitleView extends JFrame {
	
	public TitleView() {
		setSize(Finals.W_WIDTH + Finals.TILESIZE * 3, Finals.W_HEIGHT + Finals.TILESIZE * 3);
		setResizable(false);
		setTitle(Variables.playerName);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}