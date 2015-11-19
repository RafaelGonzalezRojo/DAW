
/**Realiza un programa que pida un número por teclado y que luego muestre ese número al
revés.**/


import java.util.Scanner;

public class C05ejercicio25 {
	
	public static void main(String[] args) {
		
			int num = 0;
			int reves = 0;
			int cont = 0;
			int copianumero = 0;
			int digitos=0;
						Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						 num = Integer.parseInt(s.nextLine());

						copianumero = num;
					/*
						reves = num % 10;
						System.out.print(reves);
						reves = num % 100;
						reves = reves / 10;	
						System.out.print(reves);
						reves = num % 1000;
						reves = reves / 100;	
						System.out.print(reves);
					System.out.print("numero al reves: " + reves);
					*/ 
					
			while(num > 0){
				
				reves = (reves * 10) + (num % 10);
				num = num / 10;				
				digitos++;
			}	
			
			System.out.print("numero de cifras: " + digitos + " \n");
			System.out.print("numero introducido: " + copianumero + " \n");	
			System.out.print("numero al reves: " + reves + " \n");
	}
}


