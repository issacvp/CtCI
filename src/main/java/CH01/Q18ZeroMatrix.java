package CH01;

/**
 * 
 * @author ivliv
 *
 *         1.8 Zero Matrix: Write an algorithm such that if an element in an MxN
 *         matrix is 0, its entire row and column are set to 0. Hints:#17, #74,
 *         #702
 * 
 */
public class Q18ZeroMatrix {
	public void setZeroMatrix(int[][] array, int m, int n) {
		boolean rowHasZero = false;
		boolean columnHasZero = false;
		// Check if first row has Zero
		for (int i = 0; i < array[0].length; i++) {
			if (array[0][i] == 0) {
				rowHasZero = true;
				break;
			}
		}
		// Check if first column has Zero
		for (int i = 0; i < array.length; i++) {
			if (array[i][0] == 0) {
				columnHasZero = true;
				break;
			}
		}
		// Set Zero for the rest of the array
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[0].length; j++) {
				if(array[i][j] == 0) {
					array[i][0] = 0;
					array[0][j] = 0;
				}
			}
		}
		//nullify all rows based on the first column;
		for (int i = 1; i < array.length; i++) {
			if (array[i][0] == 0) {
				nullifyRow(array, i);
			}
		}
		//nullify all columns based on the first row
		for (int i = 1; i < array[0].length; i++) {
			if (array[0][i] == 0) {
				nullifyColumn(array, i);
			}
		}
		//Nullify first row
		if(rowHasZero) {
			nullifyRow(array, 0);
		}
		//Nullify first column
		if(columnHasZero) {
			nullifyColumn(array, 0);
		}
	}

	public void nullifyRow(int[][] array, int row) {
		for (int i = 0; i < array[row].length; i++) {
			array[row][i] = 0;
		}
	}

	public void nullifyColumn(int[][] array, int column) {
		for (int i = 0; i < array.length; i++) {
			array[i][column] = 0;
		}
	}
}
