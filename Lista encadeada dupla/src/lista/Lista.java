package lista;

public class Lista {
	Elemento inicio,atual,aux;

	public boolean verificar() {
		return inicio == null;
	}

	public void inserir(Object objeto) {
		if (verificar()) { // lista vazia
			inicio =	new Elemento(null,null,objeto);// inserio o primeiro
			aux = inicio;// aux vai apontar pro inicio
		}else {
			atual = new Elemento(null,aux,objeto);//insere outro objeto
			aux.setProx(atual);//aux acessa prox. privativo aux referencia atual
			aux = atual;// aux aponta pro mesmo lugar do atual

		}

	}

	public void exibir() {
		Elemento e = inicio;
		while(e!=null) {//marca o fim da lista
			System.out.println(e.getObjeto());//retorna o objeto. o tipo abstrato de dado da classe contato
			e=e.getProx();// e = recebe  informação do proximo.

		}
	}
	//Exibe ao contrário

	// public void exibir() {
	//	 Elemento e = atual;
	//	 while(e!=null) {//marca o fim da lista
	//		 System.out.println(e.getObjeto());//retorna o objeto. o tipo abstrato de dado da classe contato
	//		 e=e.getAnt();// e = recebe  informação do proximo.

	//	 }
	//  }

	public Elemento pesquisar(int id) {
		Elemento e = inicio;// e e variavel da classe elemento
		Contato c;// cria uma variavel contato
		while(e!=null) {
			c=(Contato)e.getObjeto();// cast conversão temporaria
			if(id==c.getId()) {
				return e;
			}
			e=e.getProx();
		}

		return null;
	}
	public boolean remover(int id){//valida usando boolean sem usar o void
		Elemento e = pesquisar(id);
		if(e!=null) {
			if(e==inicio) { // remove o primeiro/inicio
				inicio=inicio.getProx();
				inicio.setAnt(null);
				e.setProx(null);
			} else if(e==atual) {//remove o ultimo
				atual=e.getAnt();
				aux=atual;
				aux.setProx(null);
				e.setAnt(null);  
			}else {//remove um qualquer
				e.getAnt().setProx(e.getProx());
				e.getProx().setAnt(e.getAnt());
				e.setProx(null);
				e.setAnt(null);
			}
			return true;
		}
		return false;
	}
	
	public void atualizar(int id, String novoCel) {
		Elemento e = pesquisar(id);
		Contato c=(Contato)e.getObjeto();// cast conversão temporaria
		c.setCel(novoCel);
			
		}
	}

