package exercicio;

public class Lugar {

	private String pais;
	private String continente;
	private String clima;
	private String idioma;
	private String moeda;
	
	//CONSTRUTOR
	
	public Lugar(String Pais, String Continente, String Clima, String Idioma, String Moeda) {
		this.pais= Pais;
		this.continente=Continente;
		this.clima=Clima;
		this.idioma=Idioma;
		this.moeda=Moeda;
		
	}
	
	//METODO SETTER
	
	public void setPais(String Pais) {
		pais = Pais;
	}
	
	public void setClima(String Clima) {
		clima = Clima;
	}
	
	public void setIdioma(String Idioma) {
		idioma = Idioma;
		
	}
	
	public void setMoeda (String Moeda) {
		moeda = Moeda;
	}
	
	//METODO GETTER
	
	public String getPais() {
		return pais;
	}
	
	public String getContinente() {
		return continente;
	}
	
	public String getClima() {
		return clima;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public String getMoeda () {
		return moeda;
	}
	
	//Passar
	
	public void passar(){
		System.out.println("Destino para passear.");
	}
	
	//Viajar
	
	public void viajar() {
		System.out.println("Destino para viajar.");
	}

	//Nadar
	
	public void prender() {
		System.out.println("Destino para nadar.");
	}
	
}
