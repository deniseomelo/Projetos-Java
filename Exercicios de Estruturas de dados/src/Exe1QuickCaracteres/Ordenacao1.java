package Exe1QuickCaracteres;

/**
 * 
 * @author Denise
 *Ordene pelo método quick sort, um array de caracteres.
 */

public class Ordenacao1 {
	public static void main(String[] args) {
	      char[] a={'g','b','w','y','o','p','W','K','A'};
	      Quick.inserir(a);
	      Quick.quickSort(0,a.length-1,a);
	      Quick.exibir(a);
	    } 
	}



