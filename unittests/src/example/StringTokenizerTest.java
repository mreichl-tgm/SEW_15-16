package example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.StringTokenizer;

import java.util.NoSuchElementException;

public class StringTokenizerTest {

	StringTokenizer st;
	
	@Before
	public void setUp() throws Exception {
		st = new StringTokenizer("Test me if you can!");
	}	
	/**
	 * Tests if nextToken() throws an exception when there are no tokens left
	 */
	@Test
	public void testNextToken() {
		st = new StringTokenizer("");
		
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
	 * Tests if countTokens() actually counts tokens :)
	 */
	@Test
	public void testCountTokens() {
		int count = st.countTokens();
		assertEquals(5, count);
	}
	/**
	 * Tests if hasMoreTokens() returns true/false if there are tokens left or not
	 */
	@Test
	public void testHasMoreTokens() {
		boolean b;
		
		st.nextToken();
		b = st.hasMoreTokens();
		assertEquals(b, true);
		st.nextToken();
		b = st.hasMoreTokens();
		assertEquals(b, false);
	}
}