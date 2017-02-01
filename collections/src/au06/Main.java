/**
 * @author kojote
 * @version 1.1
 * 
 * Testing environment for Java Collections creating an instance for each class for testing.
 */

package au06;

public class Main {
	private static ArrayListTest alt;
	private static LinkedListTest llt;
	private static HashSetTest hst;
	private static TreeSetTest tst;
	private static TreeMapTest tmt;
	private static HashMapTest hmt;
	
	public static void main(String[] args) {
		alt = new ArrayListTest(10);
		llt = new LinkedListTest(10);
		hst = new HashSetTest(10);
		tst = new TreeSetTest(10);
		hmt = new HashMapTest(10);
		tmt = new TreeMapTest(10);
		
		System.out.println("\n-= ArrayList ---- ----");
		test(alt);
		System.out.println("\n-= LinkedList ---- ----");
		test(llt);
		System.out.println("\n-= HashSet ---- ----");
		test(hst);
		System.out.println("\n-= TreeSet ---- ----");
		test(tst);
		System.out.println("\n-= HashMap ---- ----");
		test(hmt);
		System.out.println("\n-= TreeMap ---- ----");
		test(tmt);
	}
	/**
	 * @param t
	 */
	private static void test(Testable t) {
		t.addTest();
		t.removeTest();
		t.searchTest();
	}
}