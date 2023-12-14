/*-----------------------------------------------------------------------------------------------*/
/*                  ATIVIDADE DE REFORÇO                                                         */
/*                  ALUNA: DENISE MELO                                                           */
/*                                                                                               */
/* OBS: Professor, tentei fazer o que pude. Estou com dificultades em Array.                     */
/*                                                                                               */
/*-----------------------------------------------------------------------------------------------*/                                                                                              
                                                            
package atividadePOO;
public class Agencia {
	private String idAgencia;
	private String nomeAgencia;
	
	
	public void Consultar() {
		System.out.println("------------------------");
		System.out.println("ID AGENCIA:" + this.getIdAgencia());
		System.out.println("NOME AGENCIA:" + this.getNomeAgencia());
	}
	
	public void depositar() {
		
	}
		
	
	
	public void sacar () {
		
	}
	
	public Agencia(String idAgencia, String nomeAgencia) {
		
		this.idAgencia = idAgencia;
		this.nomeAgencia = nomeAgencia;
	}

	public Agencia() {
		
	}

	public String getIdAgencia() {
		return idAgencia;
	}


	public void setIdAgencia(String idAgencia) {
		this.idAgencia = idAgencia;
	}


	public String getNomeAgencia() {
		return nomeAgencia;
	}


	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	
	
	
	
	

}
