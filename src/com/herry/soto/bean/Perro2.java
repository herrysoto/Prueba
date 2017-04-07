package com.herry.soto.bean;

public class Perro2 extends Perro{
	private double racion;

	public double getRacion() {
		return racion;
	}

	public void setRacion(double racion) {
		this.racion = racion;
	}
	
	@Override //sobreescribe al metodo padre(Perro)
	public void ImprimirPerro(){

//		System.out.print("nombre:"+this.getNombre());
//		System.out.print(" color:"+this.color); //esto hace posible el protected
//		System.out.println(" peso:"+this.getPeso());
		super.ImprimirPerro();//esto es otra manera de llamar al metodo del padre
		System.out.println(" racion:"+this.getRacion());
	}
}
