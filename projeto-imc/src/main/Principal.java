package main;

import model.Paciente;

public class Principal {
	
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente(60, 1.63);
		Paciente p2 = new Paciente(18, 1.10);
		Paciente p3 = new Paciente(130, 1.78);
		
		System.out.println(p1.calcularIMC() + " kg/m2");
		System.out.println(p1.diagnostico());

		System.out.println("----------------");

		
		System.out.println(p2.calcularIMC() + " kg/m2");
		System.out.println(p2.diagnostico());

		System.out.println("----------------");
		
		System.out.println(p3.calcularIMC() + " kg/m2");
		System.out.println(p3.diagnostico());		
	}
}
