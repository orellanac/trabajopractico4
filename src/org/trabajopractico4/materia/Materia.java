  package org.trabajopractico4.materia;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Materia {
 @Column (length=11)@Required
 private String nombre_materia;
 
 public void set_nombre_materia (String nombre_materia) {
   this.nombre_materia=nombre_materia;
    }
 
 public String get_nombre_materia ()
 {
	 return nombre_materia;
 }
 }

