package aleatoriosReaisInsetion;
/**
 * Elabore um projeto Java que gere números reais (float) aleatórios,
 *  armazene-os em um array e ordene-o por insert sort em java
 */

import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		 
	        // Definindo o tamanho do array
	        int n = 10;
	        
	        // Criando o array de floats
	        float[] array = new float[n];
	        
	        // Preenchendo o array com números aleatórios
	        Random random = new Random();
	        for (int i = 0; i < n; i++) {
	            array[i] = random.nextFloat() * 100;
	        }
	        
	        // Imprimindo o array antes da ordenação
	        System.out.println("Array antes da ordenação:");
	        for (float elemento : array) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println();
	        
	        // Ordenando o array pelo insertion sort
	        for (int i = 1; i < n; i++) {
	            float aux = array[i];
	            int j = i - 1;
	            while (j >= 0 && array[j] > aux) {
	                array[j + 1] = array[j];
	                j--;
	            }
	            array[j + 1] = aux;
	        }
	        
	        // Imprimindo o array após a ordenação
	        System.out.println("Array após a ordenação:");
	        for (float elemento : array) {
	            System.out.print(elemento + " ");
	        }
	        System.out.println();
	        
	    
	    

	}

}
