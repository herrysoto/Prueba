package com.herry.soto.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1,numero2,numero3;
		double resta,suma;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		numero1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero:");
		numero2 = teclado.nextInt();
		System.out.println("Ingrese el tercer numero:");
		numero3 = teclado.nextInt();
		
		System.out.println("Los numero ingresados son: " + numero1 +","+numero2+","+numero3);
		
		if(numero1>numero2){
			resta = numero1-numero2;
			System.out.println("La resta fue : "+resta);
		}else{
			suma = numero1+numero2+numero3;
			System.out.println("La suma fue : "+suma);
		}
		
	}

}
