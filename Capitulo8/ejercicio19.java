/**Une y amplía los dos programas anteriores de tal forma que se permita convertir un número
entre cualquiera de las siguientes bases: decimal, binario, hexadecimal y octal.**/


import varios.Varios;

import java.util.Scanner;

public class ejercicio19{
  public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.print("Introduce numero para pasar a binario,hexadecimal y octal : ");
            int num1 = Integer.parseInt(s.nextLine());
            System.out.print("Decimal: " + num1 + "\n");
            System.out.printf("Binario: %.0f %n", varios.Varios.binario(num1));
            System.out.print("Hexadecimal: " + varios.Varios.hexadecimal(num1) + "\n");
			System.out.printf("Octal: %.0f %n", varios.Varios.octal(num1));
	   
	 }
}	 
