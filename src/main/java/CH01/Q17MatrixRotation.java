package CH01;

public class Q17MatrixRotation {

	public int[][] matrixRotation(int data[][]){
		int data2[][] = new int[data.length][data.length];
		for(int i=0;i<data.length;i++) {
			for(int j=0; j< data[i].length;j++) {
				data2[j][data.length-(i+1)] = data[i][j];
			}
		}
		return data2;
	}
	public static void main(String[] args) {
		Q17MatrixRotation obj = new Q17MatrixRotation();
		int data[][] = { { 1, 2, 3, 4 },
				         { 5, 6, 7, 8 },
				         { 9, 10, 11, 12 },
				         { 13, 14, 15, 16 } };
		data = obj.matrixRotation(data);
		for(int i=0;i<data.length;i++) {
			for(int j=0; j< data[i].length;j++) {
				System.out.print(data[i][j] +"\t");
			}
			System.out.println("\n\n");
		}
	}

}
