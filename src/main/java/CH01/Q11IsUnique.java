package CH01;

import java.util.HashSet;

public class Q11IsUnique {

	/*
	 * Having O(n^2) complexity 
	 * Have to iterate through second string each time of the length 
	 * May be say , N , N-1 , N-2, ........3,2,1    N(N-1)/2   => O(N)
	 * So O(N^2)
	 * */
	public boolean isUniqueFirst(String input) throws Exception {
		if(input == null || input.length() <1 ) {
			throw new Exception("Invalid input");
		}
		String copy = new String(input);
		for(int i=0;i<input.length();i++) {
			for(int j=i+1;j<copy.length();j++) {
				if(input.charAt(i)==copy.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/*
	 * O(128) => O(1) for boolean array initialization 
	 * O(N) String iteration 
	 * O(1) for index finding in array 
	 * So total O(N)
	 * But only for ASCII characters
	 * */
	public boolean isUniqueSecond(String input) throws Exception {
		if(input == null || input.length() <1 ) {
			throw new Exception("Invalid input");
		}
		boolean charArray[] = new boolean[128];
		for(int i =0; i< charArray.length; i++) {
			charArray[i] =false;
		}
		for(int i = 0; i< input.length();i++) {
			int cha = input.charAt(i);
			if(charArray[cha]) {
				return false;
			} else {
				charArray[cha] = true;
			}
		}
		return true;
	}
	/*
	 * HashSet.contains()  is O(1)  because it is backed by Hashset 
	 * then O(n) for string iteration
	 * */
	public boolean isUniqueThird(String input) throws Exception {
		if(input == null || input.length() <1 ) {
			throw new Exception("Invalid input");
		}
		java.util.HashSet<Character> charSet = new HashSet<>();
		for(int i=0;i<input.length();i++) {
			if(charSet.contains(input.charAt(i))){
				return false;
			} else {
				charSet.add(input.charAt(i));
			}
		}
		return true;
	}

}
