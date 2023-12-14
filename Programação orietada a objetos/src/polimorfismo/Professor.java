package polimorfismo;



	
	public class Professor extends Pessoa {
	    @Override
	    public void enviarEmail(String destinatario, String assunto, String mensagem) {
	        super.enviarEmail(destinatario, "Período de Férias da Instituição - " + assunto, mensagem);
	    }
	}


