package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
	/**
	 * Número magico.
	 */
	static final int CINCO = 5;
	
	/**
	 * Número magico.
	 */
	static final int DOCE = 12;
	
	/**
	 * @param n
	 * @return
	 */
	public String ejer3(int n) {
		if (n <= CINCO)
			n = CINCO;
		if (n >= DOCE)
			n = DOCE;
		StringBuilder resultado = new StringBuilder();
		for (int i = 0; i < n; i++) {
			resultado.append("*");
		}

		return resultado.toString();
	}
}
