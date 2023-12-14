package ExercicioTempo;
/**
 * Repetindo o mesmo procedimento para os outros dois métodos de ordenação, 
 * podemos comparar o tempo de execução dos três algoritmos.

Em geral, a complexidade do insertion sort é O(n²), assim como a do bubble sort e do selection sort.Isso significa que esses algoritmos podem ser bastante lentos para ordenar arrays muito grandes.
  
Por outro lado, o quicksort e o mergesort têm complexidade O(n log n), o que os torna mais rápidos para ordenar arrays grandes.

Portanto, se a performance é um fator crítico, é recomendável utilizar algoritmos de ordenação mais eficientes, como o quicksort ou o mergesort. Porém, para arrays pequenos, os algoritmos de complexidade O(n²) podem ser mais eficientes devido ao seu menor overhead.
 * 
 *
 */

public class InsertionSort {
	public static void insertionSort(int[] array) {
	    for (int i = 1; i < array.length; i++) {
	        int key = array[i];
	        int j = i - 1;
	        while (j >= 0 && array[j] > key) {
	            array[j + 1] = array[j];
	            j--;
	        }
	        array[j + 1] = key;
	    }
	}

	public static void main(String[] args) {
	    int[] array = {5, 2, 9, 1, 5, 6, 8, 3, 0, 7, 4};
	    long startTime = System.nanoTime();
	    insertionSort(array);
	    long endTime = System.nanoTime();
	    long timeElapsed = endTime - startTime;
	    System.out.println("Tempo de execução em nanossegundos: " + timeElapsed);
	}
	
}
