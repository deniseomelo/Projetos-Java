package cliente;



import java.util.Scanner;

import lista.*;

/*
 Professor Gerson Risso
 */
public class UsaLista {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int resp;

        do {
            System.out.println("===== PILHA E FILA ======");
            System.out.println(" Digite a opção desejada: ");
            System.out.println(" 1 - para criar FILA ");
            System.out.println(" 2 - para criar PILHA ");
            System.out.println(" 0 - para sair do programa ");
            System.out.println("==========================");

            resp = entrada.nextInt();

            switch (resp) {

                case 1:
                    Scanner entrada2 = new Scanner(System.in);
                    int resp2;
                    Fila fila = new Fila();
                    do {
                        System.out.println("================== FILA ==================");
                        System.out.println(" Digite a opção desejada: ");
                        System.out.println(" 1 - Verificar se a fila está vazia.");
                        System.out.println(" 2 - Inserir objeto na fila.");
                        System.out.println(" 3 - Remover objeto da fila");
                        System.out.println(" 4 - Exibir primeiro objeto da fila");
                        System.out.println(" 5 - Exibir tamanho da fila");
                        System.out.println(" 6 - Voltar para o menu anterior");
                        System.out.println("===========================================");

                        resp2 = entrada2.nextInt();

                        switch (resp2) {

                            case 1:
                                String comp = " item";
                                if (fila.size() > 1)
                                    comp = " itens";

                                System.out.println(
                                        (fila.empty()) ? "\nA fila está vazia\n"
                                                : "\nA fila tem " + fila.size() + comp + "\n");
                                break;

                            case 2:
                                System.out.println("\nDigite um numero para colocar na fila");
                                int numero = entrada2.nextInt();
                                fila.enqueue(numero);
                                System.out.println(" ");
                                break;

                            case 3:
                                System.out.println((fila.dequeue()) ? "\nPrimeiro item excluído\n" : "\nLista vazia\n");
                                break;

                            case 4:
                                System.out.print("\nO item no início da fila corresponde ao número: ");
                                fila.front();
                                System.out.println(" ");
                                break;

                            case 5:
                                comp = " item";
                                if (fila.size() > 1 || fila.size() == 0)
                                    comp = " itens";
                                System.out.println("\nA fila tem " + fila.size() + comp + "\n\n");
                                break;

                            case 6:
                                System.out.println("\nVoltando ao menu anterior... \n\n");
                                break;

                        }

                    } while (resp2 != 6);

                    break;

                case 2:
                    Scanner entrada3 = new Scanner(System.in);
                    int resp3;
                    Pilha pilha = new Pilha();
                    do {
                        System.out.println("================= PILHA =================");
                        System.out.println(" Digite a opção desejada: ");
                        System.out.println(" 1 - Verificar se a pilha está vazia.");
                        System.out.println(" 2 - Inserir objeto na pilha.");
                        System.out.println(" 3 - Remover objeto da pilha");
                        System.out.println(" 4 - Exibir objeto no topo da pilha");
                        System.out.println(" 5 - Exibir tamanho da pilha");
                        System.out.println(" 6 - Voltar para o menu anterior");
                        System.out.println("==========================================");

                        resp3 = entrada3.nextInt();

                        switch (resp3) {

                            case 1:
                                String comp = " item";
                                if (pilha.size() > 1)
                                    comp = " itens";

                                System.out.println(
                                        (pilha.empty()) ? "\nA pilha está vazia\n"
                                                : "\nA fila tem " + pilha.size() + comp + "\n");
                                break;

                            case 2:
                                System.out.println("\nDigite um numero para colocar na pilha");
                                int numero = entrada3.nextInt();
                                pilha.push(numero);
                                System.out.println(" ");
                                break;

                            case 3:
                                System.out.println((pilha.pop()) ? "\nItem excluído\n" : "\nLista vazia\n");
                                break;

                            case 4:
                                System.out.print("\nO primeiro item da pilha corresponde ao número: ");
                                pilha.top();
                                System.out.println(" ");
                                break;

                            case 5:
                                comp = " item";
                                if (pilha.size() > 1 || pilha.size() == 0)
                                    comp = " itens";
                                System.out.println("\nA pilha tem " + pilha.size() + comp + "\n\n");
                                break;

                            case 6:
                                System.out.println("\nVoltando ao menu anterior... \n\n");
                                break;

                        }

                    } while (resp3 != 6);

                    break;

                case 0:
                    System.out.println("\nObrigada por utilizar nossa aplicação\n\n");
                    resp = 0;
                    break;

            }

        } while (resp != 0);
        entrada.close();

    }

}