/**Realiza un programa que diga si un número entero positivo introducido por teclado es
capicúa. Se permiten números de hasta 5 cifras.*/
import java.util.Scanner;

public class C04ejercicio20 {
	
	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			System.out.print("Introduce primer numero : ");
				
			int num = Integer.parseInt(s.nextLine());
			int digito = 0;
			int primero = 0;
			int segundo = 0;
			int ultimo = 0;
			int penultimo = 0;
			
					if(num <= 9) {
			
			System.out.print("es capicua ");
				
			}	
			
			
			if(( num <= 99) && ( num > 9)){
				
				 primero =	num / 10;
				 ultimo =	num % 10;
				 
				 if(primero == ultimo){
					 
					System.out.print("es capicua "); 
					 
				}else{
					
					System.out.print("No es capicua "); 
					
				}		 
				
		
			}		
			
			
			
				if(( num <= 999) && ( num > 99)){
				
				 primero =	num / 100;
				 ultimo =	num % 10;
				 
				 if(primero == ultimo){
					 
					System.out.print("es capicua "); 
					 
				}else{
					
					System.out.print("No es capicua "); 
					
				}		 
				
		
			}		
			
			
			
			
				if(( num <= 9999) && ( num > 999)){
				
				 primero =	num / 1000;
				 segundo =  (num / 100) % 10 ;
				 ultimo =	num % 10;
				 penultimo = (num % 100) / 10;
			
				
				 if((primero == ultimo) && (segundo == penultimo)){
					 
					System.out.print("es capicua "); 
					 
				}else{
					
					System.out.print("No es capicua "); 
					
				}		 
				
		
			}
			
			
			
				if(( num <= 99999) && ( num > 9999)){
				
				 primero =	num / 10000;
				 ultimo =	num % 10;
				 segundo =  (num / 1000) % 10 ;
				 penultimo = (num % 100) / 10;
				 
					
				 
				 if((primero == ultimo) && (segundo == penultimo)){
					 
					System.out.print("es capicua "); 
					 
				}else{
					
					System.out.print("No es capicua "); 
					
				}		 
				
		
			}		
			
			
			
			
			
			
			
	}
	
	
}	
