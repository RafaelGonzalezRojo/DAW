/**Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe
*ser introducida por teclado.
*/
import java.util.Scanner;
public class C03ejercicio2 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce tus euros numero: ");
			double euro = Double.parseDouble(s.nextLine());
																	//int para  castear la salida
			System.out.print(" el resultado de la conversion es: " + (int)(euro * 166.386));
	
			}
}
