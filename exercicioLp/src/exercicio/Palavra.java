package exercicio;

public class Palavra {
	private String nome;

	public Palavra(String nome) {
		this.setPalavra(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setPalavra(String palavra) {
		this.nome = palavra;
	}
	
	public String toString() {
		return this.getNome();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palavra other = (Palavra) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}

//Autor: Vitor Assen
