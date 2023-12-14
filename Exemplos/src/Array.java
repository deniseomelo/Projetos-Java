


import java.util.Random;

public class Array {
  public static void main(String[] args) {
    // Criar um array de inteiros de tamanho 100
    int[] numeros = new int[100];

    // Preencher o array com valores aleatórios entre 1 e 1000
    Random rand = new Random();
    for (int i = 0; i < 100; i++) {
      numeros[i] = rand.nextInt(1000) + 1;
    }

    // Encontrar o maior e o menor valor armazenado no array
    int maior = numeros[0];
    int menor = numeros[0];
    for (int i = 1; i < 100; i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
      }
      if (numeros[i] < menor) {
        menor = numeros[i];
      }
    }

    // Imprimir o maior e o menor valor armazenado no array
    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);
  }
}
