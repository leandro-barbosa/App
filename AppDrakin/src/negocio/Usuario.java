package negocio;

import java.util.Scanner;
import auxiliar.Constante;

public class Usuario {
	Scanner ler = new Scanner(System.in);

	private String apelido;
	private String email;
	private String senha;
	private String confirmaSenha;
	private String respostaSecreta;
	private int idade;
	private boolean sexo;
	private Localizacao localizacao;
	private Acesso acesso;
	
	
	public void exibir() {
		System.out.println(Constante.VERSAO);

		System.out.printf("=============Usuario=========="
				+ "\nApelido: %s\n"
				+ "email: %s\n"
				+ "senha: %s\n"
				+ "confirmar senha: %s\n"
				+ "idade: %s\n"
				+ "genero: %s\n",
				apelido,
				email,
				senha,
				confirmaSenha,
				idade,
				sexo ? "masculino" : "femenino");
		showPergunta();
		System.out.printf("Resposta secreta: %s\n", respostaSecreta);
		validarUsuario();
		localizacao.exibir();
		acesso.exibir();


		
	}
	
	private void showPergunta(){
		for (int i = 0; i < Constante.PERGUNTA_SECRETA.length; i++) {
		}
		System.out.println("Pergunta secreta escolhida:"+ Constante.PERGUNTA_SECRETA[1]);
		
	}
	private boolean validarUsuario() {
		if(this.senha.length() < 6) {
			System.err.println("Impossivel confirmar o seu cadastro, senha pequena demais");
			return false;
		}
		return true;
	}
	
	public String getApelido() {
		return apelido;
	}

	public Scanner getLer() {
		return ler;
	}


	public void setLer(Scanner ler) {
		this.ler = ler;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public String getRespostaSecreta() {
		return respostaSecreta;
	}

	public void setRespostaSecreta(String respostaSecreta) {
		this.respostaSecreta = respostaSecreta;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

	
}
