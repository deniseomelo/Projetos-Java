package EstuturasDadosAula;

/*Elabore um projeto Java que armazene em um array bidimensional
 *  valores aleatórios reais de simples precisão e exiba o seu conteúdo.*/


import java.util.Random;
import java.util.Arrays;

public class Exe2 {

	static int[] indice = new int[10];
	static Random rd = new Random();

	public static  void entrada(){
		for (int i = 0; i < indice.length; i++) {
                indice[i] = rd.nextInt(12,100);

			}
		}

	


	public static void mostrar() {
		for (int vetor:indice) {
			for(int elemento: vetor) {
				System.out.println(elemento+" ");
			}
			System.out.println("");

		}

		System.out.println(Arrays.toString(indice).replace("," , "\n"));
	}
	public static void main(String[] args) {
		entrada();
		mostrar();


	}

}
