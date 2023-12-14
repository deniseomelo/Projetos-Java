package polimorfismo;

public class Pessoa {

	public void enviarEmail(String destinatario, String assunto, String mensagem) {
		System.out.println("Enviar email para " + destinatario + " com assunto " + assunto + " a mensagem:\n " + mensagem + "\n");
	}
}