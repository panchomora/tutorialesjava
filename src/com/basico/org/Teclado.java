package com.basico.org;

import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int a = Integer.parseInt(input);
		input = scanner.nextLine();
		int b = Integer.parseInt(input);
		System.out.println("La suma es: " + sumar(a, b));
	}
	
	public static int sumar(int a, int b) {
		return (a + b);
	}
}