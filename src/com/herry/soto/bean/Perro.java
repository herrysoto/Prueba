package com.herry.soto.bean;

public class Perro {
	private String nombre;
	protected String color;//quiere decir que puede ser accedido solo por los hijos mas no por ninguna otra clase
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

		System.out.print("nombre:"+this.getNombre());
		System.out.print(" color:"+this.getColor());
		System.out.print(" peso:"+this.getPeso());
	}
}
