package ar.edu.unlam.pb2.hospital;

public class Ingrediente {

	private String nombre;
	private Double cantidadDeSal;
	private Double cantidadDeAzucar;

	public Ingrediente(String nombre, Double cantidadDeSal, Double cantidadDeAzucar) {
		this.nombre=nombre;
		this.cantidadDeSal=cantidadDeSal;
		this.cantidadDeAzucar=cantidadDeAzucar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getCantidadDeSal() {
		return cantidadDeSal;
	}

	public void setCantidadDeSal(Double cantidadDeSal) {
		this.cantidadDeSal = cantidadDeSal;
	}

	public Double getCantidadDeAzucar() {
		return cantidadDeAzucar;
	}

	public void setCantidadDeAzucar(Double cantidadDeAzucar) {
		this.cantidadDeAzucar = cantidadDeAzucar;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingrediente other = (Ingrediente) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
