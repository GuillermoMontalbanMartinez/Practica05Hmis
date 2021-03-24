package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {
	public String unirCadenas(String p1, String p2) {
		String resultado = new String();
		
		for (String s : p1.split(""))
			if (p2.contains(s))
				resultado += s;
		
		return resultado;
	}
}
