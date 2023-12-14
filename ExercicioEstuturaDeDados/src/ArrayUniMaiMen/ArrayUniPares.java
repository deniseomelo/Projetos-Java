package ArrayUniMaiMen;

/**
 * 
 * @author Denise
 * Um array unidimensional armazena vinte valores inteiros.
 * A saída deve mostrar todos os valores pares armazenados.
 *
 */

public class ArrayUniPares {

	public static void main(String[] args) {
		int[]array = {5, 6, 3, 8, 9, 2, 4, 7, 1, 10, 11, 14, 16, 19, 20, 22, 24, 25, 26, 30};
		
		
		
		System.out.println("Valores Pares");
		
		
		for( int i = 0; i<array.length; i ++) {
			if(array[i] % 2==0) {
				
				System.out.println(array[i]);
			}
		}

	}

}
