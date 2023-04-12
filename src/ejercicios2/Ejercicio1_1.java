/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 05/04/2023       *
 * Fecha de modificación: 05/04/2023   *
 * Descripción: Uso de condicionales   *
 ***************************************/
package ejercicios2;

import java.util.Scanner;

public class Ejercicio1_1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		
		int numero1, numero2,division;
		System.out.println("Ingrese el primer numero: ");
		numero1 = num.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		numero2 = num.nextInt();
		
		if(numero2 == 0) {
			System.out.println("");
			System.out.println("ERROR!!!");
			System.out.println("");
			System.out.println("Recuerde que un numero dividido entre cero no es correcto. \nSi es cero entre un numero el resultado es cero.");
		}else {
			division = numero1/numero2;
			System.out.println("EL resultado de la división es: " + division);
		}
		

	}

}
