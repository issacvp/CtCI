package CH00;
public class Q04Fibonacci {
 	void fiboBrute(int n) {
		int start = 0;
		int next =1;
		int temp = 0;
		System.out.print(start);
		System.out.print(next);
		for(int i=2;i<n;i++) {
			temp = start;
			start = next;
			next +=temp;
			System.out.print(next);
		}
		System.out.println("");
	}
	int fiboRecurse(int n) {
		if(n<=0) return 0;
		else if(n==1) return  1;
		else
		return fiboRecurse(n-1)+fiboRecurse(n-2);
	}
	int fiboRecurseMemorization(int n, int[] mem) {
		if(n<=0) return 0;
		else if (n==1) return 1;
		else if(mem[n] >0) return mem[n];
		mem[n] = fiboRecurseMemorization(n-1, mem)+fiboRecurseMemorization(n-2, mem);
		return mem[n];
	}
	
	void fibo(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(fiboRecurse(i));
		}
		System.out.println("");
		
		int[] mem = new int[n+1];
		for(int i=0;i<n;i++) {
			System.out.print(fiboRecurseMemorization(i,mem));
		}
	}
	
	public static void main(String[] args) {
		Q04Fibonacci ex = new Q04Fibonacci();
		ex.fiboBrute(5);
		ex.fibo(5);

	}

}
