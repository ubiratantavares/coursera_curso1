package model;

import static java.lang.Math.pow;

public class Paciente {
	
	private double peso;	
	private double altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
	
	public double calcularIMC() {
		return (peso / pow(altura, 2.0));
	}
	
	public String diagnostico() {
		double imc = this.calcularIMC();
		if (imc < 16) {
			return "Baixo peso muito grave";
		} else if (imc < 17) {
			return "Baixo peso grave";
		} else if (imc < 18.50) {
			return "Baixo peso";
		} else if (imc < 25) {
			return "Peso normal";
		} else if (imc < 30) {
			return "Sobrepeso";
		} else if (imc < 35) {
			return "Obesidade grau I";
		} else if (imc < 40) {
			return "Obesidade grau II";
		} else {
			return "Obesidade grau III (obesidade mórbida)";
		}
	}
}
