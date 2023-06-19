package ar.edu.unlam.hechizos;

public class Animal implements Hechizable {
	private String estado;

	@Override
	public void serDesarmado() {
		this.estado= "Me desarmaron";
		
	}

	@Override
	public void serAgrandado() {
		this.estado = "Ahora soy más grande";
		
	}

	@Override
	public String getEstado() {
		return this.estado;
	}

}
