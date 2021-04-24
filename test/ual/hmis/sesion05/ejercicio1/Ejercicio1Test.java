package ual.hmis.sesion05.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio1Test {
	@ParameterizedTest(name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({ "2, 1", "5, 1", "6, 1", "14, 7" })

	void testTransformar(int input, int expected) {
		Ejercicio1 ejer = new Ejercicio1();
		assertEquals(expected, ejer.transformar(input));
	}

}
