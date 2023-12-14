package ADO1;

import java.util.Scanner;

public class Array {
	
	static Scanner leitor = new Scanner(System.in);
	private static Livro livro[]  = new Livro[1];
	private static int indice = 0;;

	public static void inserir(Livro l) {
        if (indice < livro.length) {
            livro[indice++] = l;
            ordenarTitulo(0, indice, livro);
        } else {
            livro = alocarNovoArray();
            inserir(l);
        }
    }
	
	private static Livro[] alocarNovoArray() {
		Livro novo[] = new Livro[livro.length + 4];
        for (int i = 0; i < indice; i++) {
            novo[i] = livro[i];
        }
        System.arraycopy(livro, 0, novo, 0, indice);
        return novo;
	}

	 public static void mostrar(int indice) {
		 for (int i = 0; i < livro.length; i++) {
	            System.out.println(livro[i]);
	        }
	    }

	public static boolean remover(int id) {
	        System.out.println(" DIGITE O ID QUE QUER REMOVER: ");
	        int id1 = leitor.nextInt();
	        System.out.println("");
	        int rem = buscarId(id1);
	        if (rem != -1) {
	            for (int i = rem; i < indice - 1; i++) {
	                livro[i] = livro[i + 1];
	            }
	            indice--;
	            return true;
	        }
	        return false;
	    }

	public static int buscarId(int id) {
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (id == livro[meio].getId()) {
                return meio;
            } else if (id > livro[meio].getId()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
    public static void inserirLivro() {
        @SuppressWarnings("unused")
		int i = livro.length;
        int cond = 0;
        boolean cadastrar;
        do {
            System.out.print(" DIGITE NOME DO AUTOR: ");
            String autor = (leitor.next());
            
            System.out.print("\n  Digite o TÍTULO: ");
            String titulo = (leitor.next());
            
            System.out.print("\n  DIGITE O PREÇO: ");
            double preco = (leitor.nextDouble());
            
            inserir(new Livro(autor, titulo, preco));
            System.out.println("");
            
            System.out.print("\t CADASTRAR MAIS UM LIVRO? [1] SIM | [2] NÃO: ");
            cond = leitor.nextInt();
            
            System.out.println("");

            if (cond != 1) {
                cadastrar = true;
            } else {
                cadastrar = false;
            }
        } while (cadastrar == false);
    
  }


     public static void buscar() {
     System.out.print(" DIGITE O TITULO DO LIVRO: ");
     
     String procurar = leitor.nextLine();
     Livro resultado = buscarTitulo(procurar, livro);
     if (resultado != null) {
        System.out.println("  TITULO: "+resultado.getTitulo() + "\n AUTOR: "+resultado.getAutor() + "\n• ID: "+ resultado.getId()
                + "\n• PREÇO: "+ resultado.getPreco() );
    } else if(resultado == null) {
        System.out.println(" TITULO NÃO EXITE ");
    }
    System.out.println("");
    }

    public static Livro buscarTitulo(String titulo, Livro[] livros) {
    int inicio = 0;
    int fim = livros.length - 1;
    while (inicio <= fim) {
        int meio = (inicio + fim) / 2;
        int paralelo = titulo.compareTo(livros[meio].getTitulo());
        if (paralelo == 0) {
            return livros[meio];
        } else if (paralelo < 0) {
            fim = meio - 1;
        } else {
            inicio = meio + 1;
        }
    }
    return null;
}
     public static void ordenarTitulo(int inicio, int tamanho, Livro[] v) {
     if (inicio < tamanho - 1) {
        int meio = (inicio + tamanho) / 2;
        ordenarTitulo(inicio, meio, v);
        ordenarTitulo(meio, tamanho, v);
        intercalar(inicio, meio, tamanho, v);
    }
}
    public static void intercalar(int inicio, int meio, int tamanho, Livro[] v) {
    int i, j, k;
    Livro[] aux = new Livro[tamanho - inicio];
    i = inicio;
    j = meio;
    k = 0;
    while (i < meio && j < tamanho) {
        if (v[i].getTitulo().compareTo(v[j].getTitulo()) < 0) {
            aux[k] = v[i];
            k++;
            i++;
        } else {
            aux[k] = v[j];
            k++;
            j++;
        }
    }
    while (i < meio) {
        aux[k] = v[i];
        k++;
        i++;
    }
    while (j < tamanho) {
        aux[k] = v[j];
        k++;
        j++;
    }
    for (i = inicio; i < tamanho; i++) {
        v[i] = aux[i - inicio];
    }
  }
}
	
	


