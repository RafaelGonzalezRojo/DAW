/**Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
positivo o negativo. Se permiten números de hasta 5 dígitos.*/


import java.util.Scanner;

public class C04ejercicio19 {
	
	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			System.out.print("Introduce primer numero : ");
				
			int num = Integer.parseInt(s.nextLine());
			int digito = 0;
			
			if((num <= 9) && ( num >= -9)){
			
			digito = 1;	
				
			}	
			
			
			if(( num <= 99)&&( num > 9) || (num >= -99)&&(num < -9)){
				
				digito = 2;
		
			}
			
			if(( num <= 999)&&( num > 99) || (num >= -999)&&(num < -99)){
				
		        digito = 3;
			}
			
			
			if(( num <= 9999)&&( num > 999) || (num >= -9999)&&(num < -999)){
				
				digito = 4;
			}
			
			
			if(( num <= 99999)&&(num > 9999)|| (num >= -99999)&&(num < -9999)){
				
				digito = 5;
			}
			
			System.out.print("el numero de digitos es:  " + digito + "\n");
					
			
	
			
			
	}
}

