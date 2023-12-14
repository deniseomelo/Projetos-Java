package mergeSost;


import java.util.Arrays;


public class MergeSort {

	public static void mergeSort(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		int[] aux = new int[array.length];
		mergeSort(array, aux, 0, array.length - 1);
	}

	private static void mergeSort(int[] array, int[] aux, int esq, int dir) {
		if (esq >= dir) {
			return;
		}
		int meio = esq + (dir - esq) / 2;
		mergeSort(array, aux, esq, meio);
		mergeSort(array, aux, meio + 1, dir);
		merge(array, aux, esq, meio, dir);
	}

	private static void merge(int[] array, int[] aux, int esq, int meio, int dir) {
		for (int i = esq; i <= dir; i++) {
			aux[i] = array[i];
		}
		int i = esq;
		int j = meio + 1;
		int k = esq;
		while (i <= meio && j <= dir) {
			if (aux[i] <= aux[j]) {
				array[k++] = aux[i++];
			} else {
				array[k++] = aux[j++];
			}
		}
		while (i <= meio) {
			array[k++] = aux[i++];
		}
	}



	public static void main(String[] args) {
		int[] array = {3,  4, 1, 5, 10,9, 2, 6, 7, 8};
		mergeSort(array);
		System.out.println(Arrays.toString(array));
	}
}
