package CH01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q12PermutationStringTest {
	Q12PermutationString q12 = new Q12PermutationString();
	
	@Test
	void isPermutationTest() {
		assertFalse(q12.isPermutation("vol", "love"));
		assertTrue(q12.isPermutation("evol", "love"));
		assertFalse(q12.isPermutation("fvol", "love"));
		assertTrue(q12.isPermutation("", ""));
	}

}
