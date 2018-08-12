package org.trabajopractico4.gestion;

import javax.persistence.*;

import org.openxava.annotations.*;
@MappedSuperclass
@Entity
public class Gestion {
   @Id @Column (length=11)@Required
	private String nombre_gestion;

public String getNombre_gestion() {
	return nombre_gestion;
}

public void setNombre_gestion(String nombre_gestion) {
	this.nombre_gestion = nombre_gestion;
}   


}
