package edu.unlam.progava.complejidadComputacional;

import org.junit.Assert;
import org.junit.Test;

public class OrdenadoraTests {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void pruebaAleatorios() {
		Integer[] elementos = { 1, 3, 2, 4, 0, -1, 5, 9, 6 };
		Integer[] ordenados = { -1, 0, 1, 2, 3, 4, 5, 6, 9 };

		Ordenadora<Integer> ordenadora = new Ordenadora<Integer>();

		Estrategia[] estrategias = { 
			new PorSeleccion<Integer>(),
			new PorBurbujeo<Integer>(),
			new PorInsercion<Integer>()
		};

		for (Estrategia<Integer> estrategia : estrategias) {
			ordenadora.setEstrategia(estrategia);
			Assert.assertArrayEquals(ordenados, ordenadora.ordenar(elementos));
		}
	}

}