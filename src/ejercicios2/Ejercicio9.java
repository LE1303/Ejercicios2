/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 04/04/2023       *
 * Fecha de modificación: 04/04/2023   *
 * Descripcion: Calcula las x usando   *
 * La formula general.                 *
 ***************************************/


package ejercicios2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner ecu = new Scanner(System.in);

        System.out.println("Ingrese el coeficiente A:");
        double coefA = ecu.nextDouble();

        System.out.println("Ingrese el coeficiente B:");
        double coefB = ecu.nextDouble();

        System.out.println("Ingrese el coeficiente C:");
        double coefC = ecu.nextDouble();

        // Calcular el discriminante
        double discriminante = coefB * coefB - 4 * coefA * coefC;

        if (discriminante > 0) {
            // Dos soluciones reales distintas
            double x1 = (-coefB + Math.sqrt(discriminante)) / (2 * coefA);
            double x2 = (-coefB - Math.sqrt(discriminante)) / (2 * coefA);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real única
            double x = -coefB / (2 * coefA);
            System.out.println("La solución es x = " + x);
        } else {
            // No hay soluciones reales
            System.out.println("La ecuación no tiene soluciones reales.");
        }

	}

}
