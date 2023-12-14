package odemAlfabeticaComMerge;

public class Merge {
	public static void mergeSort(String[] lista, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(lista, inicio, meio);
            mergeSort(lista, meio + 1, fim);
            merge(lista, inicio, meio, fim);
        }
    }
    
    public static void merge(String[] lista, int inicio, int meio, int fim) {
        String[] auxiliar = new String[lista.length];
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = lista[i];
        }
        int i = inicio;
        int j = meio + 1;
        int k = inicio;
        while (i <= meio && j <= fim) {
            if (auxiliar[i].compareTo(auxiliar[j]) <= 0) {
                lista[k++] = auxiliar[i++];
            } else {
                lista[k++] = auxiliar[j++];
            }
        }
        while (i <= meio) {
            lista[k++] = auxiliar[i++];
        }
    }
}