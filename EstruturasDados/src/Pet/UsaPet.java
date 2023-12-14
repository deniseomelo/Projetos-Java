package Pet;

public class UsaPet {

	public static void main(String[] args) {
		Pet pet1 = new Pet("Mel",0);
		Pet pet2= new Pet("Kiara",8);
		Pet pet3 = new Pet("Tuga",10);
		Pet pet4 = new Pet("Cacau",5);
		Pet pet5 = new Pet("Noa",1);
		Pet pet6 = new Pet("Bilu",11);
		Pet pet7 = new Pet("Laila",4);

		Operacao.inserir(pet1);
		Operacao.inserir(pet2);
		Operacao.inserir(pet3);
		Operacao.inserir(pet4);
		Operacao.inserir(pet5);
		Operacao.inserir(pet6);
		Operacao.inserir(pet7);
		
		System.out.println("== LISTA COMPLETA==");
		Operacao.mostrar();
		
		int indice = 0;
		System.out.println("===indice= " +indice + " removido ===");
		Operacao.remover(indice);
		Operacao.mostrar();



	}
}
