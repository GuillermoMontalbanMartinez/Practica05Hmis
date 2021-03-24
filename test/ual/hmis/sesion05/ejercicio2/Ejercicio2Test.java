package ual.hmis.sesion05.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {
	@ParameterizedTest
	@CsvSource({"AAA, '123', false",
				"NombreMuyLargooooooooooooParaElTesttttttttttttttttt, '1234', false",
				"Usuario, '123456789101112131415161718192021', false",
				"user, pass11, false",
				"user123, pass, false",
				"user, pass, true",
				"prueba, hackeado, false"
				})

	@Test
	void testLogin(String user, String pass, boolean result) {
		Ejercicio2 ejer = new Ejercicio2();
		assertEquals(result, ejer.login(user, pass));
	}

	@Test
	void testCompruebaLoginEnBD() {
		Ejercicio2 ejer = new Ejercicio2();
		assertFalse(ejer.login(null, "4334"));
		assertFalse(ejer.login("guillermo", null));
	}

}
