package org.trabajopractico4.gimnasio;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Gimnasio {
     @Column (length=11)@Required
	private String nombre_gim;
     

	public String getNombre_gim() {
		return nombre_gim;
	}

	public void setNombre_gim(String nombre_gim) {
		this.nombre_gim = nombre_gim;
	}
	
    
} 
