package modelo;

public class Compra {

	private double valorTotal;
	private int numeroParcelas;
	
	public Compra(double valorTotal) {
		this.valorTotal = valorTotal;
		this.numeroParcelas = 1;
	}
	
	public Compra(int numeroParcelas, double valorTotal) {
		this.valorTotal = valorTotal;
		this.numeroParcelas = numeroParcelas;		
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}
	
	public double getValorParcela() {
		return getValorTotal()/getNumeroParcelas();
	}	
}
