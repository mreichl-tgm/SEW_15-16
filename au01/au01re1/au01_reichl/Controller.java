package au01_reichl;

import java.util.Scanner;

/**
 * @author Markus Reichl
 * @version 2015-09-14
 * 
 * Ich kreiere ein Telefonbuch und verwalte die Benutzerschnittstelle und 
 * steuere die Methoden welche das Telefonbuch zur Verfügung stellt.
 */

public class Controller {
    Phonebook p;
    Scanner scnr;
    boolean quit;
    
    public Controller() {
        p = new Phonebook();
        scnr = new Scanner(System.in);
        quit = false;
        showHelp();
        
        while (!quit) {            
            System.out.println("Command:");
            String s = scnr.nextLine();
            String buffer = s;
            String params = "";
            
            if (s.contains(" ")) {
                buffer = s.substring(0, s.indexOf(" "));
                params = s.substring(s.indexOf(" ") + 2, s.length() - 1);
            }
            
            switch(buffer) {
                case "show":
                    for (Contact c : p.getBook()) {
                        System.out.println(c.firstName + " " + c.lastName);
                        System.out.println(c.number);
                        System.out.println("***");
                    }
                    System.out.println("Show Successfull!");
                    break;
                    
                case "add":
                    System.out.println("First Name:");
                    String fn = scnr.nextLine();
                    System.out.println("Last Name:");
                    String ln = scnr.nextLine();
                    System.out.println("Number:");
                    String pn = scnr.nextLine();
                    
                    p.addContact(fn, ln, pn);
                    System.out.println("Add Successfull!");
                    break;
                    
                case "remove":
                    System.out.println(p.removeContact(params));
                    break;
                
                case "find":
                    System.out.println(p.findContact(params));
                    break;
                
                case "sort":
                    p.sortBook();
                    System.out.println("Sort Successful!");
                    break;
                    
                
                case "help":
                    showHelp();
                    System.out.println("Feel Helped!");
                    break;
                    
                case "quit":
                    quit = true;
                    break;
                
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        }
    }

    // Helps our User with the console commands!
    private void showHelp() {
        System.out.println("show -> Shows whole Book");
        System.out.println("add -> Adds a new Contact");
        System.out.println("remove 'name/number' -> Removes a Contact");
        System.out.println("find 'name/number' -> Shows Contacts");
        System.out.println("sort -> Sorts whole Book");
        System.out.println("help -> Shows Help");
        System.out.println("quit -> Exits Program");
    }
}