package com.clearminds.interfaces;

import com.clearminds.model.Persona;

public interface ServicioPersona {
	public boolean insertar(Persona p);
	public boolean actualizar(Persona p);
	public boolean eliminar(Persona p);
	
}
