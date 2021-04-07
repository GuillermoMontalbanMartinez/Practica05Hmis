package ual.hmis.sesion05.ejercicio9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
	
	public static ArrayList<String> listaCadenasOrdenadas(ArrayList<String> lista1, ArrayList<String> lista2) {
		ArrayList<String> resultado = new ArrayList<String>();
		Collections.sort(lista1);
		Collections.sort(lista2);
		resultado.addAll(lista1);
		for (String cadena : lista2)
			if (!lista1.contains(cadena))
				resultado.add(cadena);	
		Collections.sort(resultado);	
		return resultado;
	}
}
