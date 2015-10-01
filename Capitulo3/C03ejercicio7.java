/**Escribe un programa que calcule el total de una factura a partir de la base imponible.
*/

import java.util.Scanner;
public class C03ejercicio7 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce tu importe : ");
			double importe = Double.parseDouble(s.nextLine());
			
			System.out.print("Introduce tu impuesto: ");
			double impuesto = Double.parseDouble(s.nextLine());
			
																	//double para  castear la salida
			System.out.printf(" con iva es: %.2f  \n" , (double)(importe * impuesto / 100));
			System.out.printf(" tu total asciende a : %.2f" , (double)(importe * impuesto / 100 + (importe)));
			}
}
