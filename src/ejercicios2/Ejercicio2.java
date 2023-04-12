/***************************************
 * Autor: Leticia Hernández Reyes      *

 * Fecha de Creación: 03/04/2023       *
 * Fecha de Actualización: 03/04/2023  *
 * Descripción: Resuelve la ecuacion   *
 *               x+y/a*b               *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner ecu = new Scanner(System.in);
		int x,y,a,b;
		float ecuacion;
		System.out.println("Ingrese el valor de x: ");
		x = ecu.nextInt();
		System.out.println("Ingrese el valor de y: ");
		y = ecu.nextInt();
		System.out.println("Ingrese el valor de a: ");
		a = ecu.nextInt();
		System.out.println("Ingrese el valor de b: ");
		b = ecu.nextInt();
		
		//Fórmula
		ecuacion = x + y / a * b;
		
		System.out.println("");
		System.out.println("El resultado de la ecuación es: " + ecuacion);

	}

}
