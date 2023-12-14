package quickSortPro;


/**
 *
 * @author Gerson
 */
import java.text.DecimalFormat;
public class MetodosQuick {

	/**
	 * Insere valores aleatórios no array
	 * Os valores são sorteados na faixa de 0 a 10000
	 * @param v float[]
	 */
	public static void popular(float[] v) {

		for (int i = 0; i < v.length; i++) {
			v[i] = (float) (Math.random() * 10000);
		}
	}
	/**
	 * Método de ordenação Quick sort.
	 * Ordena o array.
	 * @param e int - índice inicial
	 * @param d int - índice final
	 * @param a float[] - identificador do array
	 */



	public static void quickSort(int e, int d, float[] a) {
		int i;
		if (d > e) {
			i = particao(e,d,a);
			/* Particionando o vetor */
			quickSort(e, i - 1,a);
			quickSort(i + 1, d,a);
		}
	}
	/**
	 * Realiza a partição do array com base no pivô.
	 * @param e int - índice inicial
	 * @param d int - índice final
	 * @param a float[] - identificador do array
	 * @return int
	 */
	private static int particao(int e, int d,float[] a) {
		float pivo, aux;
		int i, j;
		pivo = a[d];
		i = e - 1;
		j = d;
		do {
			do {
				i = i + 1;
				//Procura o maior
			} while ((a[i] < pivo) && (i < d));
			do {
				j = j - 1;
				//Procura o menor
			} while ((a[j] > pivo) && (j > 0));
			//Aqui realiza a troca de valores
			aux = a[i];
			a[i] = a[j];
			a[j] = aux;
		} while (j > i);
		// colocando o pivo a[d] em seu lugar
		a[j] = a[i];
		a[i] = a[d];
		a[d] = aux;
		return i;
	}

	/**
	 * Exibe o conteúdo do array
	 *
	 * @param v int[]
	 */
	public static void exibir(float[] v) {
		DecimalFormat nf=new DecimalFormat("0.0");
		for (int i = 0; i < v.length; i++) {
			System.out.print(nf.format(v[i])+" ");
		}
	}

}



