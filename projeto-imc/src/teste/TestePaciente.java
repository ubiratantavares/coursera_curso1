package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Paciente;

class TestePaciente {

	@Test
	public void testeBaixoPesoMuitoGrave() {
		Paciente p = new Paciente(50.0, 1.80);		
		assertEquals(15.43, p.calcularIMC(), 0.01);
		assertEquals("Baixo peso muito grave", p.diagnostico());
	}
	
	@Test
	public void testeBaixoPesoGrave() {
		Paciente p = new Paciente(53.0, 1.80);		
		assertEquals(16.35, p.calcularIMC(), 0.01);
		assertEquals("Baixo peso grave", p.diagnostico());
	}
	
	@Test
	public void testeBaixoPeso() {
		Paciente p = new Paciente(58.0, 1.80);		
		assertEquals(17.90, p.calcularIMC(), 0.01);
		assertEquals("Baixo peso", p.diagnostico());
	}
	
	@Test
	public void testePesoNormal() {
		Paciente p = new Paciente(62.0, 1.80);		
		assertEquals(19.13, p.calcularIMC(), 0.01);
		assertEquals("Peso normal", p.diagnostico());
	}

	@Test
	public void testeSobrePeso() {
		Paciente p = new Paciente(88.0, 1.80);		
		assertEquals(27.16, p.calcularIMC(), 0.01);
		assertEquals("Sobrepeso", p.diagnostico());
	}
	
	@Test
	public void testeObesidadeGrauI() {
		Paciente p = new Paciente(100.0, 1.80);		
		assertEquals(30.86, p.calcularIMC(), 0.01);
		assertEquals("Obesidade grau I", p.diagnostico());
	}
	
	@Test
	public void testeObesidadeGrauII() {
		Paciente p = new Paciente(120.0, 1.80);		
		assertEquals(37.03, p.calcularIMC(), 0.01);
		assertEquals("Obesidade grau II", p.diagnostico());
	}
	
	@Test
	public void testeObesidadeGrauIII() {
		Paciente p = new Paciente(150.0, 1.80);		
		assertEquals(46.29, p.calcularIMC(), 0.01);
		assertEquals("Obesidade grau III (obesidade mórbida)", p.diagnostico());
	}
}
