package modelo;

public class Carro {

	public int potencia;
	public int velocidade;
	public String nome;
	
	
	public void acelerar() {
		velocidade += potencia;		
	}
	
	public void frear() {
		velocidade /= 2;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void imprimir() {
		System.out.println("O carro " + nome  + " est� a velocidade de " + getVelocidade() + " km/h");
	}	
}
