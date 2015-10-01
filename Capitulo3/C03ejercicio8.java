/**Escribe un programa que calcule el salario semanal de un empleado en base a las horas
*trabajadas, a razón de 12 euros la hora.
*/


import java.util.Scanner;
public class C03ejercicio8 {
	
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce dias trabajado (1 a 7) : ");
			int dias = Integer.parseInt(s.nextLine());
			
			System.out.print("Introduce horas: ");
			double horas = Double.parseDouble(s.nextLine());
			
																	//double para  castear la salida
			System.out.printf(" su salario es igual a : %.2f  \n" , (double)(horas * dias * 12));
			
			}
}
