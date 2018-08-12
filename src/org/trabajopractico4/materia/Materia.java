  package org.trabajopractico4.materia;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.trabajopractico4.escuela.*;

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
 @OneToMany(mappedBy="materia")
   private Collection <Escuela> escuela;

   public Collection<Escuela> getEscuela() {
	return escuela;
   }

   public void setEscuela(Collection<Escuela> escuela) {
	  this.escuela = escuela; 
      }
 
 }

