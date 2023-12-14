package aleatoriosComMerge;

import java.util.Random;



public class MergeSort {
     
	public static void main(String[] args) {
	    // Define o tamanho do array
	    int n = 10;
	    
	    // Cria um array de inteiros com o tamanho n
	    int[] array = new int[n];
	    
	    // Cria um objeto Random
	    Random random = new Random();
	    
	    // Preenche o array com números aleatórios entre 0 e 99
	    for (int i = 0; i < n; i++) {
	      array[i] = random.nextInt(100);
	    }
	    
	    // Imprime o array antes de ser ordenado
	    System.out.println("Array antes de ser ordenado:");
	    for (int i = 0; i < n; i++) {
	      System.out.print(array[i] + " ");
	    }
	    System.out.println();
	    
	    // Ordena o array utilizando o Merge Sort
	    mergeSort(array, 0, n-1);
	    
	    // Imprime o array depois de ser ordenado
	    System.out.println("Array depois de ser ordenado:");
	    for (int i = 0; i < n; i++) {
	      System.out.print(array[i] + " ");
	    }
	    System.out.println();
	  }
	  
	  // Implementação do algoritmo de ordenação Merge Sort
	  public static void mergeSort(int[] array, int esq, int dir) {
	    if (esq < dir) {
	      int meio = (esq + dir) / 2;
	      mergeSort(array, esq, meio);
	      mergeSort(array, meio + 1, dir);
	      merge(array, esq, meio, dir);
	    }
	  }
	  
	  public static void merge(int[] array, int esq, int meio, int dir) {
	    int[] esqArray = new int[meio - esq + 1];
	    int[] dirArray = new int[dir - meio];
	    
	    for (int i = 0; i < esqArray.length; i++) {
	      esqArray[i] = array[esq + i];
	    }
	    
	    for (int i = 0; i < dirArray.length; i++) {
	      dirArray[i] = array[meio + 1 + i];
	    }
	    
	    int i = 0, j = 0, k = esq;
	    
	    while (i < esqArray.length && j < dirArray.length) {
	      if (esqArray[i] <= dirArray[j]) {
	        array[k] = esqArray[i];
	        i++;
	      } else {
	        array[k] = dirArray[j];
	        j++;
	      }
	      k++;
	    }
	    
	    while (i < esqArray.length) {
	      array[k] = esqArray[i];
	      i++;
	      k++;
	    }
	    
	    while (j < dirArray.length) {
	      array[k] = dirArray[j];
	      j++;
	      k++;
	    }
	  }
	}
	





