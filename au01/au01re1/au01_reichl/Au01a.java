package au01_reichl;

import javax.swing.JOptionPane;

/**
 * @author Markus Reichl
 * @version 2015-09-14
 * Ich mache ein Array mit 10 Stellung und kann ausgeben und einfügen, 
 * vollkommen undynamisch!
 */
public class Au01a {
    public static void main(String[] args) {
        String[] arr = new String[10];
        int i = 0;
        
        while (true) {
            String s = JOptionPane.showInputDialog("Was willst du tun? (A, E, X)");

            switch(s) {
                case "A": 
                    for (String s1 : arr) {
                        System.out.println(s1);
                    }
                    break;
                case "E":
                    if (i < arr.length) {
                        arr[i] = JOptionPane.showInputDialog("Gib Namen ein:");
                        i++;
                    } else {
                        System.out.println("Voll!");
                    }
                    break;
                case "X": 
                    System.out.println("Nullpointer <3");
                    return;
                default : break;
            }
        }
    }
}