package ual.hmis.sesion05.ejercicio9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Usuario
 *
 */
public class Ejercicio9 {
	/**
	 * @param lista1
	 * @param lista2
	 * @return resultado
	 */
	public static ArrayList<String> listaCadenasOrdenadas(final ArrayList<String> lista1, final ArrayList<String> lista2) {
		ArrayList<String> resultado = new ArrayList<String>();
		Collections.sort(lista1);
		Collections.sort(lista2);
		resultado.addAll(lista1);
		for (String cadena : lista2) {
			if (!lista1.contains(cadena)) {
				resultado.add(cadena);
			}
		}

		Collections.sort(resultado);
		return resultado;
	}
}
