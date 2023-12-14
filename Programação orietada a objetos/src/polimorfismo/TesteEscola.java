package polimorfismo;

public class TesteEscola {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.enviarEmail("Aluno@aluno.com", "Reunião na Secretaria", "Prezado aluno, estamos convocando você para uma reunião na secretaria.");

		Funcionario funcionario = new Funcionario();
		funcionario.enviarEmail("funcionario@escola.com", "Exame Médico", "Prezado funcionário, solicitamos que compareça ao centro médico da escola para realizar um exame.");

		Professor professor = new Professor();
		professor.enviarEmail("professor@escola.com", "Férias", "Prezado professor, informamos que a instituição entrará em período de férias a partir do dia 20/12/2022.");
	}
}

