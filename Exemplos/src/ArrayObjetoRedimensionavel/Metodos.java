package ArrayObjetoRedimensionavel;

public class Metodos {
	private static Aluno[] lista = new Aluno[4];
	
	static void inserir(Aluno aluno) {
		int n = 0;
		if(lista.length==n) {
			lista=alocarNovoArray();
		}
		 lista[n]=aluno;
	      n++;
	    }
	    
	    public static void exibir(){
	      int n = 0;
		for(int i=0;i<n;i++){
	          System.out.println(lista[i]); 
	      }
	    }
	    
	    
	    private static Aluno[] alocarNovoArray(){
	       Aluno[] novo=new Aluno[lista.length+4];
	       System.arraycopy(lista, 0, novo, 0, lista.length);
	       return novo;
	    }
	   


	}
	


