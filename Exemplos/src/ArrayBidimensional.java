import java.util.Random;

public class ArrayBidimensional {
    public static void main(String[] args) {
        int[][] array = new int[3][3]; // Criando um array bidimensional 5x5
        
        Random random = new Random(); // Instanciando um objeto da classe Random para gerar números aleatórios
        
        // Preenchendo o array com valores aleatórios entre 0 e 1
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10,100);
            }
        }
        
        // Exibindo o conteúdo do array
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Quebra de linha após exibir cada linha do array
        }
    }
}

