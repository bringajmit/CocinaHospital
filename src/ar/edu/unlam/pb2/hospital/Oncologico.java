package ar.edu.unlam.pb2.hospital;

public class Oncologico extends Paciente {

	public Oncologico(String nombre, Integer dni) {
		super(nombre, dni);
	}

	@Override
	public boolean alimentar(Plato plato) {
		if(plato.getTipo()!=Coccion.SIN_COCION) {
			return true;
		}
		return false;
	}

	@Override
	public boolean aplicarInsulina() {
		// TODO Auto-generated method stub
		return false;
	}

}
