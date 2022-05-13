package ar.edu.unlam.pb2.hospital;

public abstract class Paciente {
	
	private String nombre;
	private Integer dni;

	public Paciente(String nombre, Integer dni) {
		this.nombre=nombre;
		this.dni=dni;
	}
	
	public abstract boolean alimentar(Plato plato);
	
	public abstract boolean aplicarInsulina();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	
}
