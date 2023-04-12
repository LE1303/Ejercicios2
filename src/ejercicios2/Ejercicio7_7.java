/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 07/04/2023       *
 * Fecha de modificación: 07/04/2023   *
 * Decripción: Comprueba si un número  *
 * es feliz, infeliz o creciente       *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio7_7 {

	public static void main(String[] args) {
		Scanner dig = new Scanner(System.in);
        int numero, a, b, c, d;
        String tipo = "infeliz";

        System.out.print("Introduzca un número de cuatro dígitos: ");
        numero = dig.nextInt();
        

        a = numero / 1000;
        b = (numero / 100) % 10;
        c = (numero / 10) % 10;
        d = numero % 10;
        
        if (a * 10 + b > c * 10 + d) {
            tipo = "feliz";
            if (a > b && b > c && c > d) {
                tipo = "muy feliz";
            }
        } else {
            if (a < b && b < c && c < d) {
                tipo = "creciente";
            }
        }
        System.out.println("");
        System.out.println("El número " + numero + " es " + tipo);

	}

}
