package org.trabajopractico4.preceptor;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.trabajopractico4.persona.*;

@Entity
public class Preceptor extends Persona{ 
 @Column(length=11) @Required
 private String nombre_prece;

public String getNombre_prece() {
	return nombre_prece;
}

public void setNombre_prece(String nombre_prece) {
	this.nombre_prece = nombre_prece;
}

 
}
