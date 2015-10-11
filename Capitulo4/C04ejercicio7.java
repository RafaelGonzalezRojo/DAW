/**Realiza un programa que calcule la media de tres notas.*/



import java.util.Scanner;
import java.lang.Math;
public class C04ejercicio7 {
	
	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);
			System.out.print("Introduce primera nota : ");
			double nota1 = Double.parseDouble(s.nextLine());

			System.out.print("Introduce segunda nota : ");
			double nota2 = Double.parseDouble(s.nextLine());
			
			System.out.print("Introduce tercera nota : ");
			double nota3 = Double.parseDouble(s.nextLine());

			double media = (nota1 + nota2 + nota3) / 3;

			System.out.printf("\n el resultado de la media es : %.2f  \n" , (double)(media));

	}
}	
	
