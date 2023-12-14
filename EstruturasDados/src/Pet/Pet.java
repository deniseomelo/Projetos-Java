package Pet;

public class Pet {
    private String nome;
    private int idade;
    
    
    public Pet() {
    	 	
    }


	public Pet(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
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


	@Override
	public String toString() {
		return "Pet [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
    
    
}
