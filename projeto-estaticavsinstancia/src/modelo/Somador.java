package modelo;

public class Somador {
	
	public String nome;
	public int valorInstancia = 0;
	public static int valorEstatica = 0;
	
	public void somar() {
		valorInstancia++;
		valorEstatica++;
	}
	
	public void imprimir() {
		System.out.println(nome + ": instancia = " + valorInstancia + ", estatica = " + valorEstatica);
	}
}
