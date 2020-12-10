package com.clearminds.impl;

import com.clearminds.model.Persona;
import com.clearminds.model.PersonaManager;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaManager p = new PersonaManager();
		p.insertarPersona(new Persona("Dario","Herrera", 23));
	}

}
