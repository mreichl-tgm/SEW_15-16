package example1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.StringTokenizer;

import java.util.NoSuchElementException;

public class StringTokenizerTest {
	
	@Test
	public void countTokensTest() {
		StringTokenizer st = new StringTokenizer("Test me if you can!");
		int count = st.countTokens();
		System.out.println(count);
		assertEquals(5, count);
	}
	
	@Test
	public void nextTokenTest() {
		StringTokenizer st = new StringTokenizer("");
		try {
			st.nextToken();
		} catch (NoSuchElementException e) {
			assertEquals("NoSuchElementException", e);
		}
	}

}