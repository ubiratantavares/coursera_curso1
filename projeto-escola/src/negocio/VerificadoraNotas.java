package negocio;

import modelo.Aluno;

public class VerificadoraNotas {
	
	public static int media(Aluno aluno) {
		int total = 0;
		for (int i = 0; i < aluno.getNotas().length; i++) {
			total += aluno.getNotas()[i];			
		}
		return total / aluno.getNotas().length;
	}
	
	public static boolean passouDeAno(Aluno aluno) {
		if (aluno.media() >= 6) {
			return true;
		}
		return false;
	}

}
