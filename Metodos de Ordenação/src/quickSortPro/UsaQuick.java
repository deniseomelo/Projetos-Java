package quickSortPro;

	/**
	 * Aplicação do método Quick Sort
	 * Ordenação de array com valores aleatórios
	 */

	/**
	 * @author 
	 */
	public class UsaQuick {
	    public static void main(String[] args) {
	         float[] v={11,33,2,4,55,3};
	         //System.out.println("=== Array não ordenado ===");
	         //MetodosQuick.popular(v);
	        // MetodosQuick.exibir(v);
	         //System.out.println("\n=== Array ordenado ===");
	         MetodosQuick.quickSort(0, v.length-1, v);
	         MetodosQuick.exibir(v);
	    }   
	}


