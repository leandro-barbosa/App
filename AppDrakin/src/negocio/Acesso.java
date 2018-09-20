package negocio;

public class Acesso {
	private String login;
	private String senha;
	private boolean esqueciSenha;
	

	
	public void exibir() {
		System.out.printf("=============Acesso=========="
				+ "\nLogin: %s\n"
				+ "Senha: %s\n"
				+ "esqueci minha senha? %s\n",
				login,
				senha,
				(esqueciSenha ? "sim" : "não"));
	}
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isEsqueciSenha() {
		return esqueciSenha;
	}

	public void setEsqueciSenha(boolean esqueciSenha) {
		this.esqueciSenha = esqueciSenha;
	}
	
}
