package ArrayObjetoRedimensionavel;

public class Aluno {
	private String nome;
    private int id;
    private String curso;
    
    public Aluno(){}
    
    public Aluno(String nome,String curso,int id){
      this.nome=nome;
      this.curso=curso;
      this.id=id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString(){
      return "Nome="+this.nome+" - Curso="
              +this.curso+" - ID="+this.id;
    }

}




