/***************************************
 * Autor: Leticia Hernández Reyes      *
 * Fecha de creación: 08/04/2023       *
 * Fecha de modificación: 08/04/2023   *
 * Descripción: Indica el número de    *
 * segundos trasncurridos              *
 ***************************************/

package ejercicios2;

import java.util.Scanner;

public class Ejercicio9_9 {

	public static void main(String[] args) {
		Scanner hrs = new Scanner(System.in);
        int horas, minutos, segundos, segundosT;
        String amPm;
        
        
        System.out.println("Introduzca la hora (en formato de 12 horas): ");
        horas = hrs.nextInt();
        System.out.println("Introduzca los minutos: ");
        minutos = hrs.nextInt();
        System.out.println("Introduzca los segundos: ");
        segundos = hrs.nextInt();
        System.out.println("Introduzca AM o PM: ");
        amPm = hrs.next();
        
       
        if (amPm.equalsIgnoreCase("PM")) {  //Recordemos que equalsIgnoreCase sirve para aceptar Mayúsculas o minusculas
        	// se vió en clases
            horas += 12;
        }
        
        segundosT = horas * 3600 + minutos * 60 + segundos;
        
        System.out.println("");
       
        System.out.println("Han transcurrido " + segundosT + " segundos desde el inicio del día.");

	}

}
