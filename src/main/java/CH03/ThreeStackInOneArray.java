package CH03;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ThreeStackInOneArray<E> {

	private int index = 0;
	private static Object[] array = new Object[100];
	private static int[] lengths = new int[3];
	public ThreeStackInOneArray(int index) {
		this.index = index;
	}
	public void push(E e) {
		ThreeStackInOneArray.array[ThreeStackInOneArray.lengths[this.index]*3+this.index]=e;
		ThreeStackInOneArray.lengths[this.index]++;
		return;
	}
	//TODO autoincrement size of object array 
	//TODO inmeplemt unlimited stacks.
	public E pop() throws NoSuchElementException{
		if(ThreeStackInOneArray.lengths[this.index]==0) {
			throw new NoSuchElementException();
		}
		E object = (E) ThreeStackInOneArray.array[(ThreeStackInOneArray.lengths[this.index]-1)*3+this.index];
		ThreeStackInOneArray.lengths[this.index]--;
		return object;
	}
	public String toString() {
		StringBuffer str = new StringBuffer();
		for(int i=0;i<ThreeStackInOneArray.lengths[this.index];i++) {
			str.append(i+" : ");
			str.append(ThreeStackInOneArray.array[i*3+this.index].toString()+", ");
		}
		return str.toString();
	}
	public static void main(String args[]) {
		ThreeStackInOneArray<Integer> stack0 = new ThreeStackInOneArray<>(0);
		ThreeStackInOneArray<String> stack1 = new ThreeStackInOneArray<>(1);
		ThreeStackInOneArray<Double> stack2 = new ThreeStackInOneArray<>(2);
		stack0.push(1);
		stack0.push(2);
		System.out.println(stack0);
		System.out.println(stack0.pop());
		System.out.println(stack0.pop());
		System.out.println(stack0);
		System.out.println(stack0.pop());
	}
}
