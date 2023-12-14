package Ex1POO;

public class ConstrutorProg {
	private String nomeCurso;


	public ConstrutorProg(String nome) {

		nomeCurso = nome; 
	}

	public String getNome() {
		return" Nome do curso retornado" + nomeCurso;
	}
}

