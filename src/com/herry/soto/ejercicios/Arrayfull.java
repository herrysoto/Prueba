package com.herry.soto.ejercicios;

import java.util.Scanner;

public class Arrayfull {

	public static Scanner teclado =  new Scanner(System.in);
	public static int[] array = new int[5];
	/*public static void main(String[] args) {
	
		
//		Ingresar los valores del array
		Ingresarvaloresarray(array,teclado);
		
//		Suma de los arrays
		sumaarray(array);
		
//		Calculando el máximo
		int max = valorMaximo(array);
		System.out.println("El máximo(usando retornos es :)" + max);
		
//		Calculando el promedio (primera de las muchas formas que se pueden hacer)
		promedioArray(array);
		
	}*/

//	Calculando el promedio (primera de las muchas formas que se pueden hacer)
	public static void promedioArray(int[] array) {
		double promedio = 0;
		double resultado;
		for (int i = 0; i < array.length; i++) {
			promedio = promedio + array[i];
		}
		resultado = promedio/array.length;
		System.out.println("El promedio es : " + resultado);
	}

//	Calculando el máximo
	public static int valorMaximo(int[] array) {
		int max=0;
		for (int i = 0; i < array.length; i++) {
			if(max<array[i]){
				max = array[i];
			}
		}
		return max;
	}

//	Suma de los arrays
	public static void sumaarray(int[] array) {
		System.out.println("Suma");
		int acumulador = 0;
		for (int i = 0; i < array.length; i++) {
			acumulador = acumulador + array[i];
			System.out.println("+"+array[i]);
		}
		System.out.println("La suma es " + acumulador);
	}

//	Ingresar los valores del array
	public static void Ingresarvaloresarray(int[] parametroarray, Scanner teclado) {
		for (int i = 0; i < parametroarray.length; i++) {
			System.out.println("Ingrese el valor del array[" + i + "] :");
			parametroarray[i] = teclado.nextInt();
		}
	}

}
