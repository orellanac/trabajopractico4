
package org.trabajopractico4.alumno;

import java.util.*;

import javax.persistence.*;
import org.openxava.annotations.*;
import org.trabajopractico4.materia.*;
@Entity
public class Alumno {
	@Column (length=22)@Required
   private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column (length=22)@Required
   private String apellido;
   
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Column (length=22)@Required	
   private String direccion;
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Column (length=22)@Required	
   private String celular;
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@Column (length=22)@Required	
    private String email;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
@OneToMany(mappedBy="Materia")
private Collection <Materia> materia;

public Collection <Materia> getMateria() {
	return materia;
}
public void setMateria(Collection<Materia> materia) {
	this.materia = materia;
}

}
