/***************************************
 * Autor: Leticia Hernández Reyes      *

 * Fecha de Creación: 03/04/2023       *
 * Fecha de Actualización: 03/04/2023  *
 * Descripción: Recibe un numero de    *
 * cuatro digitos y lo imprime normal  *
 * y al revés                          *
 ***************************************/
package ejercicios2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int numero,reves,cifra;
		
		System.out.println("Ingrese un número de cuatro dígitos: ");
		numero = num.nextInt();
		
		System.out.println("El numero digitado es: "+ numero);
		System.out.println("");
		
		reves = 0;
		
		while(numero > 0) {
			cifra = numero %10;
			reves = reves * 10 + cifra;
			numero = numero / 10;
		}
		System.out.println("El numero escrito al revés es: "+ reves);
		
	}

}
