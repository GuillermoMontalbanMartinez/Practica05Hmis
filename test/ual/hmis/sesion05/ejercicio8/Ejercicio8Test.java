package ual.hmis.sesion05.ejercicio8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio8Test {
	@ParameterizedTest 
	@CsvSource({"5, 4, 3400",
				"2, 2, 310",
				"3, 4, 1200"
				})
	
	void testVehiculo(int pasajeros, int ruedas, int peso) {
		Vehiculo v = new Vehiculo();
		v.setNumeroPasajeros(pasajeros);
		v.setNumeroRuedas(ruedas);
		v.setPesoConCarga(peso);
		
		
		assertEquals(pasajeros, v.getNumeroPasajeros());
		assertEquals(ruedas, v.getNumeroRuedas());
		assertEquals(peso, v.getPesoConCarga());		
	}
	
	
	@ParameterizedTest 
	@CsvSource({"5, false, 3400, 1000, true",
				"1, true, 310, 2000, false",
				
				})
	
	void testFerry(int maxVehiculos, boolean superadoMaxVehiculos, int peso, int maxPeso, boolean superadoMaxPeso) {
		Vehiculo v = new Vehiculo();
		v.setNumeroPasajeros(5);
		v.setNumeroRuedas(4);
		v.setPesoConCarga(1200);
		
		Vehiculo v2 = new Vehiculo();
		v2.setNumeroPasajeros(2);
		v2.setNumeroRuedas(2);
		v2.setPesoConCarga(200);
		
		Ferry ferry = new Ferry();
		ferry.setMaxVehiculos(maxVehiculos);
		ferry.setPesoMaxVehiculos(maxPeso);
		
		assertTrue(ferry.embarcarVehiculo(v));
		assertTrue(ferry.embarcarVehiculo(v2));

		assertEquals(2, ferry.getTotalVehiculos());
		assertEquals(superadoMaxVehiculos, ferry.superadoMaximoVehiculos()); 
		
		assertEquals(superadoMaxPeso, ferry.superadoMaximoPeso());
		assertFalse(ferry.Vacio());
		
	}
	
	@Test
	public void testVacio() {
		Ferry f = new Ferry();
		assertTrue(f.Vacio());
	}
	
	@ParameterizedTest 
	@CsvSource({"10",
				"5",
				"1"
				})
	
	void testFerryPasajeros(int maxPasajeros) {
		
		Ferry ferry = new Ferry();		
		ferry.setMaxPasajeros(maxPasajeros);
		assertEquals(maxPasajeros, ferry.getMaxPasajeros());	
			
	}
}
