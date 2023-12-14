package appes;

public class Professor extends Pessoa {
	private String disciplina;
	private int id;
    public Professor() {
    	
	}
	public Professor(String disciplina, int id) {
		super();
		this.disciplina = disciplina;
		this.id = id;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Professor [disciplina=" + disciplina + ", id=" + id + "]";
	}
    
}
