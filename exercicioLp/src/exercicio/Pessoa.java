package exercicio;

public class Pessoa {

	private String nome;
	private int idade;
	private String genero;
	private String cidade;
	private int telefone;
	
	//CONSTRUTOR
					
		public Pessoa(String Nome, int Idade, String Genero, String Cidade, int Telefone) {
			this.nome= Nome;
			this.idade=Idade;
			this.genero=Genero;
			this.cidade=Cidade;
			this.telefone=Telefone;
			
		}
		
		//METODO SETTER
		
		public void setGenero(String Genero) {
			genero = Genero;
		}
			
		public void setCidade(String Cidade) {
			cidade = Cidade;
			
		}
		
		public void setTelefone (int Telefone) {
			telefone = Telefone;
		}
		
		//METODO GETTER
		
		public String getNome() {
			return nome;
		}
		
		public int getIdade() {
			return idade;
		}
		
		public String getCidade() {
			return cidade;
		}
		
		public int getTelefone() {
			return telefone;
		}
		
		public String getGenero() {
			return genero;
		}
	
	//Andar
		
		public void andar() {
			System.out.println("A pessoa esta andando.");
		}
		
		
	//Correr
		public void correr() {
			System.out.println("A pessoa esta correndo.");
		}
	
	//Pular
		public void pular() {
			System.out.println("A pessoa esta pulando.");
		}

	
}
