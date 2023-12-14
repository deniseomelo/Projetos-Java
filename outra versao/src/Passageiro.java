public class Passageiro extends Reserva {
     private String nome;
     private int idade;
     private String numeroPassaporte;
	public Passageiro() {
		super();
	}
	public Passageiro(String nome, int idade, String numeroPassaporte) {
		super();
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
	@Override
	public String toString() {
		return "Passageiro [nome=" + nome + ", idade=" + idade + ", numeroPassaporte=" + numeroPassaporte + "]";
	}
     
     
     
}
