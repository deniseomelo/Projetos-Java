
public class ExemploBuscaBinaria {

		    public static void main(String[] args) {
		        int[] v = {1, 4, 6, 7, 12, 23, 35, 77};//Classificado
		        System.out.println("Índice:"+binaria(v,11));
		    }

		    public static int binaria(int[] v, int b) {
		        int vi = 0, vf = v.length - 1, meio;

		        while (vi <= vf) {
		            meio = (vf + vi) / 2;
		            if (b == v[meio]) {
		                return meio;
		            } else if (b < v[meio]) {
		                vf = meio - 1;
		            } else {
		                vi = meio + 1;
		            }
		        }
		        return -1;
		    }
		}

