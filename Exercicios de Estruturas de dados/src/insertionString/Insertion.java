package insertionString;



public class Insertion {

	public static void main(String[] args) {

	        
	        // Criando um array de strings
	        String[] array = {"Denise", "Helena", "Rita", "Bruno", "Carlos"};
	        
	        // Imprimindo o array antes da ordenação
	        System.out.println("Array antes da ordenação:");
	        for (String elemento: array) {
	            System.out.print(elemento+ " ");
	        }
	        System.out.println();
	        
	        // Ordenando o array pelo insertion sort
	        for (int i = 1; i < array.length; i++) {
	            String aux = array[i];
	            int j = i - 1;
	            while (j >= 0 && array[j].compareTo(aux) > 0) {
	                array[j + 1] = array[j];
	                j--;
	            }
	            array[j + 1] = aux;
	        }
	        
	        // Imprimindo o array após a ordenação
	        System.out.println("Array após a ordenação:");
	        for (String elemento : array) {
	            System.out.print(elemento+ " ");
	        }
	        System.out.println();
	        
	    }
	    
	}