/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 07/04/2023       *
 * Fecha de modificación: 07/04/2023   *
 * Descripción: Verifica si W esta     *
 * dentro del intervalo X y Y          *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio8_8 {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
        double x, y, w;
        
        System.out.print("Introduzca el valor de x: ");
        x = valor.nextDouble();
        System.out.print("Introduzca el valor de y: ");
        y = valor.nextDouble();
        System.out.print("Introduzca el valor de w: ");
        w = valor.nextDouble();
        
        System.out.println("");

        if (w >= x && w <= y) {
            System.out.println(w + " está dentro del intervalo [" + x + ", " + y + "]");
        } else {
            System.out.println(w + " está fuera del intervalo [" + x + ", " + y + "]");
        }

	}

}
