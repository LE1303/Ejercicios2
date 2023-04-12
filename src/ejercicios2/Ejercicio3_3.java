/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 05/04/2023       *
 * Fecha de modificación: 05/04/2023   *
 * Descripción: Pregunta si un numero  *
 * Es  capicúa o no.                   *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio3_3 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Introduce un número de cuatro dígitos: ");
        int numero = num.nextInt();
        
        if (numero < 1000 || numero > 9999) {
            System.out.println("El número introducido no es de cuatro dígitos.");
        } else {
            int d1 = numero / 1000;
            int d2 = (numero % 1000) / 100;
            int d3 = (numero % 100) / 10;
            int d4 = numero % 10;
            if (d1 == d4 && d2 == d3) {
                System.out.println("El número " + numero + " es capicúa.");
            } else {
                System.out.println("El número " + numero + " no es capicúa.");
            }
        }
		
	}
}
