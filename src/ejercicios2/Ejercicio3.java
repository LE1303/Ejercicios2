/***************************************
 * Autor: Leticia Hernández Reyes      *

 * Fecha de Creación: 03/04/2023       *
 * Fecha de Actualización: 03/04/2023  *
 * Descripción: Resuelve la ecuacion   *
 *     Raíz cuadrada de (x+y*z)⁵       *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		float x,y,z;
		float resultado;
		
		System.out.println("Ingrese el valor de x: ");
		x = var.nextFloat();
		
		System.out.println("Ingrese el valor de y: ");
		y = var.nextFloat();
		
		System.out.println("Ingrese el valor de z: ");
		z = var.nextFloat();
		
		resultado = (float)Math.pow(x+y*z,5);
		resultado = (float)Math.sqrt(resultado);
		
		System.out.println("El resultado de la operacion es: " + resultado);
	}

}
