package CH01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Q17MatrixRotationTest {

	Q17MatrixRotation obj = new Q17MatrixRotation();

	private boolean arraysEqual(int[][] a, int[][] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
			for (int j = 0; j < a.length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	// 2 x 2 Matrix
	//@Test
	void matrixRotationTest() throws Exception {
		int data[][] = { { 1, 2 }, { 3, 4 } };
		int expected[][] = { { 3, 1 }, { 4, 2 } };
		obj.matrixRotation(data);
		assertTrue(arraysEqual(data, expected));
	}

	// 3x3 matrix
	//@Test
	void matrixRotationTest1() throws Exception {
		int data[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int expected[][] = { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } };
		obj.matrixRotation(data);
		assertTrue(arraysEqual(data, expected));
	}

	// 4x4 matrix
	@Test
	void matrixRotationTest2() throws Exception {
		int data[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int expected[][] = { { 13, 9, 5, 1 }, { 14, 10, 6, 2 }, { 15, 11, 7, 3 }, { 16, 12, 8, 4 } };
		obj.matrixRotation(data);
		assertTrue(arraysEqual(data, expected));
	}
}
