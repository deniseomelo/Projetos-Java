package arrayDeObjetos;

public class ExemploBuscaBinaria {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gerson", 12);
        Pessoa p2 = new Pessoa("Anna", 1);
        Pessoa p3 = new Pessoa("José", 31);
        Pessoa p4 = new Pessoa("Sandra", 67);
        Pessoa p5 = new Pessoa("Maria", 78);

        Metodos.inserir(p1);
        Metodos.inserir(p2);
        Metodos.inserir(p3);
        Metodos.inserir(p4);
        Metodos.inserir(p5);

        
        int id = 31;
        Pessoa p = Metodos.pesquisa(id);
        if (p != null) {
            System.out.println(p);
        }else{
            System.out.println("Pessoa não encontrada!");
        }
    }

}
