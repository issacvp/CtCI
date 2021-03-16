package CH00;

public class Q06PowersOf2 {

	void powersOf2BruteForce(int n) {
		for (int i = 1; i <= n; i*=2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Q06PowersOf2 ex = new Q06PowersOf2();
		ex.powersOf2BruteForce(100);
	}

}
