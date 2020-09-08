package exercicio;

public class Alunos {

	private String nome;
	private int ra;
	private int idade;
	private String curso;
	private String conclusao;
	

	//CONSTRUTOR
	
	public Alunos(String Nome, int Ra, int Idade, String Curso, String Conclusao){
		nome= Nome;
		this.ra=Ra;
		this.idade=Idade;
		this.curso=Curso;
		this.conclusao=Conclusao;
		
	}
	
	// SETTER
	
	public void setNome(String Nome) {
		nome = Nome;
	}
	

	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//GETTER
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getCurso() {
		return curso;
	}
	
	
	public String getConclusao() {
		return conclusao;
	}
	
	public int getRa() {
		return ra;
	}
	
	//Estudar
	
	public void estudar() {
		System.out.println("O aluno estuda.");
	}
	
	//Concluir
	
		public void concluir() {
			System.out.println("O aluno conclui.");
		}

	//Cursa
		
		public void cursar() {
			System.out.println("O aluno está cursando.");
		}		
		
}
