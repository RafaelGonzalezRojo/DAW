/**Realiza un programa que √
calcule el tiempo que tardará en caer un objeto desde una altura
h. Aplica la fórmula t =
2h
g
siendo g = 9.81m/s 2
*/
import java.util.Scanner;
import java.lang.Math;
public class C04ejercicio6 {
	
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce altura : ");
			double altura = Double.parseDouble(s.nextLine());
	
		double total = Math.sqrt(altura * 2 / 9.81 );
		
		System.out.printf("\n el resultado de la ecuacion es : %.2f  \n" , (double)(total));
		
		}
						
	}					
						
