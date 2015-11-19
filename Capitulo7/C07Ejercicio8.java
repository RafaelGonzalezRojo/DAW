/**Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
determinado año y que muestre a continuación un diagrama de barras horizontales con
esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
carácter.*/

import java.util.Scanner;

public class C07Ejercicio8{
public static void main(String[] args) {
int[] temperatura; // se define num como un array de enteros
temperatura = new int[12]; 
String [] mes;
mes = new String[12];
mes[0] = "enero";
mes[1] = "febrero";
mes[2] = "marzo";
mes[3] = "abril";
mes[4] = "mayo";
mes[5] = "junio";
mes[6] = "julio";
mes[7] = "agosto";
mes[8] = "septiembre";
mes[9] = "octubre";
mes[10] = "noviembre";
mes[11] = "diciembre";

		for(int cont2=0;cont2<temperatura.length;cont2++){
					
					
				Scanner s = new Scanner(System.in);
						System.out.print("Introduce temperatura del mes de " + mes[cont2] + " :");
							
						temperatura[cont2] = Integer.parseInt(s.nextLine());
						
		}	
		
		System.out.print("array original: "); 
		
		for (int cont=0; cont<mes.length; cont++){ 
				
				
					System.out.print("\n" + mes[cont] + " :  \t");
					
					for (int cont2=0; cont2<temperatura[cont]; cont2++){ 
						
						System.out.print( "/");
					}	
				
		}
					

		
	}
}
