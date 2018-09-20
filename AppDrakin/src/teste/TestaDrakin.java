package teste;

import negocio.Acesso;
import negocio.Localizacao;
import negocio.Usuario;
import java.util.Scanner;
import auxiliar.Constante;
import auxiliar.Constante;

public class TestaDrakin {
	public static void main(String[] args) {

		
		Acesso access = new Acesso();
		access.setEsqueciSenha(true);
		access.setLogin("tamadog");
		access.setSenha("1234");
		
		Localizacao local = new Localizacao();
		local.setCep("12345-90");
		local.setCidade("Rio de Janeiro");
		local.setComplemento("apartamento 202");
		local.setEstado("Rio de janeiro");
		local.setNumero(90);
		local.setPais("Brasil");
		
		
		
		Usuario user = new Usuario();
		user.setApelido("tamadog");
		user.setConfirmaSenha("1234");
		user.setEmail("likeabozidade@gmail.com");
		user.setSexo(true);
		user.setIdade(18);
		user.setRespostaSecreta("Smurf");
		user.setSenha("1234");
		user.setAcesso(access);
		user.setLocalizacao(local);
		user.exibir();
	}
}
	
	

