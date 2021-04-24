package ual.hmis.sesion05.ejercicio10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio10Test {

	@ParameterizedTest
	@CsvSource({ "'-23', -23", "'4.6', -1", "'34', 34", "'Treinta y tres', -1", "'-54985', -1", "'234543', -1" })

	void testEjercicio9(String s, int i) {
		Ejercicio10 e = new Ejercicio10();
		try {
			assertEquals(i, e.convertirCadenaEntero(s));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			assertEquals(e1.getMessage(), "Formato incorrecto");
		}
	}
}
