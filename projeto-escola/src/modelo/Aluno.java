package modelo;

public class Aluno {
	
	private int notas[] = new int[4];		

	public Aluno(int[] notas) {
		this.notas = notas;
	}

	public int[] getNotas() {
		return notas;
	}	

	public int media() {
		int total = 0;		
		for (int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		return total / notas.length;
	}
	
	public boolean passouDeAno() {
		if (media() >= 6) {
			return true;
		}
		return false;
	}
}
