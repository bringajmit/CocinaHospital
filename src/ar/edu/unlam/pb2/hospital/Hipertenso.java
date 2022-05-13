package ar.edu.unlam.pb2.hospital;

public class Hipertenso extends Paciente {

	public Hipertenso(String nombre, Integer dni) {
		super(nombre, dni);

	}

	@Override
	public boolean alimentar(Plato plato) {
		if(plato.aptoHipertenso()) {
			return true;
		}
			
		return false;
	}

	@Override
	public boolean aplicarInsulina() {
		return false;
	}

}
