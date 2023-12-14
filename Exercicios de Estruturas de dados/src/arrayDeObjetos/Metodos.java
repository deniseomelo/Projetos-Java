package arrayDeObjetos;

public class Metodos {

	private static int n = 0;
    private static Pessoa[] lista = new Pessoa[10];

    public static void inserir(Pessoa p) {
        lista[n] = p;
        n++;
    }

    private static void insertionSort() {
        for (int i = 1; i < n; i++) {
            Pessoa temp = lista[i];
            int j = i;
            while (j > 0 && lista[j - 1].getId() > temp.getId()) {
                lista[j] = lista[j - 1];
                j--; //j=j-1;
            }
            lista[j] = temp;
        }
    }

    public static Pessoa pesquisa(int b){
     insertionSort();
     return binaria(b);
    }
    
    private static Pessoa binaria(int b) {
        int inicio = 0, fim = n - 1, meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (b == lista[meio].getId()) {
                return lista[meio];
            } else if (b > lista[meio].getId()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return null;
    }
}

