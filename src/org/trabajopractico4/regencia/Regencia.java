package org.trabajopractico4.regencia;

import java.util.*;


import javax.persistence.*;

import org.trabajopractico4.escuela.*;

public class Regencia {
 private String nombre_persona;

public String getNombre_persona() {
	return nombre_persona;
}

public void setNombre_persona(String nombre_persona) {
	this.nombre_persona = nombre_persona;
}
@OneToMany (mappedBy="regencia")
private Collection <Escuela> escuela;

public Collection<Escuela> getEscuela() {
	return escuela;
}

public void setEscuela(Collection<Escuela> escuela) {
	this.escuela = escuela;
}


}
