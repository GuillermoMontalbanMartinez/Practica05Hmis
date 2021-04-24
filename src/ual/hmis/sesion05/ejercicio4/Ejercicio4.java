package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {
	/**
	 * @param p1
	 * @param p2
	 * @return
	 */
	public String unirCadenas(final String p1, final String p2) {
		String resultado = new String();

		for (String s : p1.split("")) {
			if (p2.contains(s)) {
				resultado += s;
			}
		}
		return resultado;
	}
}
