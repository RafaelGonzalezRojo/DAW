/**Escribe un programa que sume, reste, multiplique y divida dos números introducidos por
*teclado.
*/

import java.util.Scanner;
public class C03ejercicio4 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce tu primer numero: ");
			double num1 = Double.parseDouble(s.nextLine());
			System.out.print("Introduce tu segundo numero: ");
			double num2 = Double.parseDouble(s.nextLine());
			//nota el salto de linea se pone despues del %.2f que es donde iria el valor para poder realizarlo la operacion despues de la coma
			System.out.printf(" el resultado de la suma: %.2f \n" , (num1 + num2));
			System.out.printf(" el resultado de la resta: %.2f \n" , (num1 - num2));
			System.out.printf(" el resultado de la division: %.2f \n" , (num1 / num2));
			System.out.printf(" el resultado de la multiplicacion: %.2f \n" , (num1 * num2));
	
			}
}
