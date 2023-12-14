
import java.util.Random;

public class DiagonalPrincipal {
    public static void main(String[] args) {
        double[][] array = new double[5][5]; // Criando um array bidimensional 5x5
        
        Random random = new Random(); // Instanciando um objeto da classe Random para gerar números aleatórios
        
        // Preenchendo o array com valores aleatórios entre 0 e 1
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextDouble();
            }
        }
        
        // Exibindo apenas os valores da diagonal principal
        System.out.println("Valores da diagonal principal:");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i][i]);
        }
    }
}
