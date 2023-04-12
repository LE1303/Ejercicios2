/***************************************
 * Autor: Leticia Hernández Reyes      *

 * Fecha de Creación: 03/04/2023       *
 * Fecha de Actualización: 03/04/2023  *
 * Descripción: Dado dos catetos       *
 * calcula la hipotenusa de un         *
 * triangulo rectángulo                *
 ***************************************/


package ejercicios2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner cat = new Scanner(System.in);
		float cateto1,cateto2,cuadradoC1,cuadradoC2;
		float hipotenusa;
		
		System.out.println("Ingrese el valor del primer cateto: ");
		cateto1 = cat.nextInt();
		System.out.println("Ingrese el valor del segundo cateto: ");
		cateto2 = cat.nextInt();
		
		cuadradoC1 = cateto1*cateto1;
		cuadradoC2 = (float)Math.pow(cateto2, 2);
		hipotenusa = (float)Math.sqrt(cuadradoC1+cuadradoC2);
		
		System.out.println("La longitud de la hipotenusa es: " + hipotenusa);

	}

}
