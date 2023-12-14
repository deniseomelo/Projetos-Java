package exercicioOdedenacaoQuick;

public class Ordenação2 {

	public static void main(String[] args) {
		String[] lista={"Gerson",
				"Sandra",
				"Anna",
				"José",
				"Gaia",
				"Mel",
				"Ronda",
				"Tonica",
		"Mustafá"}; 
		Merge.mergeSort(0, lista.length, lista);
		Merge.exibir(lista);
	}
}
