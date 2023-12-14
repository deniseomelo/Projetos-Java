package chamadaParaMetQuick;

public class Quick {
   

	    public static void main(String[] args) {
	        int[] array = {10, 7, 8, 9, 1, 5};
	 
	        quickSort(array, 0, array.length-1);
	        
	        System.out.println("Array ordenado: ");
	        for(int i=0; i<array.length; i++){
	            System.out.print(array[i] + " ");
	        }
	    }
	    
	    public static void quickSort(int[] array, int inicio, int fim){
	        if(inicio < fim){
	            int p = partition(array, inicio, fim);
	            quickSort(array, inicio, p-1);
	            quickSort(array, p+1, fim);
	        }
	    }
	    
	    public static int partition(int[] array, int inicio, int fim){
	        int pivot = array[fim];
	        int i = inicio - 1;
	        for(int j=inicio; j<fim; j++){
	            if(array[j] <= pivot){
	                i++;
	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }
	        int temp = array[i+1];
	        array[i+1] = array[fim];
	        array[fim] = temp;
	        
	        return i+1;
	    }
	}

