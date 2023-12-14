
public class Passageiro {

	private String nome;
	private int idade;
	private String numeroPassaporte;
	private int itensRefeicao;

	public Passageiro(String nome, int idade, String numeroPassaporte, int itensRefeicao) {
		this.nome = nome;
		this.idade = idade;
		this.numeroPassaporte = numeroPassaporte;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNumeroPassaporte() {
		return numeroPassaporte;
	}

	public void setNumeroPassaporte(String numeroPassaporte) {
		this.numeroPassaporte = numeroPassaporte;
	}

	public int getItensRefeicao() {
		return itensRefeicao;
	}

	public void setItensRefeicao(int itensRefeicao) {
		this.itensRefeicao = itensRefeicao;
	}
	}