import java.util.Random;

public class ArraysMultidimensionais {

	public static void main(String[] args) {
		float[] [] m = new float[2][5];
		inserir(m);
		mostrar(m);
	}

	private static void inserir(float[][] m) {
		Random rd = new Random();
		int vInicial=0;
		int vFinal=10;

		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[0].length; j++) {
				m[i][j]=vInicial+ rd.nextFloat()+(vFinal-vInicial);
				
			}
	}
}

		private static void mostrar(float[][] m) {
				for(int i =0; i<m.length; i++) {
					for(int j=0; j<m[0].length;j++) {
						System.out.printf("%.1f",m[i][j]);

					}

					System.out.println("");
				}

			}

		}
