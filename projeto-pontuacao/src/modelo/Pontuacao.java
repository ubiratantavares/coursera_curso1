package modelo;

public class Pontuacao {
	
	private Bonificacao bonus;	
		
	public Pontuacao(Bonificacao bonus) {
		this.bonus = bonus;
	}

	public Bonificacao getBonus() {
		return bonus;
	}

	public void setBonus(Bonificacao bonus) {
		this.bonus = bonus;
	}
	
	public void fazerUmComentario(Usuario usuario) {		
		usuario.pontos += 3 * bonus.bonus(usuario);
	}
	
	public void criarUmTopico(Usuario usuario) {
		usuario.pontos += 5 * bonus.bonus(usuario);
	}
	
	public void darUmLike(Usuario usuario) {
		usuario.pontos += 1 * bonus.bonus(usuario);
	}
}
