package ar.edu.unlam.pb2.hospital;

import java.util.ArrayList;
import java.util.List;

public class Plato {
	
	private String nombre;
	private Coccion tipo;
	private List<Ingrediente> ingredientes;

	public Plato(String nombre, Coccion tipo) {
		this.nombre=nombre;
		this.tipo=tipo;
		ingredientes=new ArrayList<Ingrediente>();
	}

	public void agregarIngrediente(Ingrediente ingrediente) {
		
		ingredientes.add(ingrediente);
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Coccion getTipo() {
		return tipo;
	}

	public void setTipo(Coccion tipo) {
		this.tipo = tipo;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public Double calcularCantidadDeSal() {
		Double cantidad=0.0;
		for (Ingrediente ingrediente : ingredientes) {
			cantidad+=ingrediente.getCantidadDeSal();
		}
		return cantidad;
	}
	
	public Double calcularCantidadDeAzucar() {
		Double cantidad=0.0;
		for (Ingrediente ingrediente : ingredientes) {
			cantidad+=ingrediente.getCantidadDeAzucar();
		}
		return cantidad;
	}

	public boolean aptoHipertenso() {
		Double cantidadPermitida=0.0;
		for (Ingrediente ingrediente : ingredientes) {
			if(calcularCantidadDeSal()<=cantidadPermitida) {
				return true;
			}
		}
		return false;
	}
	
	public boolean aptoDiabetico() {
		Double cantidadPermitida=0.0;
		for (Ingrediente ingrediente : ingredientes) {
			if(calcularCantidadDeAzucar()<=cantidadPermitida) {
				return true;
			}
		}
		return false;
	}
	
	

}
