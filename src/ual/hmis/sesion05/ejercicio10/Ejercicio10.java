package ual.hmis.sesion05.ejercicio10;

public class Ejercicio10 {
	
	/**
	 * Número magico.
	 */
	static final int LIMITEINF = -32768;
	
	/**
	 * Número magico.
	 */
	static final int LIMITESUP = 32767;
	
	/**
	 * @param s
	 * @return numero
	 * @throws Exception
	 */
	public int convertirCadenaEntero(final String s) throws Exception {
		try {
			int numero = Integer.parseInt(s);

			if (numero < LIMITEINF || numero > LIMITESUP) {
				return -1;
			}
			return numero;

		} catch (Exception e) {
			throw new Exception("Formato incorrecto");
		}
	}
}
