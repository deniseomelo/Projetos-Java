package ArrayUniMaiMen;
import java.util.Arrays;
/**
 * Gerar numeros aleatorios de vetor com tamanho 100
 */
import java.util.Random;

public class GerarNumerosAleatorios {

	public static void main(String[] args) {
	  int[]v = gerarVetor(100);
	 
     System.out.println(Arrays.toString(v));//retorna uma string que representa todos os elementos do Array´v´separados por virgulas e envolvidos em colchetes
	}

	private static int[] gerarVetor(int tam) {//
		int[] vetor = new int[tam]; //indica o tamanho do array que será criado
		Random rd = new Random();  // gera numeros aleatórios
		
		for (int i =0; i<vetor.length; i++) {
			vetor [i] = rd.nextInt(100);
		}
		
		
		return vetor;
		   
	}
}



