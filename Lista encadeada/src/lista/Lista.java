package lista;

public class Lista {

	 private Elemento inicio, atual, aux;
	    private int valor = 1;

	    public boolean verificar() {
	        return inicio == null;
	    }

	    public void inserir(Object objeto) {
	        Contato contato = (Contato) objeto;//Cast
	        contato.setId(valor++);
	        if (verificar()) {
	            inicio = new Elemento(null, objeto);
	            aux = inicio;
	        } else {
	            atual = new Elemento(null, objeto);
	            aux.setProx(atual);
	            aux = atual;
	        }
	    }

	    public void mostrar() {
	        Elemento e = inicio;
	        while (e != null) {
	            System.out.println(e.getObjeto());
	            e = e.getProx();
	        }
	    }

	    /**
	     * Realiza a pesquisa linear na lista simplesmente
	     * encadeada e retorna um array com três informações
	     * índice 0 - Tipo Abstrato de Dados
	     * índice 1 - Endereço do elemento a ser removido
	     * índice 2 - Endereço do elemento anterior
	     * @param id int
	     * @return Object[]
	     */
	    public Object[] pesquisar(int id) {
	        if (!verificar()) {
	            Object[] v = new Object[3];
	            Elemento e = inicio;
	            Elemento auxRem = null;
	            Contato c;
	            while (e != null) {
	                c = (Contato) e.getObjeto();
	                if (id == c.getId()) {
	                    v[0] = c;
	                    v[1] = e;
	                    v[2] = auxRem;
	                    return v;
	                }
	                auxRem = e;
	                e = e.getProx();
	            }
	        }
	        return null;
	    }

	    public boolean remover(int id) {
	        Object[] v = pesquisar(id);
	        if (v != null) {
	            Elemento e = (Elemento) v[1];
	            Elemento auxRem = (Elemento) v[2];
	            //1 - Remoção do primeiro elemento
	            if (e == inicio) {
	                inicio = e.getProx();
	                e.setProx(null);
	            //2 - Remoção do último elemento
	            } else if (e == atual) {
	                aux = auxRem;
	                atual=auxRem;
	                auxRem.setProx(null);
	            } else {// 3 remoção de um elemento qualquer
	            	
	            	auxRem.setProx(e.getProx());
	            	e.setProx(null);
	            }
	            return true;
	        }
	        return false;
	    }

	}
