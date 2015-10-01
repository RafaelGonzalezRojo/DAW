/**Realiza un programa que pida dos números y que luego muestre el resultado de su
*multiplicación.
*/
import java.util.Scanner;
public class C03ejercicio1 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce tu primer numero: ");
			double num1 = Double.parseDouble(s.nextLine());
			System.out.print("Introduce tu segundo numero: ");
			double num2 = Double.parseDouble(s.nextLine());
			System.out.print(" el resultado es: " + (num1 * num2));
	
			}
}
