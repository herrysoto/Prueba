package com.herry.soto.bean;

import java.util.Scanner;

import com.herry.soto.ejercicios.Arrayfull;

//Esta clase servirá para llamar a los metodos de la clase Arrayfull
public class Resultados extends Arrayfull{

	public static void main(String[] args){

//		Ingresarvaloresarray(int[] array, Scanner teclado);

		Ingresarvaloresarray(array,teclado);
		sumaarray(array);
		valorMaximo(array);
		promedioArray(array);
	}

}
