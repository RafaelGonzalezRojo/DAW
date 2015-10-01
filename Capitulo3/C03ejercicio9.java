/**Escribe un programa que calcule el volumen de un cono según la fórmula V = 13 πr 2 h
*/

import java.lang.Math;
import java.util.Scanner;
public class C03ejercicio9 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce radio : ");
			double radio = Double.parseDouble(s.nextLine());
			
			System.out.print("Introduce altura: ");
			double altura = Double.parseDouble(s.nextLine());
			double volumen = 0.333333 * Math.PI * Math.pow(radio,2) * altura;
																	//double para  castear la salida
			System.out.printf(" el resultado del volumen es : %.2f  \n" , (double)(volumen));
			
			}
}
