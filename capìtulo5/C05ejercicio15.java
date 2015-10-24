/**Escribe un programa que dados dos números, uno real (base) y un entero positivo
(exponente), saque por pantalla todas las potencias con base el numero dado y exponentes
entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación.
Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .**/

import java.util.Scanner;

public class C05ejercicio15 {
	
	public static void main(String[] args) {
		
		
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce base : ");
							
						int num = Integer.parseInt(s.nextLine());
						
						int resultado=0;
						
						System.out.print("Introduce exponente : ");
							
						int exponente = Integer.parseInt(s.nextLine());
						int sumresultado=0;
						int potencia=1;
						int exponentemuestra=0;
						
					for(int cont= 0;cont < exponente; cont++){
							
							   potencia = num * potencia ;
							   resultado = potencia; 
								exponentemuestra++;
								System.out.print("\t" + num + " ^ " + exponentemuestra + " =" + resultado +"\n ");
							   
							
							
					}	
				
						
			
	}
}
