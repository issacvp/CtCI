package CH01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q14PalindromePermutationsTest {
	Q14PalindromePermutations q14 = new Q14PalindromePermutations();

	@Test
	void testIsPalindromePermutation() {
		assertTrue(q14.isPalindromePermutation("Tact coa"));
		assertTrue(q14.isPalindromePermutation("Malayalam"));
		assertTrue(q14.isPalindromePermutation("taco cat"));
		assertTrue(q14.isPalindromePermutation("atco cta"));
		assertFalse(q14.isPalindromePermutation("Bell rings"));
	}
	
	@Test
	void testIsPalindromePermutation2() {
		assertTrue(q14.isPalindromePermutation2("Tact coa"));
		assertTrue(q14.isPalindromePermutation2("Malayalam"));
		assertTrue(q14.isPalindromePermutation2("taco cat"));
		assertTrue(q14.isPalindromePermutation2("atco cta"));
		assertFalse(q14.isPalindromePermutation2("Bell rings"));
	}

}
