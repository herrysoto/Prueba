package com.herry.soto.herencia;

import com.herry.soto.bean.Perro2;

public class DarComer {

	public static void main(String[] args) {
		Perro2[] perros = ingresarPerros();
		mostrarPerro(perros);
		darlesDeComer(perros);
		System.out.println("Después de darles de comer");
		mostrarPerro(perros);
	}

	private static void darlesDeComer(Perro2[] perros) {
		for (int i = 0; i < perros.length; i++) {
			double pesoAntesdeComer = perros[i].getPeso();
			perros[i].setPeso(pesoAntesdeComer+perros[i].getRacion());
		}
	}

	private static void mostrarPerro(Perro2[] perros) {
		for (int i = 0; i < perros.length; i++) {
			perros[i].ImprimirPerro();
		}
		
	}

	private static Perro2[] ingresarPerros() {
		Perro2[] perros =  new Perro2[4];	
		String[] nombres = {"Gorky","Bandido","Oso","Teresa"};
		String[] colores = {"Caramelo","Marrón","Negro","Blanco"};
		double[] pesos = {2.5,40,15,7.6};
		double[] raciones = {0.5,0.9,0.7,0.3};
		
		for (int i = 0; i < perros.length; i++) {
			Perro2 perro = new Perro2();
			perro.setNombre(nombres[i]);
			perro.setColor(colores[i]);
			perro.setPeso(pesos[i]);
			perro.setRacion(raciones[i]);
			perros[i]=perro;
		}
		
		return perros;
	}

}
