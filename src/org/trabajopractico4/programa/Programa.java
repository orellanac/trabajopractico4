package org.trabajopractico4.programa;

import java.util.*;


import javax.persistence.*;

import org.trabajopractico4.escuela.*;

public class Programa {
 private String nombre_programa;

public String getNombre_programa() {
	return nombre_programa;
}

public void setNombre_programa(String nombre_programa) {
	this.nombre_programa = nombre_programa;
}
 @OneToMany (mappedBy="programa")
 private Collection<Escuela> escuela;

public Collection<Escuela> getEscuela() {
	return escuela;
}

public void setEscuela(Collection<Escuela> escuela) {
	this.escuela = escuela;
}
 
}
