package exercicio;

public class Instrumentos {

	private String nome;
	private String modelo;
	private String classe;
	private String cor;
	private String tamanho;
	
	//CONSTRUTOR
	
		public Instrumentos(String Nome, String Modelo, String Classe, String Cor, String Tamanho){
			
			nome= Nome;
			modelo=Modelo;
			classe=Classe;
			cor=Cor;
			tamanho=Tamanho;

		}
	
	
	//SETTER
		
		public void setNome(String Nome) {
			nome = Nome;
		}
		
		public void setModelo(String Modelo) {
			modelo = Modelo;
		}
		
		public void setClasse(String Classe) {
			classe = Classe;
		}
		
		public void setCor(String Cor) {
			cor = Cor;
		}
		
		public void setTamanho(String Tamanho) {
			tamanho = Tamanho;
		}
		
		
	//GETTER


		public String getNome() {
			return nome;
		}
	
	
		public String getModelo() {
			return modelo;
		}

	
		public String getClasse() {
			return classe;
		}
		
		public String getCor() {
			return cor;
		}
		
		public String getTamanho() {
			return tamanho;
		}
		
	
	//Tocar
	
	public void tocar() {
		System.out.println("Este instrumento é de tocar.");
	}
	
	//Soprar
	
	public void soprar() {
		System.out.println("Este instrumento é de soprar.");	
	}
	
	//Bater
	
	public void bater() {
		System.out.println("Este instrumento é de soprar.");	
	}	
	
}
