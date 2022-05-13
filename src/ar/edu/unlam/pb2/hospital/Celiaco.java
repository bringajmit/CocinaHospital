package ar.edu.unlam.pb2.hospital;

public class Celiaco extends Paciente {
	
	private String alimentoProhibido1="Trigo";
	private String alimentoProhibido2="Cebada";
	private String alimentoProhibido3="Avena";
	private String alimentoProhibido4="Centeno";
			
	public Celiaco(String nombre, Integer dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean alimentar(Plato plato) {
		boolean permitido=true;
		for (Ingrediente ingrediente : plato.getIngredientes()) {
			if(ingrediente.getNombre().equals(alimentoProhibido1) || ingrediente.getNombre().equals(alimentoProhibido2) || ingrediente.getNombre().equals(alimentoProhibido3) ||ingrediente.getNombre().equals(alimentoProhibido4)) {
				permitido=false;
			}
		}
		return permitido;
	}

	@Override
	public boolean aplicarInsulina() {
		// TODO Auto-generated method stub
		return false;
	}

}
