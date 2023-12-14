02package ADO1;

import java.util.Scanner;

public class Cadastro {

   public static void main(String[] args) {
    @SuppressWarnings("resource")
	Scanner leitor = new Scanner(System.in);
    int op = 0;
   
    Array.inserir(new Livro("Carlos", "Gato Tonto", 73.00));
    Array.inserir(new Livro("Thomas", "Thomas o trem", 81.00));
    Array.inserir(new Livro("Henrique", "Henrique brazuca", 56.00));
    Array.inserir(new Livro("Giovana", "Giovana no pais das maravilhas", 74.00));
    Array.inserir(new Livro("Paulo", "Paulo e a girrafa", 89.00));
    Array.inserir(new Livro("Brunna", "Brunna com dois n", 100.00));
    Array.inserir(new Livro("Heloise", "Heloise e Heloise", 41.00));
    Array.inserir(new Livro("Yasmin", "Yasmin com y", 30.00));
    Array.inserir(new Livro("Breno", "Breno no mundo de Breno", 75.00));
    Array.inserir(new Livro("Vick", "Vick solitaria", 50.00));

    
    do {
       
        System.out.println("==== BUSCAR LIVRO ====");
       
        System.out.println(" ADICIONAR LIVRO        [01]");
        System.out.println(" EXCLUIR LIVRO          [02]");        
        System.out.println(" BUSCAR LIVRO           [03]");
        System.out.println(" MOSTRAR TODOS OS LIVROS[04]");
        System.out.println(" SAIR                   [05]");
        System.out.println("===============================");
        System.out.print("\n• SELECIONE OPÇÃO: ");
        op = leitor.nextInt();
        System.out.println("");
        System.out.println("===============================");
        System.out.println("");

        switch (op) {
            case 01:
                Array.inserirLivro();
                break;
            case 02:
                Array.remover(0);
                break;
            case 03:
                Array.buscar();
                break;
            case 04:
                Array.mostrar(0);
                break;
            case 05:
                System.out.println("Operacao encerrada... \n");
                break;
        }
    } while (op != 05);
  }
}


	