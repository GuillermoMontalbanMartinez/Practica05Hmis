package ual.hmis.sesion05.ejercicio9;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ejercicio9Test {
	@ParameterizedTest(name = "{index} => La lista 1 contiene {0} y la lista 2 contiene {1}. Como resultado se obtiene {2}")
	@MethodSource("generateData")

	void testEjercicio9(ArrayList<String> cadena1, ArrayList<String> cadena2, ArrayList<String> salida) {
		Ejercicio9 ejercicio9 = new Ejercicio9();
		;

		ArrayList<String> resultado = new ArrayList<String>();
		resultado = ejercicio9.listaCadenasOrdenadas(cadena1, cadena2);

		assertEquals(salida, resultado);

	}

	static Stream<Arguments> generateData() {
		return Stream.of(
				Arguments.of(new ArrayList<String>(Arrays.asList("pepino", "luisito", "casaMol", "antonio")),
						new ArrayList<String>(Arrays.asList("pepino", "alfonso", "abel", "antonio")),
						new ArrayList<String>(
								Arrays.asList("abel", "alfonso", "antonio", "casaMol", "luisito", "pepino"))),
				Arguments.of(new ArrayList<String>(Arrays.asList("pepino", "luisito", "casaMol")),
						new ArrayList<String>(Arrays.asList("pepino", "abel")),
						new ArrayList<String>(Arrays.asList("abel", "casaMol", "luisito", "pepino"))));
	}

}
