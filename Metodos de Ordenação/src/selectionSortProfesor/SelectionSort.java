package selectionSortProfesor;

public class SelectionSort {
      public static void selectionSort(int[] v) {
    	  int temp;
    	  for(int j = 0;j<v.length - 1 ; j++) {//varredyudura
    		  int menor = j;//indice
    		  for(int i =  j + 1; i<v.length; i ++) {//comparações
    			  if (v[menor] > v[i]) {
    				  menor = i;
    			  }
    		  }
    		  // troca 
    		  temp=v[menor];
    		  v[menor] = v[j];
    		  v[j] = temp;
    	  }
	
      
      }
      
      public static void exibir(int [] v) {
    	  for(int i = 0; i< v.length; i++) {
    		  System.out.println(v[i] + " ");
    	  }
    	  
    	  System.out.println(" ");
      }
}
