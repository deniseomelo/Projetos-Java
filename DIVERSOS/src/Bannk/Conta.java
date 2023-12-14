package Bannk;

import javax.swing.JOptionPane;

public class Conta {
	    private int numero;
	    Cliente titular;
	    private double saldo;
	    
	    public void setNumero(int numero) {
			this.numero = numero;
		}
	    void transferir(Conta destino, double valor) {
	        this.saldo -= valor; 	//debita a conta de origem
	        destino.saldo += valor; //credita a conta de destino
	    }         
		public Conta() {		
		}
		public Conta(int numero, Cliente titular, double saldo) {
			this.numero = numero;
			this.titular = titular;
			this.saldo = saldo;
		}
		public int getNumero() {
			return numero;
		}
		
		public Cliente getTitular() {
			return titular;
		}


		public void setTitular(Cliente titular) {
			this.titular = titular;
		}


		public double getSaldo() {
			return saldo;
		}


		public void setSaldo(double saldo) {
			if(saldo>0) 
				this.saldo = saldo;
		}


		public void sacar(double valor) {
	    	if(saldo < valor)
	    		JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
	    	else
	    		this.saldo -= valor; // saldo = saldo - valor
	    }
	    
	    public void depositar(double valor) {
	        this.saldo += valor;
	    }
	    // ..
	}

