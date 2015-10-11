/**Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
A partir de la hora 41, se pagan a 16 euros la hora.*/

import java.util.Scanner;

public class C04ejercicio4 {
	
	public static void main(String[] args) {
			

			Scanner s = new Scanner(System.in);
			System.out.print("Introduce un horas : ");
			int horas = Integer.parseInt(s.nextLine());
			int salario = 0;

			if(horas <= 40){
				
				salario = horas * 12;
				
			}else{
				
				salario = 40 * 12;
				salario = salario + ((horas - 40) * 16);
				
			}
			
			System.out.print("Su salario total es: " + salario) ;
			
		}	
}
