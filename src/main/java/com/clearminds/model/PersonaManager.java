package com.clearminds.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.clearminds.interfaces.ServicioPersona;

public class PersonaManager {
	private ServicioPersona serv;
	

	public PersonaManager()  {
		super();
		String propiedad;
		try {
			propiedad = leerArchivo();
			Class<?>clase = Class.forName(propiedad);
			this.serv=(ServicioPersona)clase.newInstance();	
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");		
		}
	}
	
	public void insertarPersona(Persona p){
		this.serv.insertar(p);
	}
	
	public String leerArchivo() throws FileNotFoundException, IOException{
		String propiedad;
		Properties p = new Properties();
		p.load(new FileReader("./config.properties"));
		propiedad = p.getProperty("propiedad");
		return propiedad;
	}
	
}
