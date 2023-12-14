package lista;

/*
 *  Professor Gerson Risso
 */
public class Fila {

  Elemento inicio, atual, aux;

  /**
   * Método utilizado para verificar se a fila está vazia.
   * Caso a lista esteja vazia ele retorna verdadeiro.
   * 
   * @return
   */
  public boolean empty() {
    return inicio == null;
  }

  /**
   * Método utilizado para inserir um item na fila.
   * O objeto é inserido depois do primeiro objeto inserido.
   * Não retorna nada.
   * 
   * @param objeto
   */
  public void enqueue(Object objeto) {
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
   * Método utilizado para imprimir o objeto que está
   * na frente da fila. O primeiro objeto inserido.
   * Não retorna nada.
   */
  public void front() {
    if (!empty()) {
      System.out.println(inicio.getObjeto());

    } else {
      System.out.println("Lista sem parametros");
    }

  }

  /**
   * Método usado para retirar o primeiro objeto
   * inserido na fila.
   * É possível remover até quando a fila tem
   * apenas 1 objeto.
   * Caso o elemento seja removido ele retornará
   * verdadeiro.
   * 
   * @return
   */
  public boolean dequeue() {
    if (!empty()) {
      if (inicio.getProx() != null) {
        Elemento e = inicio;
        inicio = inicio.getProx();
        inicio.setAnt(null);
        e.setProx(null);
        return true;
      } else {
        inicio = null;
        return true;
      }
    } else {
      return false;
    }
  }

  /**
   * Método utilizado para retornar um número inteiro
   * onde esse número representa a quantidade de elementos na fila.
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