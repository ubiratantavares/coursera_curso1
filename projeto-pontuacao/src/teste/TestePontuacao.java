package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Bonificacao;
import modelo.Pontuacao;
import modelo.Usuario;

class TestePontuacao {
	
	Usuario usuario = new Usuario();
	Bonificacao bonus = new Bonificacao();
	Pontuacao pontos;

	@Test
	public void pontosCriarTopico() {
		pontos = new Pontuacao(bonus);
		pontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 5);
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		usuario.nome = "Guerra";
		usuario.vip = true;		
		Pontuacao pontos = new Pontuacao(bonus);		
		pontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 25);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		usuario.nome = "Guerra";
		bonus.setBonus(3);
		Pontuacao pontos = new Pontuacao(bonus);
		pontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 15);			
	}
	
	@Test
	public void pontosCriarTopicoVIPBonusDoDia() {
		usuario.nome = "Guerra";
		usuario.vip = true;		
		bonus.setBonus(2);
		Pontuacao pontos = new Pontuacao(bonus);
		pontos.criarUmTopico(usuario);
		assertEquals(usuario.pontos, 50);		
	}
}
