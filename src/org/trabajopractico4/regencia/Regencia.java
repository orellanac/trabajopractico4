package org.trabajopractico4.regencia;

import java.util.*;


import javax.persistence.*;

import org.trabajopractico4.escuela.*;

public class Regencia {
 private String nombre_regencia;

 public String getNombre_regencia() {
	return nombre_regencia;
}

public void setNombre_regencia(String nombre_regencia) {
	this.nombre_regencia = nombre_regencia;
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
