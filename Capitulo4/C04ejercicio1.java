/**Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
*toca a primera hora ese día.
*/

import java.util.Scanner;

public class C04ejercicio1 {
	
	public static void main(String[] args) {
			

			Scanner s = new Scanner(System.in);
			System.out.print("Introduce un dia : ");
			
			String opcion = (s.nextLine()).toLowerCase();
			

			switch (opcion) {
			case "lunes":
			System.out.print("\n  primera hora tienes FOL ");
			break;
			
			case "martes":
			System.out.print("\n a primera hora tienes BASE DE DATOS");
			break;
			
			case "miercoles":
			System.out.print("\n a primera hora tienes PROGRAMACION");
			break;
			
			case "jueves":
			System.out.print("\n a primera hora tienes SIM");
			break;
			
			case "viernes":
			System.out.print("\n a primera hora tienes LENGUAJE DE MARCAS");
			break;
			
			default:
			System.out.print("\nLo siento, la opción elegida no es correcta.");
			}
	}
}
			
		
		
		
			
			
			
			
