package odemAlfabeticaComMerge;

import java.util.Arrays;

public class UsaMerge {

	public static void main(String[] args) {
		String[]lista = {"Denise", "Maria", "Anna", "Rui", "Bruno", "vania", "Juliano"};
		Merge.mergeSort(lista, 0, lista.length - 1);
		System.out.println(Arrays.toString(lista));

	}

}
