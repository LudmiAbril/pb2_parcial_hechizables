package ar.edu.unlam.hechizos;

import java.util.HashMap;

public class LibroDeHechizos {
	private HashMap<String, Hechizo> hechizos = new HashMap<String, Hechizo>();

	public LibroDeHechizos() {
	}

	public void agregarHechizo(Hechizo hechizo) {
		hechizos.put(hechizo.getNombre(), hechizo);

	}

	public Hechizo buscar(String nombreHechizo) throws HechizoNoEncontradoException {
		if(hechizos.get(nombreHechizo) != null) {
			return hechizos.get(nombreHechizo);
		}
	 throw new HechizoNoEncontradoException();
	}

	public Integer getCantidadDeHechizos() {
		return this.hechizos.size();
	}

}
