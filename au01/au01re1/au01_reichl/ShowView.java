package au01_reichl;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Markus Reichl
 * @version 2015-09-14
 * 
 * I draw the show!
 */

public class ShowView extends JFrame {
	private GUIController gc;
	
	private JButton bBackSM;
	
	public ShowView(GUIController gc) {
		this.gc = gc;
		
		this.bBackSM = new JButton("Back");
		
		this.bBackSM.addActionListener(this.gc);
		
		this.setLayout(new GridLayout(gc.getBook().size() + 2, 3));
		this.add(new JLabel("First Name:"));
		this.add(new JLabel("Last Name:"));
		this.add(new JLabel("Number:"));
		for (Contact c : this.gc.getBook()) {
			this.add(new JLabel(c.firstName));
			this.add(new JLabel(c.lastName));
			this.add(new JLabel(c.number));
		}
		
		this.add(this.bBackSM);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1080, 320);
		this.setTitle("3AHIT Phonebook");
		this.setVisible(true);
	}
	/**
     * @param e
     * @return true if source equals button
     */
	public boolean isButtonBackSM(ActionEvent e) {
		return e.getSource() == this.bBackSM;
	}
}