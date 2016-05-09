import java.util.*;

/**
 * Kommentierte Musterlösung zu Map / Iterator
 * @author MARM
 * @version 2015-11-17
 */

public class TreeMapTest {
    public static void main(String args[]) {
    	
    	// Das Beispiel ist übersichtlich, aber sinnfrei :)
    	// als Key eine Zahl, als Value die Langform dazu
        TreeMap<Integer, String> m = new TreeMap<>();
        m.put(0, "Null");
        m.put(1, "Eins");
        m.put(2, "Zwei");
        
        // toString() hilft bei Fehlersuche und Logging,
        // ist aber für gezielte Zugriffe ungeeignet:
        System.out.println("--- toString()");
        System.out.println(m.toString());

        // get() ist nur dann möglich,
        // wenn die Keys bekannt sind:
        System.out.println("--- get(i)");
        for (int i=0; i < m.size(); i++) 
        	System.out.println(i + "=" + m.get(i));

        // keySet() liefert alle Keys in einem Set
        // das mittels Iterator durchwandert werden kann:
        System.out.println("--- keySet()");
        Set<Integer> keys = m.keySet();
        Iterator<Integer> i1 = keys.iterator();
        while (i1.hasNext()) {					// klassisch mit
            Integer key = i1.next();			// hasNext() und next()
            System.out.println(key + "=" + m.get(key));
        }
        for (Integer key : m.keySet()) {		// für Schreibfaule :)
            System.out.println(key + "=" + m.get(key));
        }

        // values() liefert alle Values in einer Collection
        // leider gibts damit wegen Mehrdeutigkeit keine Keys :)
        System.out.println("--- values()");
        Collection<String> values = m.values();
        Iterator<String> i2 = values.iterator();
        while (i2.hasNext()) {					// klassisch mit
            String value = i2.next();			// hasNext() und next()
            System.out.println(value + ":" + m.containsValue(value));
        }
        for (String value : m.values()) {		// für Schreibfaule :)
            System.out.println(value + ":" + m.containsValue(value));
        }

        // entrySet() liefert Keys UND Values in einem Set
        // ev. bessere Performance im Vergleich zu keyset() + get()
        System.out.println("--- entrySet()");
        Set<Map.Entry<Integer, String>> entries = m.entrySet();
        Iterator<Map.Entry<Integer, String>> i3 = entries.iterator();
        while (i3.hasNext()) {
            Map.Entry<Integer, String> entry = i3.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
