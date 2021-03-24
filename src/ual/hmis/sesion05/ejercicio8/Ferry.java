package ual.hmis.sesion05.ejercicio8;

import java.util.ArrayList;

public class Ferry {
	protected int maxPasajeros;
	protected int maxVehiculos;
	protected int pesoMaxVehiculos;
	protected int totalVehiculos;
	protected int pesoTotalVehiculos;
	protected ArrayList<Vehiculo> vehiculos;
	
	public Ferry() {
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	boolean embarcarVehiculo(Vehiculo v) {
		return this.vehiculos.add(v);
	}
	
	boolean Vacio() {
		return this.vehiculos.size() == 0;
	}
	
	boolean superadoMaximoVehiculos() {
		return this.vehiculos.size() > this.getMaxVehiculos();
	}
	
	boolean superadoMaximoPeso() {
		int peso=0;
		for(Vehiculo v : this.vehiculos) {
			peso+=v.getPesoConCarga();
		}
		return peso > this.getPesoMaxVehiculos();
		
	}

	public int getMaxPasajeros() {
		return maxPasajeros;
	}

	public void setMaxPasajeros(int maxPasajeros) {
		this.maxPasajeros = maxPasajeros;
	}

	public int getPesoMaxVehiculos() {
		return pesoMaxVehiculos;
	}

	public void setPesoMaxVehiculos(int pesoMaxVehiculos) {
		this.pesoMaxVehiculos = pesoMaxVehiculos;
	}

	public int getTotalVehiculos() {
		return this.vehiculos.size();
	}

	public int getMaxVehiculos() {
		return maxVehiculos;
	}

	public void setMaxVehiculos(int maxVehiculos) {
		this.maxVehiculos = maxVehiculos;
	}
}
