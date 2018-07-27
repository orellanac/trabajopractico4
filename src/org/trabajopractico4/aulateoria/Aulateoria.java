package org.trabajopractico4.aulateoria;

import javax.persistence.*;

import org.openxava.annotations.*;
@Entity
public class Aulateoria {
	@Column (length=22)@Required
	private String nombre_aulateoria;

	public String getNombre_aulateoria() {
		return nombre_aulateoria;
	}

	public void setNombre_aulateoria(String nombre_aulateoria) {
		this.nombre_aulateoria = nombre_aulateoria;
	}

	
	
	}
