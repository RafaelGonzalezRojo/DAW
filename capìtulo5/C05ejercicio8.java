/**Muestra la tabla de multiplicar de un número introducido por teclado.*/


import java.util.Scanner;

public class C05ejercicio8 {
	
	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			System.out.print("Introduce numero : ");
				
			int num = Integer.parseInt(s.nextLine());	
			int resultado = 0;

			for(int cont= 0 ; cont <= 10; cont++ ){
					
				
					
					resultado = num * cont;
					System.out.print(" " +  resultado + "\n");
							
					}			
			
	}
}
