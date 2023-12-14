package atividadePOO;

public class ContaCorrente {
    private  int numConta;
    private double saldo;
    
    public void Consultar() {
		System.out.println("------------------------");
		System.out.println("ID AGENCIA:" + this.getNumConta());
		System.out.println("NOME AGENCIA:" + this.getSaldo());
		
    }
    
	public ContaCorrente(int numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public ContaCorrente() {
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
    
    
}
