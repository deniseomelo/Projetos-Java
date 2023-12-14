import java.util.Random;

public class ArrayBidi {

		static float [][] m = new float[3][3];
		static Random rd = new Random();
		
		public static void entrada() {
			for(int i =0; i<m.length; i ++) {
				for(int j = 0; j<m[0].length; j++) {
					m[i][j]=rd.nextFloat(12,150);
				}
			}
		}
		
		public static void mostrar() {
			for(int i =0; i<m.length; i ++) {
				for(int j = 0; j<m[0].length; j++) {
					System.out.println(m[i][j] + " ");
				}
					System.out.println(" ");
			}
			
		}
		
		public static void main(String[] args) {
			entrada();
			mostrar();
		}
	}