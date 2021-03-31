package CH01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q18ZeroMatrixTest {
	Q18ZeroMatrix q = new Q18ZeroMatrix();
	private void printArray(int array[][]) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
	}
	@Test
	void testIsZeroMatrix() {
		int array[][] = {{1,2,3},{4,5,6}};
		
		q.nullifyRow(array, 1);
		printArray(array);
	}
	@Test
	void testIsZeroMatrix1() {
		int array[][] = {{1,2,3},{4,5,6}};
		q.nullifyColumn(array, 2);
		printArray(array);
	}

}
