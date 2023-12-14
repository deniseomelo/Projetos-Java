import java.util.Random;

public class Matriz {
   static float [][] m = new float[5][5];
   static Random rd = new Random();
   
   public static void prencherMatriz() {
	   for( int i=0; i<m.length; i ++) {
		   for( int j= 0; j< m[0].length; j++) {
			  m[i][j] = rd.nextFloat(10);
		   }
	   }
  
  }
   
   public static void exibirDiagonalPrincipal() {
	  for(int i=0; i<m.length; i++) {
		   System.out.println(m[i][i]);
	   }
   }
   
   public static void main(String[] args) {
	prencherMatriz();
	//exibirDiagonalPrincipal();
}
}
