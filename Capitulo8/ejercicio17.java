
/**Escribe un programa que pase de decimal a binar¡o.**/


import varios.Varios;

import java.util.Scanner;

public class ejercicio17{
  public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce numero para pasar a binario : ");
            int num1 = Integer.parseInt(s.nextLine());
            System.out.printf("Binario: %.0f %n", varios.Varios.binario(num1));
	  
	   
	 }
}	 
	  
