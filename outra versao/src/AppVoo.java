

public class AppVoo {
	
    public static void main(String[] args) {
    	/**
    	 * instancia da classe voo
    	 */
 
        Voo voo1 = new Voo();
        voo1.setNumeroVoo(123);
        voo1.setOrigem("São Paulo");
        voo1.setDestino("Londre");
        voo1.setCapacidade(100);
        voo1.setHoraPartida("10:00");
        voo1.setHoraChegada("23:00");
        
        /**
         * instancia a classe passageiro
         */
        
        Passageiro passageiro1 = new Passageiro();
        passageiro1.setNome("Anna Cristina");
        passageiro1.setIdade(30);
        passageiro1.setNumeroPassaporte("123456");

        /**
         * Instancia a classe reserva
         */
        
        Reserva reserva1 = new Reserva();
        reserva1.setPassageiro(passageiro1);
        reserva1.setVoo(voo1);
        reserva1.setNumeroAssento(150);
        reserva1.setClasseVoo("Executiva");
        reserva1.calcularTarifa();

        /**
         * iprime as informações da reserva
         */
        
        System.out.println("======== COMPANHIAS AÉRIAS DOM ==============");
        System.out.println(" ");
        System.out.println("NOME DO PASSAGEIRO: " + reserva1.getPassageiro().getNome());
        System.out.println("NÚMERO DO VOO: " + reserva1.getVoo().getNumeroVoo());
        System.out.println("DATA/HORA DA PARTIDA: " + reserva1.getVoo().getHoraPartida());
        System.out.println("DATA/HORA DA CHEGADA: " + reserva1.getVoo().getHoraChegada());
        System.out.println("NUMERO DO ASSENTO RESERVADO: " + reserva1.getNumeroAssento());
        System.out.println("CLASSE DO VOO: " + reserva1.getClasseVoo());
        System.out.println("VALOR DA TARIFA: " + reserva1.getValorTarifa());
    }
}
