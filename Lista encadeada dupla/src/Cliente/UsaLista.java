package Cliente;
/**
 * @author Denise
 */

import lista.*;

public class UsaLista {
	public static void main(String[] args) {
		Lista lista = new Lista();//instanciar a classe Lista
		lista.inserir(new Contato ("Mel","1234-5555"));
		lista.inserir(new Contato ("Gaia","8695-5558"));
		lista.inserir(new Contato ("Tonica","2103-7896"));
		lista.inserir(new Contato ("Ronda","1238-2012"));
		lista.inserir(new Contato ("Mustafá","4785-4758"));


		System.out.println("================= Conteúdo lista ===============");
		//lista.exibir();

		System.out.println("=====================Pesquisando=================");
		Elemento e = lista.pesquisar(2);
		if (e!=null) {
			System.out.println(e.getObjeto());
		} else {
			System.out.println("Não achei");
		}

		System.out.println("===============Removendo===============");
		if(lista.remover(50)) {;
		System.out.println("removendo");
		}else {
			System.out.println(" Não Removido!!!");

		}
		
		lista.exibir();
		lista.atualizar(2," 2222-2222");
	}
}
