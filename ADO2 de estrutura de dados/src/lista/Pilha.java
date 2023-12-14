package lista;

public class Pilha {

	  Elemento inicio, atual, aux;

	  /**
	   * Método utilizado para verificar se a pilha está vazia.
	   * Caso a lista esteja vazia ele retorna verdadeiro.
	   * 
	   * @return
	   */
	  public boolean empty() {
	    return inicio == null;
	  }

	  /**
	   * Método utilizado para inserir um item na pilha.
	   * O objeto é inserido "acima" do outro.
	   * Não retorna nada.
	   * 
	   * @param objeto
	   */
	  public void push(Object objeto) {
	    if (empty()) {// lista vazia
	      inicio = new Elemento(null, null, objeto);
	      aux = inicio;
	    } else {
	      atual = new Elemento(null, aux, objeto);
	      aux.setProx(atual);
	      aux = atual;
	    }
	  }

	  /**
	   * Método utilizado para imprimir o objeto que está acima
	   * da pilha.
	   * Não retorna nada.
	   */
	  public void top() {
	    if (!empty()) {
	      System.out.println(atual.getObjeto());

	    } else {
	      System.out.println("Lista sem parametros");
	    }

	  }

	  /**
	   * Método usado para retirar o último objeto
	   * inserido na pilha.
	   * É possível remover até quando a pilha tem
	   * apenas 1 objeto.
	   * Caso o elemento seja removido ele retornará
	   * verdadeiro.
	   * 
	   * @return
	   */
	  public boolean pop() {
	    if (!empty()) {
	      if (inicio.getProx() != null) {
	        Elemento e = atual.getAnt();
	        atual.setAnt(null);
	        e.setProx(null);
	        atual = e;
	        return true;
	      } else {
	        inicio = null;
	        return true;
	      }
	    }

	    return false;
	  }

	  /**
	   * Método utilizado para retornar um número inteiro
	   * onde esse número representa a quantidade de elementos na pilha.
	   * 
	   * @return
	   */
	  public int size() {
	    int tamanho = 0;
	    Elemento e = inicio;

	    if (empty()) {
	      return 0;
	    } else {
	      while (e != null) {
	        tamanho++;
	        e = e.getProx();
	      }
	    }
	    return tamanho;
	  }

	}