package ual.hmis.sesion05.ejercicio8;

/**
 * @author Usuario
 *
 */
public class Vehiculo {
	protected int numeroPasajeros;
	protected int numeroRuedas;
	protected int pesoConCarga;

	/**
	 * @return
	 */
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	/**
	 * @param numeroPasajeros
	 */
	public void setNumeroPasajeros(final int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	/**
	 * @return
	 */
	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	/**
	 * @param numeroRuedas
	 */
	public void setNumeroRuedas(final int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	/**
	 * @return peso con carga
	 */
	public int getPesoConCarga() {
		return pesoConCarga;
	}

	/**
	 * @param pesoConCarga
	 */
	public void setPesoConCarga(final int pesoConCarga) {
		this.pesoConCarga = pesoConCarga;
	}
}
