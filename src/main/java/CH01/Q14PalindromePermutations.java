package CH01;

import java.util.Hashtable;
import java.util.Set;

public class Q14PalindromePermutations {

	public boolean isPalindromePermutation(String input) {
		Hashtable<Character, Integer> dict = new Hashtable<>();
		input = input.toLowerCase();
		char[] strArr = input.toCharArray();
		for (Character val : strArr) {
			if (val != ' ') {
				if (dict.containsKey(val)) {
					dict.put(val, dict.get(val) + 1);
				} else {
					dict.put(val, 1);
				}
			}
		}
		Set<Character> charSet = dict.keySet();
		boolean isPalinPerm = true;
		int numOdds = 0;
		for (char val : charSet) {
			if (dict.get(val) % 2 == 1) {
				numOdds++;
			}
		}
		return numOdds <= 1;
	}

	private int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}

	public boolean isPalindromePermutation2(String input) {
		int numOdds = 0;
		int[] table = new int[26];
		for(char c : input.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1) {
				table[x]++;
				if(table[x]%2==1) {
					numOdds++;
				}else {
					numOdds--;
				}
			}
		}
		
		return numOdds <=1;
	}

}
