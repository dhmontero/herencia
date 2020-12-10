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
		Properties p = new Properties();
		try {
			p.load(new FileReader("C:\\Users\\dario\\Documents\\DATA\\Curso Java\\Fase2\\herencia\\config.properties"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			propiedad = p.getProperty("propiedad");
		try {
			Class<?>clase = Class.forName(propiedad);
			this.serv=(ServicioPersona)clase.newInstance();		
		} catch (Exception e) {
			throw new InstanceException("Error al obtener una instancia de ServicioPersona");
		}
	}
	
	public void insertarPersona(Persona p){
		this.serv.insertar(p);
	}
	
}
