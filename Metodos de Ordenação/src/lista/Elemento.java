package lista;
/**
 * A classe "Elemento" é frequentemente utilizada em implementações de estruturas de dados 
 * como listas encadeadas. 
 * Nesse caso, cada elemento da lista é representado por um objeto do tipo "Elemento". 
 * A referência "prox" aponta para o próximo elemento da lista e "objeto" armazena o valor associado a esse elemento.
 * 
 *
 */

public class Elemento {
	
	private Elemento prox;//referencia para o proximo elemento na lista encadeada
	private Object objeto;//referencia para um objeto generico
	
	
	///construtores
		
	public Elemento(Elemento prox, Object objeto) {
		this.prox = prox;
		this.objeto = objeto;
	}

  // gets e sets
	public Elemento getProx() {
		return prox;
	}


	public void setProx(Elemento prox) {
		this.prox = prox;
	}


	public Object getObjeto() {
		return objeto;
	}


	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}
      
	
	
}
