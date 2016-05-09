package au01_reichl;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Markus Reichl
 * @version 2015-09-14
 * 
 * I am a phonebook with all functions
 */

public class Phonebook {
    private ArrayList<Contact> pb;
    private RandomAccessFile raf;
    
    public Phonebook() {
    	try {
			raf = new RandomAccessFile("raf.txt", "rw");
		} catch (FileNotFoundException e) { 
			System.out.println("File not found! -> Create on in projects root folder!");;
			e.printStackTrace();
    	}
        pb = loadBook(raf);
    }
    
    /**
     * Adds a Contact to our current phonebook list
     * @param fn
     * @param ln
     * @param pn
     * @return Contact
     */
    public Contact addContact(String fn, String ln, String pn) {
        Contact c = new Contact(fn, ln, pn);
        pb.add(c);
        return c;
    }
    /**
     * Removes a Contact Object from our list
     * @param s
     * @return Contact"
     */
    public Contact removeContact(String s) {
        for (Contact c : pb) {
            if ((c.firstName + " " + c.lastName).equals(s)) {
                pb.remove(c);
                return c;
            }
        }
        return null;
    }
    /**
     * Prints a given Contact with Method showContact(String s)
     * @param s
     * @return Contacts as List
     */
    public ArrayList<Contact> findContact(String s) {
        int i = 0;
        ArrayList<Contact> pBuffer = new ArrayList<Contact>();
        for (Contact c: pb) {
            if (c.firstName.contains(s)) {
                pBuffer.add(c);
                i++;
            } else if (c.lastName.contains(s)) {
                pBuffer.add(c);
                i++;
            } else if (c.number.contains(s)) {
                pBuffer.add(c);
                i++;
            }
        }
        if (i == 0) {
            return null;
        } else {
            return pBuffer;
        }
    }
    /**
     * @return Phonebook as List
     */
    public ArrayList<Contact> getBook() {
        return pb;
    }
    /** 
     * Sorts our phonebook by firstnames
     * @return Boolean
     */
    public boolean sortBook() {
        Collections.sort(pb, (Contact c1, Contact c2) -> {
            return c1.firstName.compareTo(c2.firstName);
        });
        return true;
    }
    /**
     * @param raf
     * @return ArrayList
     */
    public ArrayList<Contact> loadBook(RandomAccessFile raf) {
    	String s = "";
    	String fn = "";
    	String ln = "";
    	String nb = "";
    	ArrayList<Contact> pb = new ArrayList<Contact>();
    	
    	try {
    		this.raf.seek(0);
    		this.raf.writeUTF("~");
			while (true) {
				s = raf.readLine();
				if (s == null) break;
				else if (!s.contains("~")) {
					fn = s.substring(s.indexOf("#") + 1, s.indexOf("|"));
					ln = s.substring(s.indexOf("|") + 1, s.lastIndexOf("|"));
					nb = s.substring(s.lastIndexOf("|") + 1, s.length());
					pb.add(new Contact(fn, ln, nb));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return pb;
    }
    
    /**
     * Saves our Book into raf file
     */
    public void saveBook() {
    	try {
			this.raf.seek(0);
	    	for (Contact c : pb) {
	    		this.raf.writeUTF("#" + c.firstName + "|" + c.lastName + "|" + c.number + "\n");
	    	}
    	} catch (IOException e) {
			e.printStackTrace();
    	}
    }
}