package Exe1QuickCaracteres;

import java.util.Arrays;
import java.util.Random;

	public class Quick {
	  
	 /**
	  * É um método recursivo que separa logicamente o array,
	  * com relação ao valor retornado do método particao.
	  * @param e int é o primeiro índice 
	  * @param d int é o último índice 
	  * @param a char[] o array a ser ordenado
	  */
	 public static void quickSort(int e, int d, char[] a) {
	        int i;
	        if (d > e) {
	            i = particao(e,d,a);
	            /* Particionando o vetor */
	            quickSort(e, i - 1,a);
	            quickSort(i + 1, d,a);
	        }
	    }

	 /**
	  * Realiza a separação do array em duas partes, segundo a
	  * referência do elemento pivô.
	  * @param e int é o primeiro índice 
	  * @param d int é o último índice 
	  * @param a char[] o array a ser ordenado
	  * @return int é a posição do pivô
	  */
	 private static int particao(int e, int d, char[] a) {
	        char pivo, aux;
	        int i, j;
	        pivo = a[d];
	        i = e - 1;
	        j = d;
	        do {
	            do {
	                i = i + 1;
	                //Procura o maior
	            } while ((a[i] < pivo) && (i < d));
	            do {
	                j = j - 1;
	                //Procura o menor
	            } while ((a[j] > pivo) && (j > 0));
	            //Aqui realiza a troca de valores
	            aux = a[i];
	            a[i] = a[j];
	            a[j] = aux;
	        } while (j > i);
	        // colocando o pivo a[d] em seu lugar
	        a[j] = a[i];
	        a[i] = a[d];
	        a[d] = aux;
	        return i;
	    }
	 
	 /**
	  * Exibir o conteúdo do array.
	  * @param a char[] é o array a ser exibido.
	  */
	 public static void exibir(char[] a){
	     System.out.println(Arrays.toString(a));
	 }
	


	//Aprimorando a solução para gerar caracteres aleatórios.


	

	//Na classe Quick foi escrito o método inserir().
	/**
	     * Insere caracteres aleatórios no array.
	     *
	     * @param a char[]
	     */
	    public static void inserir(char[] a) {
	        Random rd = new Random();
	        int vi = 65;
	        int vf = 122;
	        for (int i = 0; i < a.length; i++) {
	            do {
	                a[i] = (char) (vi + rd.nextInt(vf - vi));
	            } while (a[i] > 90 && a[i] < 97);
	        }
	    }

}


