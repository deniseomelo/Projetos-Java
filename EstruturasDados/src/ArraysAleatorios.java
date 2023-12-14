//import java.util.Arrays;
import java.util.Random;

public class ArraysAleatorios {
	    private static final int MAX=20;
	    
	    
	public static void main(String[] args) {
		int[] v= new int[MAX];
		inserir(v);
		mostrar(v);
		

	}
	
	private static void mostrar(int[] v) {
		for(int n:v)
			System.out.println(n);
		
		// System.out.println(Arrays.toString(v).replace(",","\n"));

		
	}

	public static void inserir(int[] v) {
		Random rd=new Random();
		int vInicial=1;
		int vFinal=MAX;
		
		for(int i=0; i<v.length;i++) {
			v[i]=vInicial+rd.nextInt((vFinal-vInicial));
		}
		
	}
	
}


