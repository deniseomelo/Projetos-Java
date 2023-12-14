package vetorCaracteresQuik;

import java.util.Arrays;

public class vetor2 {


	    public static void main(String[] args) {
	        char[] vetor = {'1', 'w', 'W', '3', '2', 'R', 'r', 'T', '8'};
	        
	        // ordena o vetor
	        quickSort(vetor, 0, vetor.length - 1);
	        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
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

