package modelo;

public class Bonificacao {

	private int bonus = 1;
	
	public int bonus(Usuario usuario) {
		int multiplicador = bonus;		
		if (usuario.vip) {
			multiplicador *= 5;			
		}		
		return multiplicador;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}	
}
