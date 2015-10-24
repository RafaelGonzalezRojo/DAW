/**Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
potencia.**/



import java.util.Scanner;

public class C05ejercicio14 {
	
	public static void main(String[] args) {
		
		
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce base : ");
							
						int num = Integer.parseInt(s.nextLine());
						
						int resultado=0;
						
						System.out.print("Introduce exponente : ");
							
						int exponente = Integer.parseInt(s.nextLine());
						int sumresultado=0;
						int potencia=1;
					for(int cont= 0;cont < exponente; cont++){
							
							   potencia = num * potencia ;
								
							   
							
							
					}	
					
					System.out.print(" " + potencia + " ");
						
			
	}
}
