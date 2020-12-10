package com.clearminds.model;

import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {
	private ServicioPersona serv;

	public PersonaManager() {
		super();
		this.serv = new ServicioPersonaArchivos();
	}
	
	public void insertarPersona(Persona p){
		this.serv.insertar(p);
	}
	
}
