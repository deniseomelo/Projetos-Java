package cliente;


import lista.Contato;
import lista.Lista;



	public class UsaLista {

			public static void main(String[] args) {
		        Lista lista = new Lista();
		        lista.inserir(new Contato("Gerson", "12345"));
		        lista.inserir(new Contato("Sandra", "12345"));
		        lista.inserir(new Contato("Anna", "12345"));
		        lista.inserir(new Contato("José", "12345"));
		      lista.mostrar();
	        Object obj=lista.pesquisar(3)[0];
	        if(obj==null){
	            System.out.println("Não achou!");
	        }else{
	            System.out.println(obj);
	        }

		      if(lista.remover(2)){
		          System.out.println("Removeu!");
		      }else{
		          System.out.println("Não removeu!");
		      }
		      
		      lista.mostrar();
		    }
		}

		


