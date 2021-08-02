package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Compra;

class TesteCompra {

	@Test
	public void compraAVista() {
		Compra c = new Compra(500.0);
		assertEquals(500.0, c.getValorTotal());
		assertEquals(500.0, c.getValorParcela());
		assertEquals(1, c.getNumeroParcelas());
	}
	
	@Test
	public void compraParcelada() {
		Compra c = new Compra(4, 1000.0);
		assertEquals(1000.0, c.getValorTotal());
		assertEquals(250.0, c.getValorParcela());
		assertEquals(4, c.getNumeroParcelas());
	}

}
