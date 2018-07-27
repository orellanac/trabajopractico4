package org.trabajopractico4.escuela;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Escuela {
  @Column (length=22)@Required
  private String nombre_escuela;

public String getNombre_escuela() {
	return nombre_escuela;
}

public void setNombre_escuela(String nombre_escuela) {
	this.nombre_escuela = nombre_escuela;
}
  
	
}
