package lista;
/**
 * A classe "Lista" é frequentemente utilizada para implementar uma lista encadeada. 
 * A referência "inicio" aponta para o primeiro elemento da lista, 
 * enquanto as referências "atual" e "aux" são usadas para percorrer a 
 * lista durante a sua manipulação.
 * 
 */

public class Lista {
      private Elemento inicio,atual,aux; // referencia para elementos da lista encadeada
      private int valor = 1;//inteiro com valor inicial de 1
      
      public boolean verificar() {
    	  return inicio == null;// verifica se a lista esta vazia ou não
      }
       /**
        * método "inserir" adiciona um novo elemento na lista encadeada de acordo com o valor passado 
        * como parâmetro, mantendo a referência "inicio" 
        * apontando para o primeiro elemento da lista.
        * @param objeto
        */
      public void inserir(Object objeto) {//recebe um paramentro do tipo Object que será adicionado na lista como um novo elemento
    	  Contato contato = (Contato) objeto;//Cast do objeto para tipo "contato", assumindo que o objeto é uma instancia da classe Contato
	        contato.setId(valor++);// atribui um novo id usando o valor atual de "valor"( que é incrementada a cada valor inserido)
    	   if (verificar()) { //verifica se esta vazia
    		   inicio = new Elemento(null,objeto);//se a lista estiver vazia um novo objeto do tipo "Elemento" é criado e atibuido a referencia inicio
    		   aux=inicio;
    	   } else {
    		   atual = new Elemento(null,objeto);//Se a lista não estiver vazia, um novo objeto "Elemento" é criado e atribuído à referência "atual". A referência "prox" do elemento anterior (que é apontada por "aux") é atualizada para apontar para o novo elemento. Em seguida, a referência "aux" é atualizada para apontar para o novo elemento.
    		   aux.setProx(atual);
    		   aux=atual;
    	   }
      }
      
      /**
       * método  "mostrar" que percorre a lista encadeada e 
       * imprime na tela o valor armazenado em cada elemento da lista.
       */
    	   public void mostrar() {
    		   Elemento e = inicio;//e aponta para o primeiro elemento da lista(referenciado pela variavel inicio
    		   while(e != null) { //usado para percorrer a lista enquanto a referencia "e" não for nula
    			   System.out.println(e.getObjeto());//A cada iteração do laço, o método imprime o valor armazenado no objeto referenciado por "e" utilizando o método "getObjeto()" da classe "Elemento". sse valor pode ser de qualquer tipo, dependendo do tipo de objeto que foi adicionado na lista.
    			   e = e.getProx();//a referência "e" é atualizada para apontar para o próximo elemento da lista, utilizando o método "getProx()" da classe "Elemento" para obter a referência para o próximo elemento da lista.
    		   }
    	   
      }
    	   
    	   /**
   	     * Realiza a pesquisa linear na lista simplesmente
   	     * encadeada e retorna um array com três informações
   	     * índice 0 - Tipo Abstrato de Dados
   	     * índice 1 - Endereço do elemento a ser removido
   	     * índice 2 - Endereço do elemento anterior
   	     * Esse código define um método chamado "pesquisar" 
   	     * que recebe como parâmetro um ID inteiro e busca por um objeto 
   	     * "Contato" com o mesmo ID na lista encadeada
   	     * @param id int
   	     * @return Object[]
   	     */ 
      public Object[] pesquisar(int id) {
    	  if (verificar()) {//O método começa verificando se a lista está vazia, utilizando o método "verificar()" previamente definido. Se a lista estiver vazia, o método retorna "null"
    		  Object[] v = new Object[3];//Se a lista não estiver vazia, um novo array de objetos "Object" é criado com tamanho 3. O primeiro elemento desse array é usado para armazenar o objeto "Contato" encontrado (caso exista), o segundo elemento é usado para armazenar a referência para o elemento que contém o objeto "Contato" encontrado e o terceiro elemento é usado para armazenar a referência para o elemento anterior ao elemento encontrado.
    		  Elemento e = inicio;//O método então cria uma nova referência "e" que aponta para o primeiro elemento da lista (referenciado pela variável "inicio") 
    		  Elemento auxRem = null;//"auxRem" que é inicializada como nula.
    		  Contato c;
    		  while (e != null) {//m laço "while" é usado para percorrer a lista enquanto a referência "e" não for nula.
    			  c = (Contato) e.getObjeto();//cast do objeto armazenado no elemento referenciado por "e" para o tipo "Contato" 
    			  if (id ==c.getId()) {//compara o ID do contato com o ID passado como parâmetro. Se os IDs forem iguais, o método armazena o contato, o elemento e o elemento anterior no array "v" e retorna o array.
    				  v[0] = c;
    				  v[1] = e;
    				  v[2] = auxRem;
    				  return v;
    			  }
    			  auxRem = e;//apontar para o elemento atual e atualiza a referência " e"
    			  e = e.getProx();//para apontar para o próximo elemento da lista, utilizando o método "getProx()" da classe "Elemento".


    		  }
    	  }
    	  return null;
      }
      /**
       * método chamado "remover" em uma lista encadeada simples. 
       * A lista armazena objetos do tipo "Contato" 
       * em seus elementos. O método recebe um parâmetro "id" 
       * que corresponde ao id do contato a ser removido da lista.
       * @param id
       * @return
       */
      public boolean remover(int id) {
	        Object[] v = pesquisar(id);//chama o método "pesquisar" para encontrar o objeto "Contato" correspondente ao id passado como parâmetro. Se o objeto for encontrado, o método então realiza a remoção desse objeto da lista
	        if (v != null) {
	            Elemento e = (Elemento) v[1];
	            Elemento auxRem = (Elemento) v[2];
	            //1 - Remoção do primeiro elemento o elemento a ser removido é o primeiro da lista. O método simplesmente atualiza o ponteiro "inicio" para apontar para o próximo elemento e remove a referência do elemento atual.
	            if (e == inicio) {
	                inicio = e.getProx();
	                e.setProx(null);
	            //2 - Remoção do último elemento  o elemento a ser removido é o último da lista. O método atualiza o ponteiro "atual" e "aux" para apontar para o penúltimo elemento e remove a referência do último elemento.
	            } else if (e == atual) {
	                aux = auxRem;
	                atual=auxRem;
	                auxRem.setProx(null);
	            } else {// 3 remoção de um elemento qualquer o elemento a ser removido está no meio da lista. O método atualiza o ponteiro do elemento anterior ao elemento a ser removido para apontar para o próximo elemento, e remove a referência do elemento atual
	            	
	            	auxRem.setProx(e.getProx());
	            	e.setProx(null);
	            }
	            return true;//O método retorna true se a remoção for realizada com sucesso
	        }
	        return false;//false caso contrário.
	    }
}
