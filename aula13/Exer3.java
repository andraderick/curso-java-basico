package com.erick.cursojava.aula13;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Informe a nota do primeiro bimestre:");
			double primeirobimestre = scan.nextDouble();
			
			System.out.println("Informe a nota do segundo bimeste:");
			double segundobimestre = scan.nextDouble();
			
			System.out.println("Informe a nota do terceiro bimestre:");
			double terceirobimestre = scan.nextDouble();
			
			System.out.println("Informe a nota do quarto bimestre:");
			double quartobimestre = scan.nextDouble();
			
			
			System.out.println("A sua média é de: ");
			double media = (primeirobimestre + segundobimestre + terceirobimestre + quartobimestre) / 4;
			System.out.println(media);
			
	}

}
