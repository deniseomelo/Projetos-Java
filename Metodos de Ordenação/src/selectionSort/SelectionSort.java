package selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] array = {5,7,2,1,6,3,4};
		selectionSort(array);

		System.out.println(Arrays.toString(array));

	}

	private static void selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int menor = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[menor]) {
					menor = j;
				}
			}
			int temp = array[menor];
			array[menor] = array[i];
			array[i] = temp;
		}
	}

}

