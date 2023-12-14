package appes;

import javax.swing.JOptionPane;


public class App {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int qtd = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite quantos email quer  enviar:"));
		@SuppressWarnings("unused")
		Pessoa pessoa[] = new Pessoa[qtd];
		Pessoa[] Pessoa = null;
		for(int i=0 ; i<qtd ; i++) {
			int tipo = Integer.parseInt(JOptionPane.showInputDialog(
			"Digite o tipo de email que quer enviar:\n1-Aluno \n2-Funcionario \n3-Professor"));
			if(tipo==1) {
				Pessoa novo = new Aluno(JOptionPane.showInputDialog("Digite email:"));
						
				Pessoa[i] = novo;
			}
			else if(tipo==2) {
				Pessoa novo = new Funcionario(
						JOptionPane.showInputDialog(
								"Digite email:"));
				Pessoa[i] = novo;
			}
		         
		              else if(tipo==3) {
			     Pessoa novo = new Professor(
					      JOptionPane.showInputDialog(
							"Digite email:"), tipo);
			     int i1 = 0;
				Pessoa[i1] = novo;
		}
		    for(int i1=0 ; i1<qtd ; i1++) {
			    System.out.println(Pessoa[i1]);
		}
		}
	}
}
