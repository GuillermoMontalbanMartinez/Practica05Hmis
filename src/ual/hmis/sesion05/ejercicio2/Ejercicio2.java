package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {
	
	/**
	 * Número magico.
	 */
	static final int LIMITE = 30;
	
	/**
	 * @param username
	 * @param password
	 * @return boolean
	 */
	public boolean login(final String username, final String password) {
		// Comprobar que sean distintos de vacio
		if (username == null || password == null || username.isEmpty()
				|| password.isEmpty()) {
			return false;
		}
		// Comprobar que la longitud sea < 30
		if (username.length() >= LIMITE || password.length()
				>= LIMITE) {
			return false;
		}

		// llamar al método de la bbdd
		return compruebaLoginEnBD(username, password);
	}

	/**
	 * @param username
	 * @param password
	 * @return boolean
	 */
	public boolean compruebaLoginEnBD(final String username, 
			final String password) {
		if (username.equals("user") && password.equals("pass")) {
			return true;
		} 
		return false;
	}
}
