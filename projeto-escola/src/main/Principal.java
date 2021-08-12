package main;

import modelo.Aluno;
import negocio.VerificadoraNotas;

public class Principal {

	public static void main(String[] args) {
		
		int notas[] = new int[4];
		
		notas[0] = 7;
		notas[1] = 6;
		notas[2] = 8;
		notas[3] = 7;
		
		Aluno aluno = new Aluno(notas);
		
		System.out.println(aluno.media());
		System.out.println(aluno.passouDeAno());
		
		System.out.println(VerificadoraNotas.media(aluno));
		System.out.println(VerificadoraNotas.passouDeAno(aluno));
	}
}
