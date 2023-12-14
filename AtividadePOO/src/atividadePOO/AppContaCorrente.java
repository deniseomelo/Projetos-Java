package atividadePOO;

public class AppContaCorrente {

	public static void main(String[] args) {
		Agencia c1 = new Agencia();
		c1.setIdAgencia("conta corrente");
		c1.setNomeAgencia("BBX");
		
		ContaCorrente p1 = new ContaCorrente();
		p1.setNumConta(1111);
	    p1.setSaldo(100);
		
		
		c1.Consultar();
		p1.Consultar();
			
		}

	}


