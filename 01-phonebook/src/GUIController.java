package au01_reichl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author Markus Reichl
 * @version 2015-09-28
 * 
 * I rule the GUI!
 */

public class GUIController implements ActionListener {
	private Phonebook p;
	private MenuView mv;
	private ShowView sv;
	private AddView av;
	
	public GUIController() {
		this.p = new Phonebook();
		this.mv = new MenuView(p, this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.mv.isButtonQuit(e)) {
			p.saveBook();
			System.exit(0);
		}
		
		if (this.mv.isButtonAdd(e)) {
			av = new AddView(this);
		}
		
		if (this.mv.isButtonShow(e)) {
			sv = new ShowView(this);
		}
		if (this.av != null) {
			if (this.av.isButtonBackAM(e)) {
				av.dispose();
			}
			
			if (this.av.isButtonSave(e)) {
				String fn = av.getContact().firstName;
				String ln = av.getContact().lastName;
				String pn = av.getContact().number;
				this.p.addContact(fn, ln, pn);
			}
		}

		if (this.sv != null) {
			if (this.sv.isButtonBackSM(e)) {
				sv.dispose();
			}
		}
	}
	
	/*
	 * @return Phonebook as ArrayList
	 */
	public ArrayList<Contact> getBook() {
		return this.p.getBook();
	}
}