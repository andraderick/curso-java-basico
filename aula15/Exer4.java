package com.erick.cursojava.aula15;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com uma letra:");
		String letra = scan.next();
		 
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("E") || 
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
				letra.equalsIgnoreCase("u")) {
			System.out.println("Vogal");
		} else {
			System.out.println(" consoante");
	}
				
		
	}

}
