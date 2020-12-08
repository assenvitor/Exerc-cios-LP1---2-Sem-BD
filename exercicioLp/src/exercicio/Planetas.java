package exercicio;

public class Planetas {

	// Atributos
	
	private String nome;
	private String distanciaSol;
	private String temperatura;

	
	// Construtores
	
	public Planetas(String nome, String distanciaSol, String temperatura) {
		super();
		this.nome = nome;
		this.distanciaSol = distanciaSol;
		this.temperatura = temperatura;

	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(String distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	

}
