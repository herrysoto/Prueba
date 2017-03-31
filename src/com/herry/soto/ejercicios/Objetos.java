package com.herry.soto.ejercicios;

import com.herry.soto.bean.Perro;

public class Objetos {

	public static void main(String[] args) {
		Perro perro1 = new Perro();
		perro1.setNombre("betobhen");
		perro1.setColor("Blanco");
		perro1.setPeso(2.50);
		perro1.ImprimirPerro();
		
		Perro perro2 = new Perro();
		perro2.setNombre("bandido");
		perro2.setColor("marron");
		perro2.setPeso(65);
		perro2.ImprimirPerro();
		
//		Forma A
//		Imprimirperros(perro1);
//		Imprimirperros(perro2);

	}
	
	
//	Forma A
//	private static void Imprimirperros(Perro perro){
//		System.out.println();
//		System.out.println("nombre:"+ perro.getNombre());
//		System.out.println("color:"+ perro.getColor());
//		System.out.println("peso:"+perro.getPeso());
//	}

}
