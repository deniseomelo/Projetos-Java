package exercicioOrdenacao3Pet;

/**
 * Declare uma classe Pet, com os atributos nome (String) e idade (int), 
 * defina dois construtores, métodos getters/setters e o toString().
Na classe principal, crie um array de objetos, insira alguns objetos e ordene, pelo nome, o array usando quick/merge.


 * @author Diego
 *
 */
	public class Pet {
		private String nome;
		private int idade;

		public Pet(){}

		public Pet(String nome,int idade){
			this.nome=nome;
			this.idade=idade;
		}

		/**
		 * @return the nome
		 */
		public String getNome() {
			return nome;
		}

		/**
		 * @param nome the nome to set
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}

		/**
		 * @return the idade
		 */
		public int getIdade() {
			return idade;
		}

		/**
		 * @param idade the idade to set
		 */
		public void setIdade(int idade) {
			this.idade = idade;
		}

		@Override
		public String toString() {
			return "Pet{" + "nome=" + nome + ", idade=" + idade + '}';
		}

	}



