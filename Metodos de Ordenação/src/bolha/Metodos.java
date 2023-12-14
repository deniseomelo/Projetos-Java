package bolha;

import java.util.Random;

public class Metodos {
	private static int[] v = new int[20];
    private static Random random = new Random();

    public static void inserir() {
        for (int i = 0; i < v.length; i++) {
            v[i] = 1 + random.nextInt(10);
        }
    }

    public static void bolha() {
        int temp;
        for (int j = 0; j < v.length - 1; j++) {//Varreduras
            for (int i = 0; i < v.length - 1 - j; i++) {//Comparações
                if (v[i] > v[i + 1]) {
                    temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                }
            }
        }
    }

    public static void exibir() {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }

}
