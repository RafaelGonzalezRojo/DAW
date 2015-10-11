/**Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
*/


import java.util.Scanner;

public class C04ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Ecuacionde primer grado \n");
			System.out.print("Introduce valor a : ");
			double a = Double.parseDouble(s.nextLine());
			System.out.print("\n Introduce valor b : ");
			double b = Double.parseDouble(s.nextLine());
			
			if(a == 0){
			System.out.print("\n Matematicamente imposible ");
			
		}else{
			double resultado = -b / a;
			
				System.out.printf("\n el resultado de la ecuacion es : %.2f  \n" , (double)(resultado));
		}		
	}
	
}
	
