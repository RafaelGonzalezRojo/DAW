/**Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
del día de la semana.*/


import java.util.Scanner;

public class C04ejercicio3 {
	
	public static void main(String[] args) {
			

			Scanner s = new Scanner(System.in);
			System.out.print("Introduce un dia : ");
			int dia = Integer.parseInt(s.nextLine());
			

			switch (dia) {
			case 1:
			System.out.print("\n  Lunes ");
			break;
			
			case 2:
			System.out.print("\n Martes ");
			break;
			
			case 3:
			System.out.print("\n Miercoles ");
			break;
			
			case 4:
			System.out.print("\n Jueves ");
			break;
			
			case 5:
			System.out.print("\n Viernes ");
			break;
			
			case 6:
			System.out.print("\n Sabado ");
			break;
			
			case 7:
			System.out.print("\n Domingo ");
			break;
			
			default:
			System.out.print("\nLo siento, la opción elegida no es correcta.");
			}
	}
}
