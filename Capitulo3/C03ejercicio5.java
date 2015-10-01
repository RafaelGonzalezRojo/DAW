/**Escribe un programa que calcule el área de un rectángulo.
*/

import java.util.Scanner;
public class C03ejercicio5 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Programa que te calcula el area de rectangulo \n");
			System.out.print("Introduce tu base: ");
			double base = Double.parseDouble(s.nextLine());
			System.out.print("Introduce tu altura: ");
			double altura = Double.parseDouble(s.nextLine());
			System.out.print(" el resultado es: " + (base * altura));
	
			}
}
