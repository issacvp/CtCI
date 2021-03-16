package CH01;

public class Q15OneEdit {

	public boolean isOneEdit(String first, String second) {
		int edit = 0;
		int firstLength = first.length();
		int secondLength = second.length();
		char[] firstArr = first.toCharArray();
		char[] secondArr = second.toCharArray();
		int i = 0, j = 0;
		if (Math.abs(firstLength - secondLength) > 1) {
			return false;
		}
		while (i < firstLength && j < secondLength) {
			if (firstArr[i] != secondArr[j])  {
				edit++;
				if ((j + 1) < secondLength && firstArr[i] == secondArr[j + 1]) {
					j++;
				}
				if ((i + 1) < firstLength && firstArr[i + 1] == secondArr[j]) {
					i++;
				}
			}
			i++;j++;
			if(edit > 1) {
				return false;
			}
		}
		return true;
	}
}
