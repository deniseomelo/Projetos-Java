package polimorfismo;

public class Aluno extends Pessoa {
    @Override
    public void enviarEmail(String destinatario, String assunto, String mensagem) {
        super.enviarEmail(destinatario, "Solicitação de Presença na Secretaria - " + assunto, mensagem);
    }
}


