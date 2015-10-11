/**Realiza un programa que diga si un número introducido por teclado es par y/o divisible
entre 5.*/



import java.util.Scanner;

public class C04ejercicio14 {
	
	public static void main(String[] args) {
			
			System.out.print(" Inserte unos numeros para ordenar\n ");	
			
			Scanner s = new Scanner(System.in);
			System.out.print("inserte el numero \n");
			int num1 = Integer.parseInt(s.nextLine());
			
			
			if(num1 % 2==0){
				
				
				System.out.print("divisible por 2 \n");
			
			}
			
			if(num1 % 5==0){
				
				System.out.print("divisible por 5 \n");
			
			}	
			
			
			if(num1 % 5 !=0){
			
			System.out.print("no es divisible por 5 \n");
			
			}
			
			
				if(num1 % 2 !=0){
			
			System.out.print("no es divisible por 2 \n");
			
			}
			
			
	}		
}	
