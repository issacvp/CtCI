package CH01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q15OneEditTest {
	Q15OneEdit q15 = new Q15OneEdit();

	@Test
	void testIsOneEdit() {
		assertFalse(q15.isOneEdit("pale", "pl"));
	}
	@Test
	void testIsOneEdit1() {
		assertTrue(q15.isOneEdit("pale", "ple"));
	}
	@Test
	void testIsOneEdit2() {
		assertTrue(q15.isOneEdit("pales", "pale"));
	}
	@Test
	void testIsOneEdit3() {
		assertTrue(q15.isOneEdit("pale", "bale"));
	}
	@Test
	void testIsOneEdit4() {
		assertFalse(q15.isOneEdit("pale", "bake"));
	}
	@Test
	void testIsOneEdit5() {
		assertTrue(q15.isOneEdit("apple", "aple"));
	}

}
