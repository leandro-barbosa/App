package negocio;

public class Localizacao {
	private String pais;
	private String cidade;
	private String estado;
	private String complemento;
	private String cep;
	private float numero;
	
	public void exibir() {
		System.out.printf("=============Localização=========="
				+ "\nPais: %s\n"
				+ "Cidade: %s\n"
				+ "Estado: %s\n"
				+ "complemento: %s\n"
				+ "cep: %s\n"
				+ "numero: %f\n",
				pais,
				cidade,
				estado,
				complemento,
				cep,
				numero);
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(float numero) {
		this.numero = numero;
	}

	
	
}
