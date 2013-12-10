package com.basico.org;

public class Variables {

	public static void main(String[] args) {
		int num1 = 5;
		String saludo = "Hola";
		
		System.out.println("El valor de num1 es: " + num1);
		System.out.println("el valor de saludo es: "+ saludo);
		
		int a = 15;
		int b = 10;
		
		System.out.printf("La suma entre %d y %d es: %d", a,b,(a+b));
		System.out.printf("\nLa resta entre %d y %d es: %d", a,b,(a-b));
		System.out.printf("\nLa multiplicacion entre %d y %d es: %d", a,b,(a*b));
		System.out.printf("\nLa division entera entre %d y %d es: %d", a,b,(a/b));
	}
}