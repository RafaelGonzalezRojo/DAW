/**Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
y cuántos son negativos.**/


import java.util.Scanner;

public class C05ejercicio13 {
	
	public static void main(String[] args) {
		
		int num =0;
		int pos =0;
		int neg =0;				
					for(int cont= 0;cont <10; cont++){
							
							  
								
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						num = Integer.parseInt(s.nextLine());
						
						if (num>=0){
							pos++;
						}else{
								
							neg++;	
							
						}	
							
								
							
					}//termina de introducir  y valorar los numeros
					
					System.out.print("hay  " + pos + " positivos\n");
					System.out.print("hay  " + neg + " negativos");		
			
	}

}

