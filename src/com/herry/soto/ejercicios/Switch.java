package com.herry.soto.ejercicios;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,numero1,numero2;
		double resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1.Se realiza la suma de dos n�meros");
		System.out.println("2.Se realiza la resta de dos n�meros");
		System.out.println("3.Se realiza la multiplicaci�n de dos n�meros");
		System.out.println("4.Se realiza la divisi�n de dos n�meros");
		System.out.println();
		System.out.println("Escoger la opci�n");
		opcion = teclado.nextInt();
		
		System.out.println("Ingresar el primer n�mero:");
		numero1 = teclado.nextInt();
		
		System.out.println("Ingresar el segundo n�mero:");
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
			System.out.println("Usted escogio la multiplicaci�n y el resultado es: " + resultado);
			break;
		case 4:
			if(numero1==0){
				System.out.println("No puede realizar la suma ya que el denominador es cero");
			}else{
				resultado = numero1/numero2;
				System.out.println("Usted escogio la divisi�n y el resultado es: " + resultado);
			}
			break;

		default:
			System.out.println("Erro en opci�n");
			break;
		}
	}

}
