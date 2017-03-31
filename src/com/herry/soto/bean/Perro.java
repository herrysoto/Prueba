package com.herry.soto.bean;

public class Perro {
	private String nombre;
	private String color;
	private double peso;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void ImprimirPerro(){
		System.out.println();
		System.out.println("nombre:"+this.getNombre());
		System.out.println("color:"+this.getColor());
		System.out.println("peso:"+this.getPeso());
	}
}
