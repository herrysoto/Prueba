package com.herry.soto.ejercicios;

import java.util.Iterator;

public class ForArray {

	public static void main(String[] args) {
		int[] array = {0,5,1,2,4,7,8,9,6,3};
		for(int i=0;i < array.length;i++){
			System.out.println(array[i]+",");
		}
		System.out.println("Incrementar por 1 cada número");
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+",");
		}
		
		
		//otra manera de correr el for(mejorado)
		String[] social = {"twiter","facebook","messenger"};
		
		for (String s : social) {
			System.out.println(s);
			
		}
	}

}