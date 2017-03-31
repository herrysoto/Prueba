package com.herry.soto.ejercicios;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Función para sumar varios números");
		int contador=0,nuevoNumero=0;
		while (nuevoNumero>=0) {
			System.out.println("Ingrese el numero que desea sumar o ingrese -1 para salir : ");
			nuevoNumero = teclado.nextInt();
			if(nuevoNumero>0){
			contador = contador + nuevoNumero;
			}
		}
		System.out.println("Total : " + contador);
	}

}
