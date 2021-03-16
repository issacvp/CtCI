package CH01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
class Q13URLifyTest {
	Q13URLify q13 = new Q13URLify();
	
	@Test
	@Order(3)
	void testUrlify() {
		String str = "Mr John Smith    ";
		int length = 13;
		String result = q13.urlify(str, length);
		String expected = "Mr%20John%20Smith";
		assertTrue(expected.equals(result));
	}
	@Test
	@Order(2)
	void testUrlify2() {
		String str = "Mr  John Smith   ";
		int length = 14;
		String result = q13.urlify(str, length);
		String expected = "Mr%20John%20Smith";
		assertTrue(expected.equals(result));
	}
	
	@Test
	@Order(1)
	void testUrlify3() {
		String str = " Mr  John Smith     ";
		int length = 15;
		String result = q13.urlify(str, length); 
		String expected = "%20Mr%20John%20Smith";
		assertTrue(expected.equals(result));
	}
	
	@Test
	@Order(1)
	void testUrlify4() {
		String str = "   ";
		int length = 1;
		String result = q13.urlify(str, length); 
		String expected = "%20";
		assertTrue(expected.equals(result));
	}
	
	

}
