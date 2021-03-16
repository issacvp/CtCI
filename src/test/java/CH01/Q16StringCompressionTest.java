package CH01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q16StringCompressionTest {
	Q16StringCompression obj = new Q16StringCompression();

	@Test
	void testCompress() {
		String str = "aabcccccccaaa";
		assertTrue(obj.compress(str).trim().equals("a2b1c7a3"));
	}

	@Test
	void testCompress2() {
		String str = "aabcccccccaaa";
		assertTrue(obj.compress2(str).equals("a2b1c7a3"));
	}

	@Test
	void testCountLength() {
		String str = "aabcccccccaaa";
		assertEquals(8, obj.countLength(str));
	}

}
