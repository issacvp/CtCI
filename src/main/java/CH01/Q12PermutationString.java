package CH01;

import java.util.Hashtable;
import java.util.Set;

public class Q12PermutationString {

	boolean isPermutation(String input1, String input2) {
		Hashtable<Character, Integer> dict1 = new Hashtable<>();
		Hashtable<Character, Integer> dict2 = new Hashtable<>();
		input1 = input1.toLowerCase();
		char[] strArr = input1.toCharArray();
		for(Character val : strArr) {
			if(val!=' ') {
				if(dict1.containsKey(val)) {
					dict1.put(val, dict1.get(val)+1);
				} else {
					dict1.put(val,1);
				}
			}
		}
		
		input2 = input2.toLowerCase();
		strArr = input2.toCharArray();
		for(Character val : strArr) {
			if(val!=' ') {
				if(dict2.containsKey(val)) {
					dict2.put(val, dict2.get(val)+1);
				} else {
					dict2.put(val,1);
				}
			}
		}
		Set<Character> charSet1 = dict1.keySet();
		Set<Character> charSet2 = dict2.keySet();
		if(charSet1.size()==charSet2.size()) {
			for(char val : charSet1) {
				if(dict2.containsKey(val) && dict1.get(val) == dict2.get(val)) {
					continue;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
		
	}
}
