package ArrayUniMaiMen;
import java.util.Arrays;
/**
 * Um array unidimensional do tipo inteiro e tamanho igual a 100 
 * deve armazenar valores aleatórios.
 * A saída deve imprimir o maior e o menor valor armazenado.  
 */
import java.util.Random;

public class MaiorMenorValor {

	public static void main(String[] args) {
	   int[] valores = new int [100];
	   Random rd = new Random();
	   
	  // preenchimento do arrey com valoes aleatorios
	   
	   for(int i=0; i<valores.length ;i++) {
		   valores[i] = rd.nextInt(100);//valor maximo: 999
		   
	   }
       //encontrando maior e menor valor
	   
	   int maior= valores[0];
	   int menor=valores[0];
	   
	   for(int i=1; i<valores.length; i++) {
		   if (valores[i] > maior) {
			   maior = valores[i];
			   
		   }else if(valores[i] < menor) {
			   menor = valores[i];
			   
		   }
		  
		   
		   
	   }
	   
	   //imprimindo maior e menor valor
	   
	   System.out.println(Arrays.toString(valores));
	   System.out.println("Maior Valor: " + maior);
	   System.out.println("Menor Valor: " + menor);
	   
	}

}
