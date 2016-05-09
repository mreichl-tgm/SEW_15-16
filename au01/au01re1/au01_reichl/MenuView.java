package au01_reichl;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Markus Reichl
 * @version 2015-09-14
 * 
 * I like drawing!
 */

public class MenuView extends JFrame {
	private GUIController gc;
	
	private JButton bShow;
	private JButton bAdd;
	private JButton bQuit;
	
	public MenuView(Phonebook p, GUIController gc) {
		this.gc = gc;
		
		this.bShow = new JButton("Show");
		this.bAdd = new JButton("Add");
		this.bQuit = new JButton("Quit");
		
		this.bAdd.addActionListener(this.gc);
		this.bQuit.addActionListener(this.gc);
		this.bShow.addActionListener(this.gc);
		
		this.setLayout(new GridLayout(3, 1));
		this.add(this.bShow);
		this.add(this.bAdd);
		this.add(this.bQuit);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(320, 196);
		this.setTitle("3AHIT Phonebook");
		this.setVisible(true);
	}
	/**
     * @param e
     * @return returns true if source equals to button
     */
	public boolean isButtonQuit(ActionEvent e) {
		return e.getSource() == this.bQuit;
	}
	/**
     * @param e
     * @return returns true if source equals to button
     */
	public boolean isButtonAdd(ActionEvent e) {
		return e.getSource() == this.bAdd;
	}
	/**
     * @param e
     * @return returns true if source equals to button
     */
	public boolean isButtonShow(ActionEvent e) {
		return e.getSource() == this.bShow;
	}
}