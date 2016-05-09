package au01_reichl;

/**
 * @author Markus Reichl
 * @version 2015-09-14
 * 
 * I'm a contact with attributes firstName, lastName and number.
 */

class Contact {
    protected String firstName;
    protected String lastName;
    protected String number;
    
    public Contact(String fn, String ln, String pn) {
        this.firstName = fn;
        this.lastName = ln;
        this.number = pn;
    }
}