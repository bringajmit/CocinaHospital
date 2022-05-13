package ar.edu.unlam.pb2.hospital;

public class Diabetico extends Paciente {

	private TipoDiabetes tipo;

	public Diabetico(String nombre, Integer dni, TipoDiabetes tipo) {
		super(nombre, dni);
		this.tipo=tipo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean alimentar(Plato plato) {
		if(plato.aptoDiabetico()) {
			return true;
		}
		return false;
	}

	public TipoDiabetes getTipo() {
		return tipo;
	}

	public void setTipo(TipoDiabetes tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean aplicarInsulina() {

		if(getTipo()==TipoDiabetes.TIPO_2) {
			return true;
		}
		return false;
	}

}
