package ual.hmis.sesion05.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

	@ParameterizedTest
	@CsvSource({ "5, *****", "1, *****", "12, ************", "100, ************" })

	void testPassword(int n, String result) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(result, c.ejer3(n));
	}

}
