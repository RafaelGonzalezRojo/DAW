/**Escribe un programa que diga cuál es la primera cifra de un número entero introducido
por teclado. Se permiten números de hasta 5 cifras.*/


import java.util.Scanner;

public class C04ejercicio18 {
	
	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			System.out.print("Introduce primer numero : ");
				
			int num = Integer.parseInt(s.nextLine());
			int primero = 0;
			
			if(num <= 9){
			
			primero = num;	
				
			}	
			
			
			if(( num <= 99)&&( num > 9)){
				
		 primero =	num / 10;
			}
			
			if(( num <= 999)&&( num > 99)){
				
		 primero =	num / 100;
			}
			
			
			if(( num <= 9999)&&( num > 999)){
				
		 primero =	num / 1000;
			}
			
			
			if(( num <= 99999)&&(num > 9999)){
				
		 primero =	num / 10000;
			}
			
			System.out.print("el ultimo numero es:  " + primero + "\n");
					
			
	
			
			
	}
}
