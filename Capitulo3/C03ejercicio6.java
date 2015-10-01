/**Escribe un programa que calcule el área de un triangulo.
*/

import java.util.Scanner;
public class C03ejercicio6 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Programa que te calcula el area de triangulo \n");
			System.out.print("Introduce tu base: ");
			double base = Double.parseDouble(s.nextLine());
			System.out.print("Introduce tu altura: ");
			double altura = Double.parseDouble(s.nextLine());
			System.out.print(" el resultado es: " + (base * altura)/2);
	
			}
}
