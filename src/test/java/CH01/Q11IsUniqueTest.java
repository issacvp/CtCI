package CH01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q11IsUniqueTest {
	Q11IsUnique q = new Q11IsUnique();

	@Test
	void testIsUniqueFirst() throws Exception {
		assertFalse(q.isUniqueFirst("issac"));
		assertTrue(q.isUniqueFirst("true"));
		assertFalse(q.isUniqueFirst("falsee"));
	}

	@Test
	void testIsUniqueSecond() throws Exception {
		assertFalse(q.isUniqueSecond("issac"));
		assertTrue(q.isUniqueSecond("true"));
		assertFalse(q.isUniqueSecond("falsee"));
	}

	@Test
	void testIsUniqueThird() throws Exception {
		assertFalse(q.isUniqueThird("issac"));
		assertTrue(q.isUniqueThird("true"));
		assertFalse(q.isUniqueThird("falsee"));
	}

}
