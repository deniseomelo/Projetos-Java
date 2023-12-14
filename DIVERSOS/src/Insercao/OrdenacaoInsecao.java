package Insercao;

import javax.swing.JOptionPane;

public class OrdenacaoInsecao {

	public static void main(String[] args) {

		int tam = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o tamanho do vetor:"));
		int vetor[] = new int[tam];     
		for(int i=0 ; i<vetor.length ; i++)     {
			int num = (int)(Math.random()*20);
			while(inserir(num, vetor))
				num = (int)(Math.random()*20);          
			vetor[i] = num;
		}
		System.out.println("Antes da ordena��o:");
		imprimir(vetor);

		ordenarPorInsercao(vetor);

		System.out.println("\nDepois da ordena��o:");
		imprimir(vetor);    

		int num = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o n�mero a pesquisar:"));
		pesquisarNum(num, vetor);       
	}
	private static void pesquisarNum(int num, int[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]==num) {
				JOptionPane.showMessageDialog(null,
						num + " encontrado no �ndice: " + i);
				return;
			}                   
		}
		JOptionPane.showMessageDialog(null,
				num + "NÃO encontrado no VETOR: "); 
	}
	private static boolean inserir(int num, int[] vetor) {
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i]==num)
				return true;
		}
		return false;
	}
	private static void imprimir(int[] vetor) {
		for(int i=0 ; i<vetor.length ; i++)     {
			System.out.print(vetor[i] + " ");
		}
	}
	public static void ordenarPorInsercao (int [] v) {
		for (int i = 1; i < v.length; i++){
			int j = i;
			int x = v[j];
			while (j > 0 && x < v[j-1]) {
				v[j] = v[j-1];
				j--;
			}
			v[j] = x;
		}

	}


}


