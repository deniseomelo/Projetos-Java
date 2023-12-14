package POOED;

public class Cadastro {
	public static void main(String[] args) {
		Array.inserir (new Pessoa("Denise",35));
		Array.inserir (new Pessoa("Maria",70));
		Array.inserir (new Pessoa("Ana",37));
		Array.inserir (new Pessoa("Bruno",39));
		Array.inserir (new Pessoa("Diego",31));
		Array.mostrar();
		System.out.println("=== Pesquisando..===" );
		int id=5;
		Pessoa p = Array.buscar(id);
		if(p!=null) {
			System.out.println(p);

		}else { 

			System.out.println("Não achei o id="+id);
		}


	}

}
