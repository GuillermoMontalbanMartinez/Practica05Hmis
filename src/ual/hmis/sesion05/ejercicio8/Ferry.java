package ual.hmis.sesion05.ejercicio8;

import java.util.ArrayList;

public class Ferry {
	protected int maxPasajeros;
	protected int maxVehiculos;
	protected int pesoMaxVehiculos;
	protected int totalVehiculos;
	protected int pesoTotalVehiculos;
	protected ArrayList<Vehiculo> vehiculos;

	/**
	 * Asignacion.
	 */
	public Ferry() {
		this.vehiculos = new ArrayList<Vehiculo>();
	}

	/**
	 * @param v
	 * @return boolean
	 */
	boolean embarcarVehiculo(final Vehiculo v) {
		return this.vehiculos.add(v);
	}

	/**
	 * @return boolean
	 */
	boolean Vacio() {
		return this.vehiculos.size() == 0;
	}

	/**
	 * @return boolean
	 */
	boolean superadoMaximoVehiculos() {
		return this.vehiculos.size() > this.getMaxVehiculos();
	}

	/**
	 * @return boolean
	 */
	boolean superadoMaximoPeso() {
		int peso = 0;
		for (Vehiculo v : this.vehiculos) {
			peso += v.getPesoConCarga();
		}
		return peso > this.getPesoMaxVehiculos();

	}

	/**
	 * @return maxPasajeros
	 */
	public int getMaxPasajeros() {
		return maxPasajeros;
	}

	/**
	 * @param maxPasajeros
	 */
	public void setMaxPasajeros(final int maxPasajeros) {
		this.maxPasajeros = maxPasajeros;
	}

	/**
	 * @return pesoMaxVehiculos
	 */
	public int getPesoMaxVehiculos() {
		return pesoMaxVehiculos;
	}

	/**
	 * @param pesoMaxVehiculos
	 */
	public void setPesoMaxVehiculos(final int pesoMaxVehiculos) {
		this.pesoMaxVehiculos = pesoMaxVehiculos;
	}

	/**
	 * @return this.vehiculos.size()
	 */
	public int getTotalVehiculos() {
		return this.vehiculos.size();
	}

	/**
	 * @return maxVehiculos
	 */
	public int getMaxVehiculos() {
		return maxVehiculos;
	}

	/**
	 * @param maxVehiculos
	 */
	public void setMaxVehiculos(final int maxVehiculos) {
		this.maxVehiculos = maxVehiculos;
	}
}
