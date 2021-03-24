package ual.hmis.sesion05.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio4Test {
	@ParameterizedTest
	@CsvSource({"QWERTY, ABCDE, E",
				"AUDIO, SONIDO, DIO",
				"YYYY, AAAA, ''",
				"PIPI, POPO, PP",
				"aAaY, AaAhh, aAa"
		
	})
	void testUnirCadenas(String cadena1, String cadena2, String result) {
		Ejercicio4 ejer = new Ejercicio4();
		assertEquals(result, ejer.unirCadenas(cadena1, cadena2));
	}

}
