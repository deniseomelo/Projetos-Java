package Bannk;

import javax.swing.JOptionPane;

public class CriarConta {

	public static void main(String[] args) {		
        Conta conta1 = new Conta(); // criando objeto da conta1
        Cliente c = new Cliente();        
        conta1.titular = c;
        
        // alterando os valores de conta1
        c.setNome(JOptionPane.showInputDialog(
        		"Digite o nome do Titular:"));
        c.setCpf(JOptionPane.showInputDialog(
        		"Digite o cpf do Titular:"));
        c.setSobrenome(JOptionPane.showInputDialog(
        		"Digite o sobrenome do Titular:"));
        
        System.out.println("\nDados do cliente: " + c);
        
        
//        conta.setSaldo(Integer.parseInt(JOptionPane.showInputDialog(
//        		"Digite o saldo:")));
//        conta.setNumero(Integer.parseInt(JOptionPane.showInputDialog(
//        		"Digite o n�mero da conta:")));
//
//        // saca 200 reais
//        conta.sacar(Double.parseDouble(JOptionPane.showInputDialog(
//        		"Digite o valor do saque:")));
//
//        // deposita 500 reais
//        conta.depositar(Double.parseDouble(JOptionPane.showInputDialog(
//        		"Digite o valor do dep�sito:")));
//       
//		System.out.println("Dados da conta: "
//				+ "\nNome do Titular: " + conta.titular.getNome() 
//				+ "\nN�mero da conta: " + conta.getNumero() + ""
//				+ "\nSaldo: " + conta.getSaldo());
//		
//		Conta conta2 = new Conta(); // criando objeto da conta
//        conta2.titular.setNome(JOptionPane.showInputDialog("Digite o nome do Titular:"));
//        conta2.setSaldo(Integer.parseInt(JOptionPane.showInputDialog(
//        		"Digite o saldo:")));
//        conta2.setNumero(Integer.parseInt(JOptionPane.showInputDialog(
//        		"Digite o n�mero da conta:")));
//
//        // saca 200 reais
//        conta2.sacar(Double.parseDouble(JOptionPane.showInputDialog(
//        		"Digite o valor do saque:")));
//
//        // deposita 500 reais
//        conta2.depositar(Double.parseDouble(JOptionPane.showInputDialog(
//        		"Digite o valor do dep�sito:")));
//       
//		System.out.println("\nDados da conta: "
//				+ "\nNome do Titular: " + conta2.titular.getNome() 
//				+ "\nN�mero da conta: " + conta2.getNumero() + ""
//				+ "\nSaldo: " + conta2.getSaldo());
//		
//		conta.transferir(conta2, Double.parseDouble(
//				JOptionPane.showInputDialog(
//        		"Digite o valor da transfer�ncia:")));
//		
//		System.out.println("\nDados da conta ap�s a transfer�ncia: "
//				+ "\nNome do Titular: " + conta.titular.getNome() 
//				+ "\nN�mero da conta: " + conta.getNumero() + ""
//				+ "\nSaldo: " + conta.getSaldo());
//		
//
//        System.out.println("\nDados da  ap�s a transfer�ncia: "
//				+ "\nNome do Titular: " + conta2.titular.getNome() 
//				+ "\nN�mero da conta: " + conta2.getNumero() + ""
//			+ "\nSaldo: " + conta2.getSaldo());
	}
}