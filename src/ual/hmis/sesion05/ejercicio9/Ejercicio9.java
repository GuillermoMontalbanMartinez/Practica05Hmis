package ual.hmis.sesion05.ejercicio9;

public class Ejercicio9 {
	public String listaCadenasOrdenadas(String cadena1, String cadena2) {
		String salida ="";
		
		for(int i = 0; i < cadena1.length(); i++) {
			if(cadena2.contains(cadena1.subSequence(i, i+1)) && !(salida.contains(cadena1.subSequence(i, i+1)))) {
				salida += cadena1.subSequence(i, i+1);
			}
		}
		
		System.out.println(salida);
		return salida;
	}
}
