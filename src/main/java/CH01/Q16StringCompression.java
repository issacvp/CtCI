package CH01;

public class Q16StringCompression {

	public String compress(String data) {
		int pointer = 0;
		char[] array1 = data.toCharArray();
		char[] array2 = new char[array1.length];
		for (int i = 0; i < array1.length; i++) {
			char currChar = array1[i];
			int num = 0;
			int j = i;
			while (j < array1.length && array1[j] == currChar) {
				num++;
				j++;
				//System.out.println(currChar + " num: " + num + " i: " + i + " j: " + j);
			}
			i = j - 1;
			array2[pointer++] = currChar;
			array2[pointer++] = (char) (num + '0');
		}
		if (pointer >= array1.length) {
			return data;
		} else {
			array2[pointer] = '\0';
			return new String(array2);
		}
	}

	public String compress2(String data) {
		int finalLength = countLength(data);
		if (finalLength >= data.length())
			return data;
		StringBuilder compressed = new StringBuilder(finalLength);
		int countConsecutive = 0;
		for (int i = 0; i < data.length(); i++) {
			countConsecutive++;
			if (i + 1 >= data.length() || data.charAt(i) != data.charAt(i + 1)) {
				compressed.append(data.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.toString();
	}

	public int countLength(String data) {
		int compressedLength = 0;
		int countConsecutive = 0;
		for (int i = 0; i < data.length(); i++) {
			countConsecutive++;
			if (i + 1 >= data.length() || data.charAt(i) != data.charAt(i + 1)) {
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive = 0;
			}
		}
		return compressedLength;
	}

	public static void main(String[] args) {
		Q16StringCompression obj = new Q16StringCompression();
		System.out.println(obj.compress("aabcccccccaaa"));
		System.out.println(obj.compress2("aabcccccccaaa"));
	}

}
