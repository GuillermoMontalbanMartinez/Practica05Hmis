package ual.hmis.sesion05.ejercicio10;

public class Ejercicio10 {
	public int convertirCadenaEntero(String s) throws Exception {
		try{
			int numero = Integer.parseInt(s);
			
			if(numero < -32768 || numero > 32767) return -1;
			return numero;
		
		}catch(Exception e) {
			throw new Exception("Formato incorrecto");
		}
	}
}
