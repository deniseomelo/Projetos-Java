public class Reserva extends Voo{  

	private Passageiro passageiro;   
	private Voo voo;   
	private int numeroAssento;   
	private String classeVoo;
	private double valorTarifa;

	public Reserva() {
		super();
	}
	public Reserva(Passageiro passageiro, Voo voo, int numeroAssento, String classeVoo, double valorTarifa) {
		super();
		this.passageiro = passageiro;
		this.voo = voo;
		this.numeroAssento = numeroAssento;
		this.classeVoo = classeVoo;
		this.valorTarifa = valorTarifa;
	}


	public void calcularTarifa() {
		if (classeVoo.equals("Executiva")) {
			int numItensRefeicao = 5;
			double valorBasico = voo.getCapacidade() * 100.0;
			double acrescimo = numItensRefeicao * (0.01 * valorBasico);
			this.valorTarifa = 1.5 * valorBasico + acrescimo;
		} else {
			this.valorTarifa = voo.getCapacidade() * 100.0;
		}
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public int getNumeroAssento() {
		return numeroAssento;
	}
	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}
	public String getClasseVoo() {
		return classeVoo;
	}
	public void setClasseVoo(String classeVoo) {
		this.classeVoo = classeVoo;
	}
	public double getValorTarifa() {
		return valorTarifa;
	}
	public void setValorTarifa(double valorTarifa) {
		this.valorTarifa = valorTarifa;
	}
	@Override
	public String toString() {
		return "Reserva [passageiro=" + passageiro + ", voo=" + voo + ", numeroAssento=" + numeroAssento
				+ ", classeVoo=" + classeVoo + ", valorTarifa=" + valorTarifa + "]";



	}


}
