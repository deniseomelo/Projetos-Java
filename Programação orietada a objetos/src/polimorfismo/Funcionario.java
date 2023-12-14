package polimorfismo;





public class Funcionario extends Pessoa{
    @Override
    public void enviarEmail(String destinatario, String assunto, String mensagem) {
        super.enviarEmail(destinatario, "Convocação para Exame Médico - " + assunto, mensagem);
    }
}


