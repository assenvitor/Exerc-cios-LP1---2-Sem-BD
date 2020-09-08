package exercicio;

public class Profissao {

	private String nome;
	private String profissao;
	private int idade;
	private String genero;
	private double salario;
	
	//CONSTRUTOR
	
	public Profissao(String Nome, String Profissao, int Idade, String Genero, double Salario){
		
		nome= Nome;
		profissao=Profissao;
		idade=Idade;
		genero=Genero;
		salario=Salario;

	}
				
	//SETTER
	
	public  void setNome(String Nome) {
		nome = Nome;
	}
	
	public void setProfissao(String Profissao) {
		profissao = Profissao;
	}
	
	public void setIdade(int Idade) {
		idade = Idade;
	}
		
	public void setSalario(float Salario) {
		salario = Salario;
	}
	
	//GETTER
	
	public  String getNome() {
		return nome;
	}
	
		
	public String getProfissao() {
		return profissao;
	}
	
	
	public int getIdade() {
		return idade;
	}
	
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public double getSalario() {
		return salario;
	}

	
	//Socorrer
	
	public void socorrer(){
		System.out.println("Este profissional socorre.");
	}
	
	//Prender
	
	public void prender() {
		System.out.println("Este profissional prende.");
	}
	
	//Ajudar
	
	public void ajudar() {
		System.out.println("Este profissional ajuda.");
	}

	
}
