package view;

import java.awt.Font;

import javax.swing.JLabel;

import constants.Finals;
import constants.Variables;

public class CounterLabel extends JLabel {
	
	public CounterLabel() {
		this.setFont(new Font(this.getFont().getName(), Font.BOLD, Finals.TILESIZE));
	}
	
	public void repaint() {
		this.setText(Variables.highScore + "$");
	}
}
