package ual.hmis.sesion05.ejercicio1;

public class Ejercicio1 {
	/**
	 * Número magico.
	 */
	static final int TRES = 3;

	/**
	 * Número magico.
	 */
	static final int CINCO = 5;

	/**
	 * @param x
	 * @return resultado
	 */
	public int transformar(final int x) {
		int resultado = 0;

		if (x % 2 == 0) {
			resultado = transformar(x / 2);
		} else if (x % TRES == 0) {
			resultado = transformar(x / TRES);
		} else if (x % CINCO == 0) {
			resultado = transformar(x / CINCO);
		} else {
			return x;
		}

		return resultado;
	}
	
	// WEBHOOK
}
