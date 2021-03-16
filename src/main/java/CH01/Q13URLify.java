package CH01;
/*
 * Write a method to replace all spaces in a string with '%20'. You may assume that the sTring has sufficient space at the end to hold the additional chars.
 * And that you are given the true length of the string.
 */

/*
 * Solution :
 * 'Mr John Smith    ',13
 * 'Mr%20John%20Smith' 
 * 'Mr%20John%20Smith
 * 'Mr%20John%20Smith'      
 */
public class Q13URLify {
	public String urlify(String input, int length) {
		char[] charArr = input.toCharArray();	
		for(int i=input.length()-1, j=length-1; i>=0 && j>=0; j--) {
			if(charArr[j]==' ') {
				if(j>0 && charArr[j-1]==' ') {
					continue;
				}
				charArr[i--]='0';
				charArr[i--]='2';
				charArr[i--]='%';
			} else {
				charArr[i--]=charArr[j];
			}
		}
		return new String(charArr);
	}
}