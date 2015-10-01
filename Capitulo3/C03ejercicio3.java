/**Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
*debe ser introducida por teclado.
*/

import java.util.Scanner;
public class C03ejercicio3 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce tus peseta numero: ");
			int peseta = Integer.parseInt(s.nextLine());
																	//double para  castear la salida
			System.out.printf(" el resultado de la conversion es: %.2f" , (double)(peseta / 166.386));
	
			}
}
