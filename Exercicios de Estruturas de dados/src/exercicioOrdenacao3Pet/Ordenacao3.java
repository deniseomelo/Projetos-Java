package exercicioOrdenacao3Pet;

public class Ordenacao3 {

	public static void main(String[] args) {
	      Pet pet1=new Pet("Gaia", 4); 
	      Pet pet2=new Pet("Ronda", 4); 
	      Pet pet3=new Pet("Mel", 7); 
	      Pet pet4=new Pet("Tonica", 8); 
	      Pet pet5=new Pet("Mustafá", 6); 
	      Merge.inserir(pet1);
	      Merge.inserir(pet2);
	      Merge.inserir(pet3);
	      Merge.inserir(pet4);
	      Merge.inserir(pet5);
	      Merge.exibir();
	    }   
	}

