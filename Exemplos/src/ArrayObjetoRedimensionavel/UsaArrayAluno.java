package ArrayObjetoRedimensionavel;

public class UsaArrayAluno {
	 public static void main(String[] args) {
	        Aluno aluno1 = new Aluno("Gerson","Curso",123);
	        Aluno aluno2 = new Aluno("Xaropada","BSI",938);
	        Aluno aluno3 = new Aluno("Fulano","TADS",321);
	        Aluno aluno4 = new Aluno("Fulana","BSI",451);
	        Aluno aluno5 = new Aluno("Xaropada2","TADS",959);
	        Aluno aluno6 = new Aluno("Raul","TADS",874);
	        Aluno aluno7 = new Aluno("Bia","TADS",321);
	        Aluno aluno8 = new Aluno("Guilherme","TADS",222);
	        Aluno aluno9 = new Aluno("Vitor","TADS",983);
	 
	        Metodos.inserir(aluno1);
	        Metodos.inserir(aluno2);
	        Metodos.inserir(aluno3);
	        Metodos.inserir(aluno4);
	        Metodos.inserir(aluno5);
	        Metodos.inserir(aluno6);
	        Metodos.inserir(aluno7);
	        Metodos.inserir(aluno8);
	        Metodos.inserir(aluno9);
	        Metodos.exibir();
	    }
	}


