

public class Voo {
	private int numeroVoo;
	private String origem;
	private String destino;
	private int capacidade;
	private String horaPartida;
	private String horaChegada;
	public Voo() {
		super();
	}
	public Voo(int numeroVoo, String origem, String destino, int capacidade, String horaPartida, String horaChegada) {
		super();
		this.numeroVoo = numeroVoo;
		this.origem = origem;
		this.destino = destino;
		this.capacidade = capacidade;
		this.horaPartida = horaPartida;
		this.horaChegada = horaChegada;
	}
	public int getNumeroVoo() {
		return numeroVoo;
	}
	public void setNumeroVoo(int numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getHoraPartida() {
		return horaPartida;
	}
	public void setHoraPartida(String horaPartida) {
		this.horaPartida = horaPartida;
	}
	public String getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}
	@Override
	public String toString() {
		return "Voo [numeroVoo=" + numeroVoo + ", origem=" + origem + ", destino=" + destino + ", capacidade="
				+ capacidade + ", horaPartida=" + horaPartida + ", horaChegada=" + horaChegada + "]";
	}
	
}



