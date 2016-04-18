

/**Escribe un programa que pase de binario a decimal.**/


import varios.Varios;

import java.util.Scanner;

public class ejercicio18{
  public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce binario para pasar a decimal : ");
            int num1 = Integer.parseInt(s.nextLine());
            System.out.print("" + varios.Varios.numdecimal(num1));
	  
	   
	 }
}	 
	
