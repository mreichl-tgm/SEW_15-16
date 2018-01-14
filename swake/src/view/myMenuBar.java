package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class myMenuBar extends JMenuBar {
	
	private JMenu menu;
	private JMenuItem item;
	
	public myMenuBar() {
		super();
		
		this.menu = new JMenu("Help");
		this.item = new JMenuItem("Me");
		
		this.menu.add(item);
		this.add(menu);
	}
	
}
