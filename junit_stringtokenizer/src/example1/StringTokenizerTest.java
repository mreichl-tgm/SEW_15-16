package example1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.CORBA.TRANSACTION_MODE;

import java.util.StringTokenizer;

import java.util.NoSuchElementException;

public class StringTokenizerTest {
	/**
	 * Tests if nextToken() throws an exception when there are no tokens left
	 */
	@Test
	public void testNextToken() {
		StringTokenizer st = new StringTokenizer("");
		
		try {
			st.nextToken();
			fail("No Excpetion thrown!");
		} catch (NoSuchElementException e) {
			return;
		} catch (Exception e) {
			fail("Wrong exception!");
		}
	}
	/**
	 * Tests if nextToken(String str) throws an exception when str is null
	 */
	@Test
	public void testNextTokenDelim() {
		StringTokenizer st = new StringTokenizer("Test me");
		
		try {
			st.nextToken(null);
			fail("No Exception!");
		} catch (NullPointerException e) {
			return;
		} catch (Exception e) {
			fail("Wrong Exception!");
		}
	}
	/**
	 * Tests if countTokens() actully counts tokens :)
	 */
	@Test
	public void testCountTokens() {
		StringTokenizer st = new StringTokenizer("Test me if you can!");
		
		int count = st.countTokens();
		assertEquals(5, count);
	}
	/**
	 * Tests if hasMoreTokens() returns true/false if there are tokens left or not
	 */
	@Test
	public void testHasMoreTokens() {
		StringTokenizer st = new StringTokenizer("Test me");
		boolean b;
		
		st.nextToken();
		b = st.hasMoreTokens();
		assertEquals(b, true);
		st.nextToken();
		b = st.hasMoreTokens();
		assertEquals(b, false);
	}
	
	@Test
	public void testWhiteSpacesOnly() {
		StringTokenizer st = new StringTokenizer("     ");
		
		int count = st.countTokens();
		System.out.println(count);
	}

}