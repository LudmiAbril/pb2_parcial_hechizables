package ar.edu.unlam.hechizos;

import java.util.Objects;

public abstract class Hechizo {
	protected String nombre;
	
	public Hechizo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public abstract void aplicarHechizo(Hechizable objeto);

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hechizo other = (Hechizo) obj;
		return Objects.equals(nombre, other.nombre);
	}


}
