package org.trabajopractico4.profesor;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.trabajopractico4.persona.*;

@Entity
public class Profesor extends Persona{
	 @Column(length=11) @Required
	private String nombre_profe;

	public String get_nombre_profe() {
		return nombre_profe;
	}

	public void setnombre_profe(String nombre_profe) {
		this.nombre_profe = nombre_profe;
	}
}
