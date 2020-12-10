package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;

public class ServicioPersonaBDD implements ServicioPersona {
	public boolean insertar(Persona p) {
		System.out.println("Insertando persona: " +p);
		return true;
	}
	public boolean actualizar(Persona p) {
		System.out.println("Modificando persona: " +p);
		return true;
	}
	public boolean eliminar(Persona p) {
		System.out.println("Eliminando persona: " +p);
		return true;
	}
}
