


public class AppVoo {

	public static void main(String[] args) {
		Voo voo1 = new Voo(123, "São Paulo", "Portugal", 100, "15:00", "07:00");
		Voo voo2 = new Voo(358, "Rio de janeiro", "França", 100, "10:00", "09:00");


		Passageiro passageiro1 = new Passageiro("Anna Maria", 30, "123456", 5);
		Reserva reserva1 = new Reserva(voo1.getNumeroVoo(), voo1.getOrigem(), voo1.getDestino(), 0, null, null, passageiro1, voo1, 10, "Executiva", voo1.getValorTarifa("Executiva"));


		Passageiro passageiro2 = new Passageiro("Bruno Oliveira", 50, "789012", 0);
		Reserva reserva2 = new Reserva(voo2.getNumeroVoo(), voo2.getOrigem(), voo2.getDestino(), 0, null, null, passageiro2, voo2, 15, "Econômica", voo2.getValorTarifa("Econômica"));



		// Imprimindo as informações das reservas

		System.out.println("======== COMPANHIAS AÉRIAS DOM ==============");
		System.out.println(" ");

		System.out.println("Reserva 1:");
		System.out.println("Nome do passageiro: " + reserva1.getPassageiro().getNome());
		System.out.println("Número do voo: " + reserva1.getVoo().getNumeroVoo());
		System.out.println("Data/hora da partida: " + reserva1.getVoo().getHoraPartida());
		System.out.println("Data/hora da chegada: " + reserva1.getVoo().getHoraChegada());
		System.out.println("Número do assento reservado: " + reserva1.getNumeroAssento());
		System.out.println("Classe do voo: " + reserva1.getClasseVoo());
		System.out.println("Valor da tarifa: " + reserva1.getValorTarifa());
		System.out.println();

		System.out.println("Reserva 2:");
		System.out.println("Nome do passageiro: " + reserva2.getPassageiro().getNome());
		System.out.println("Número do voo: " + reserva2.getVoo().getNumeroVoo());
		System.out.println("Data/hora da partida: " + reserva2.getVoo().getHoraPartida());
		System.out.println("Data/hora da chegada: " + reserva2.getVoo().getHoraChegada());
		System.out.println("Número do assento reservado: " + reserva2.getNumeroAssento());
		System.out.println("Classe do voo: " + reserva2.getClasseVoo());
		System.out.println("Valor da tarifa: " + reserva2.getValorTarifa());
		System.out.println();

	}
}