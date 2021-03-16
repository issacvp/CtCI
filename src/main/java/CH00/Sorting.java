package CH00;


public class Sorting {

	int[] bubbleSort(int[] array) {
		int temp = 0;
		if (array != null && array.length > 1) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - (i + 1); j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			return array;

		} else {
			return array;
		}
	}

	int[] selectionSort(int[] array) {
		if (array != null && array.length > 1) {
			for (int i = array.length - 1; i > 0; i--) {
				int large = 0;
				for (int j = 0; j <= i; j++) {
					if (array[j] > array[large]) {
						large = j;
					}
				}
				int temp = array[i];
				array[i] = array[large];
				array[large] = temp;
			}
			return array;
		} else {
			return array;

		}
	}

	int[] insertionSort(int[] array) {
		if (array != null && array.length > 1) {
			for (int i = 1; i < array.length; i++) {
				int newEl = array[i];
				int j = i;
				for (; j > 0 && array[j - 1] > newEl; j--) {
					array[j] = array[j - 1];
				}
				array[j] = newEl;
			}
			return array;
		} else {
			return array;
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 20, 30, -15, 7, 55, 1, -22 };
		int[] array;
		Sorting sort = new Sorting();

		System.out.println("Bubble Sort");
		array = sort.bubbleSort(array1);
		for (int a : array) {
			System.out.print(a + ",");
		}

		System.out.println("\nSelection Sort");
		// int [] array = {10,3,45};
		array = sort.selectionSort(array1);
		for (int a : array) {
			System.out.print(a + ",");
		}

		System.out.println("\nInserstion Sort");
		// int [] array = {10,3,45};
		array = sort.insertionSort(array1);
		for (int a : array) {
			System.out.print(a + ",");
		}

	}

}
