package ual.hmis.sesion05.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ejercicio9Test {
	@ParameterizedTest 
	@CsvSource({"'AAAABBDL', 'ABEERTY', 'AB'",
				"'DFGGRT', 'DFGTT', 'DFGT'"
				})
	
	@Test
	void testEjercicio9(String s1, String s2, String s3) {
		Ejercicio9 e = new Ejercicio9();
		assertEquals(s3, e.listaCadenasOrdenadas(s1, s2));
	}

}
