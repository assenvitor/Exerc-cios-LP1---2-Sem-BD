package exercicio;

public class Calcado {

	private String modelo;
	private String marca;
	private String cor;
	private int tamanho;
	private String material;
	
	
	//CONSTRUTOR
	
		public Calcado(String Modelo, String Marca, int Tamanho, String Material, String Cor){

			modelo=Modelo;
			marca=Marca;
			tamanho=Tamanho;
			material=Material;
			cor= Cor;
			
		}

	//SETTER
		
	public  void setModelo(String Modelo) {
		modelo = Modelo;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//GETTER
	
	public int getTamanho() {
		return tamanho;
	}
	
	
	public String getMaterial() {
		return material;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	//Correr
	
	public void correr(){
	System.out.println("Este calçado é para correr.");
	}
		
	//Andar
	
	public void andar() {
	System.out.println("Este calçado é para andar.");
		}
	
			
	//Desfilar
		
	public void desfilar() {
		System.out.println("Este calçado é para desfilar.");
		}

	
	
}
