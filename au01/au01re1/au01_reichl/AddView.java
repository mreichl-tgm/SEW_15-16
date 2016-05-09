package au01_reichl;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Markus Reichl
 * @version 2015-09-14
 * 
 * I draw the AddView!
 */

public class AddView extends JFrame {
	private GUIController gc;
	
	private JButton bBackAM;
	private JButton bSave;
	private JTextField fn = new JTextField();
	private JTextField ln = new JTextField();
	private JTextField nb = new JTextField();
	
	public AddView(GUIController c) {
		this.gc = c;
		
		this.bBackAM = new JButton("Back");
		this.bSave = new JButton("Save");
		
		this.bSave.addActionListener(this.gc);
		this.bBackAM.addActionListener(this.gc);
		
		this.setLayout(new GridLayout(4, 2));
		
		this.add(new JLabel("First Name:"));
		this.add(fn);
		this.add(new JLabel("Last Name:"));
		this.add(ln);
		this.add(new JLabel("Number:"));
		this.add(nb);
		this.add(this.bBackAM);
		this.add(this.bSave);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(320, 196);
		this.setTitle("3AHIT Phonebook");
		this.setVisible(true);
	}
	/**
	 * 	@return Contact
	 */
	public Contact getContact() {
		String fn = this.fn.getText();
		String ln = this.ln.getText();
		String nb = this.nb.getText();
		Contact c = new Contact(fn, ln, nb);
		return c;
	}
	/**
     * @param e
     * @return returns true if source equals button
     */
	public boolean isButtonBackAM(ActionEvent e) {
		return e.getSource() == this.bBackAM;
	}
	/**
     * @param e
     * @return returns true if source equals button
     */
	public boolean isButtonSave(ActionEvent e) {
		return e.getSource() == this.bSave;
	}
}