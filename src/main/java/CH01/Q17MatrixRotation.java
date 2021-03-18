package CH01;

/**
 * 
 * 1.7 Rotate Matrix: Given an image represented by an NxN matrix, where each
 * pixel in the image is 4 bytes, write a method to rotate the image by 90
 * degrees. Can you do this in place? Hints: #51, # 100
 * 
 *     [1  2]    [3 1]
 *             => 
 *     [3  4]    [4 2]
 *     [0,0] -> [0,1]
 *     [0,1] -> [1,1]
 *     [1,0] -> [0,0]
 *     [1,1] -> [1,0]
 *     for i =0 to n 
			temp = top[i]
			top[i] = left[i]
			left[i] = bottom[i]
 			bottom[i] = right[i];
 			right[i] = temp
 */
public class Q17MatrixRotation {
	public boolean matrixRotation(int[][] matrix) {
		int n = matrix.length;
		for(int layer=0; layer < n/2 ; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first ; i< last ; i++) {
				int offset = i - first ; 
				int top = matrix[first][i]; // save top
				//first -> top 
				matrix[first][i] = matrix[last-offset][first];
				
				//bottom -> left 
				matrix[last-offset][first] = matrix[last][last-offset];
				
				//right -> bottom 
				matrix[last][last-offset] = matrix[i][last];
				
				//top -> right 
				matrix[i][last] = top; // right  <- saved top 
			}
		}
		return true;
	}
}
