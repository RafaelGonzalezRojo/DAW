/**Escribe un programa que diga si un número introducido por teclado es o no primo. Un
número primo es aquel que sólo es divisible entre él mismo y la unidad.*/



import java.util.Scanner;

public class C05ejercicio16 {
	
	public static void main(String[] args) {
		
		
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						int num = Integer.parseInt(s.nextLine());
						
						
						
						int cprimo=0;
						
					for(int cont= 2;cont <= num; cont++){
							
							   
							if((num % cont)==0){
							
							   cprimo++;	
								
							}	
							
							
							
					}	
				
						
					if(cprimo != 1){
						
						System.out.print("no es primo");
						
					}else{
						
						System.out.print("es primo");
					}		
			
	}
}
