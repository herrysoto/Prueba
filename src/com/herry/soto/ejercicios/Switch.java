package com.herry.soto.ejercicios;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,numero1,numero2;
		double resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1.Se realiza la suma de dos números");
		System.out.println("2.Se realiza la resta de dos números");
		System.out.println("3.Se realiza la multiplicación de dos números");
		System.out.println("4.Se realiza la división de dos números");
		System.out.println();
		System.out.println("Escoger la opción");
		opcion = teclado.nextInt();
		
		System.out.println("Ingresar el primer número:");
		numero1 = teclado.nextInt();
		
		System.out.println("Ingresar el segundo número:");
		numero2 = teclado.nextInt();
		
		/*if(opcion==1){
			resultado = numero1+numero2;
			System.out.println("Usted escogio la suma y el resultado es: " + resultado);
		}else{
			if(numero1>numero2){
				resultado = numero1-numero2;
				System.out.println("Usted escogio la resta y el resultado es: " + resultado);
			}else{
				System.out.println("No puede ser el primer numero menor que el segundo");
			}
			
		}*/
		switch (opcion) {
		case 1:
			resultado = numero1+numero2;
			System.out.println("Usted escogio la suma y el resultado es: " + resultado);
			break;
		case 2:
			if(numero1>numero2){
				resultado = numero1-numero2;
				System.out.println("Usted escogio la resta y el resultado es: " + resultado);
			}else{
				System.out.println("No puede ser el primer numero menor que el segundo");
			}
			break;
		case 3:
			resultado = numero1*numero2;
			System.out.println("Usted escogio la multiplicación y el resultado es: " + resultado);
			break;
		case 4:
			if(numero1==0){
				System.out.println("No puede realizar la suma ya que el denominador es cero");
			}else{
				resultado = numero1/numero2;
				System.out.println("Usted escogio la división y el resultado es: " + resultado);
			}
			break;

		default:
			System.out.println("Erro en opción");
			break;
		}
	}

}
