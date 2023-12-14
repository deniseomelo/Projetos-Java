
class Voo {
	private int numeroVoo;
	private String origem;
	private String destino;
	private int capacidade;
	private String horaPartida;
	private String horaChegada;
	private double valorTarifaExecutiva;
	private double valorTarifaEconomica;

	public Voo(int numeroVoo, String origem, String destino, int capacidade, String horaPartida, String horaChegada) {
		this.numeroVoo = numeroVoo;
		this.origem = origem;
		this.destino = destino;
		this.capacidade = capacidade;
		this.horaPartida = horaPartida;
		this.horaChegada = horaChegada;
		this.valorTarifaExecutiva = 1.5 * capacidade;
		this.valorTarifaEconomica = capacidade;
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


	public double getValorTarifaExecutiva() {
		return valorTarifaExecutiva;
	}


	public void setValorTarifaExecutiva(double valorTarifaExecutiva) {
		this.valorTarifaExecutiva = valorTarifaExecutiva;
	}


	public double getValorTarifaEconomica() {
		return valorTarifaEconomica;
	}


	public void setValorTarifaEconomica(double valorTarifaEconomica) {
		this.valorTarifaEconomica = valorTarifaEconomica;
	}


	public double getValorTarifa(String classeVoo) {
		if (classeVoo.equals("Executiva")) {
			return valorTarifaExecutiva + (5 * capacidade * 0.01 * valorTarifaExecutiva);
		} else {
			return valorTarifaEconomica;
		}
	}
}
