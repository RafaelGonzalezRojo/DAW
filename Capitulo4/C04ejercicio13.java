
/**Escribe un programa que ordene tres números enteros introducidos por teclado.*/




import java.util.Scanner;

public class C04ejercicio13 {
	
	public static void main(String[] args) {
			
			System.out.print(" Inserte unos numeros para ordenar\n ");	
			
			Scanner s = new Scanner(System.in);
			System.out.print("inserte el primer numero \n");
			int num1 = Integer.parseInt(s.nextLine());
			System.out.print("inserte el segundo numero \n");
			int num2 = Integer.parseInt(s.nextLine());
			System.out.print("inserte el tercer numero \n");
			int num3 = Integer.parseInt(s.nextLine());
			
			
			if((num1 == num2) && (num2 == num3) && (num1 == num3)){
				
				System.out.print("los tres numeros son iguales \n");
				
				
			}	
			
			
			
			if (( num1 > num2) && (num1 > num3)) {
				
				System.out.print("el primer numero " + num1 + "\n");
				
				if(num2 > num3){
					
					System.out.print("el segundo numero " + num2 + "\n");
					
					System.out.print("el tercer numero " + num3 + "\n");
					
				}else{
				
					
					System.out.print("el segundo numero " + num3 + "\n");
					
					System.out.print("el tercer numero " + num2 + "\n");	
					
				}		
				
			}
				
			if (( num2 > num1) && (num2 > num3)) {
				
				System.out.print("el primer numero " + num2 + "\n");
				
				if(num1 > num3){
					
					System.out.print("el segundo numero " + num1 + "\n");
					
					System.out.print("el tercer numero " + num3 + "\n");
					
				}else{
				
				
					System.out.print("el segundo numero " + num3 + "\n");
					
					System.out.print("el tercer numero " + num1 + "\n");	
					
				}		
				
				
				
			}	
			if (( num3 > num2) && (num3 > num1)) {
				
				System.out.print("el primer numero " + num3 + "\n");
				
				if(num2 > num1){
						
					System.out.print("el segundo numero " + num2 + "\n");
					
					System.out.print("el tercer numero " + num1 + "\n");
					
				}else{
				
				
					System.out.print("el segundo numero " + num1 + "\n");
					
					System.out.print("el tercer numero " + num2 + "\n");	
					
				}		
				
			}	
				
			
			
		}
}			
