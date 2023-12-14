package vetorCaracteresQuik;

/**
 * Elabore um projeto em Java que leia um vetor de caracteres
 *  ordene-o através do método Quick Sort e exiba o vetor ordenado. 
 *  Faça testes com as seguintes entradas:
   A,b,s,a,g,G,B,k,L.
   1, w, W, 3, 2, R, r, T, 8.

 */

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
        char[] vetor1 = {'A','b','s','a','g','G','B','k','L'};
        char[] vetor2 = {'1','w','W','3','2','R','r','T','8'};
        
        // ordena o vetor1
        quickSort(vetor1, 0, vetor1.length - 1);
        System.out.println("Vetor 1 ordenado: " + Arrays.toString(vetor1));
        
        // ordena o vetor2
        quickSort(vetor2, 0, vetor2.length - 1);
        System.out.println("Vetor 2 ordenado: " + Arrays.toString(vetor2));
    }
    
    public static void quickSort(char[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = particao(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }
    
    private static int particao(char[] vetor, int inicio, int fim) {
        char pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (vetor[f] > pivo) {
                f--;
            } else {
                char troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}


