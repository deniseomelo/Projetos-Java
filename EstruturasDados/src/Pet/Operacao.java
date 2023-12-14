package Pet;

public class Operacao {
	private static Pet[] lista = new Pet[5];
	private static int n=0;


	public static void inserir(Pet pet) {
		if(n==lista.length)
			lista=alocarNovoArray();
		lista[n]=pet;
		n++;
	}

	public static void mostrar()    {
		for(int i=0; i<n; i++) {
			System.out.println("Nome: " +lista[i].getNome());
			System.out.println("Idade: " +lista[i].getIdade());
		}
	}


	private static Pet[] alocarNovoArray() {
		Pet[] novaLista= new Pet[lista.length+4];
		System.arraycopy(lista, 0, novaLista, 0, lista.length);
		return novaLista;

	}

	public  static void  remover(int indice) {
		for( int i=indice;i<n-1;i++) {
			lista[i] = lista[i + 1];
		}

		n--;


	}


}
