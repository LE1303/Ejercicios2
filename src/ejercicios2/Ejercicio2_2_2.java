/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 08/04/2023       *
 * Fecha de modificación: 08/04/2023   *
 * Descripcion: Pide un número y       *
 * verifica si es primo o no           *
 ***************************************/


package ejercicios2;

import java.util.Scanner;

public class Ejercicio2_2_2 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un número entero positivo: ");
		
        numero = n.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " no es un número primo");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(numero + " es un número primo");
            } else {
                System.out.println(numero + " no es un número primo");
            }
        }

	}

}
