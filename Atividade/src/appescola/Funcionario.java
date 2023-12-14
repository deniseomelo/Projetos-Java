package appes;

public class Funcionario extends Pessoa {
	private String departamento;
	public Funcionario() {
		
	}
	public Funcionario(String departamento) {
		super();
		this.departamento = departamento;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Funcionario [departamento=" + departamento + "]";
	}
	
}
