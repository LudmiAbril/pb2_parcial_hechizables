package ar.edu.unlam.hechizos;

public class Expelliarmus extends Hechizo {

	public Expelliarmus(String nombre) {
		super(nombre);
	}

	@Override
	public void aplicarHechizo(Hechizable objeto) {
		objeto.serDesarmado();
	}


}
