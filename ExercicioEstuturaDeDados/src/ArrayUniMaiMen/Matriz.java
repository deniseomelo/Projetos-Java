package ArrayUniMaiMen;

import java.util.Scanner;

/**
 * 
 * @author Denise
 Para imprimir todos os valores da diagonal principal de uma matriz bidimensional
  de ordem igual a cinco com valores reais de simples precisão, 
  você pode usar um loop for para percorrer a diagonal principal e imprimir cada valor.
 */
public class Matriz {
	public static void main(String[] args) {
        float[][] matriz = new float[5][5];
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        // Lendo os valores da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextFloat();
            }
        }

        // Imprimindo a diagonal principal da matriz
        System.out.println("Valores da diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
    }
}
