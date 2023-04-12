/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 05/04/2023       *
 * Fecha de modificación: 05/04/2023   *
 * Descripcion: Pregunta si tiene      *
 * mas de 16 años para tributar        *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio2_2 {

	public static void main(String[] args) {
		Scanner ed = new Scanner(System.in);
		int edad, ingresos;
		System.out.println("Ingrese su edad: ");
		edad = ed.nextInt();
		System.out.println("Ingrese el ingreso: ");
		ingresos = ed.nextInt();
		
		if(edad > 16 && ingresos >=500) {
			System.out.println("Tiene derecho a tributar...");
		}else {
			System.out.println("Lo siento... No tiene derecho a tributar...");
		}

	}

}
