/**Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.*/



import java.util.Scanner;

public class C05ejercicio9 {
	
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce numero : ");
			
			long num = Long.parseLong(s.nextLine());	
			long cont = 0;
			while(num != 0){
					
						num = num / 10;
							
						cont++;	
							
					}			
			System.out.print("el numero tiene: " + cont + " digitos");
	}
}
