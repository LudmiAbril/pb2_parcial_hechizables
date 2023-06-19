package ar.edu.unlam.hechizos;

public class Agrandar extends Hechizo {

	public Agrandar(String nombre) {
		super(nombre);
	}

	@Override
	public void aplicarHechizo(Hechizable objeto) {
		objeto.serAgrandado();

	}


}
