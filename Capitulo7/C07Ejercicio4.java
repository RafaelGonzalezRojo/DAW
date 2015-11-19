/**Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
contenido de los tres arrays dispuesto en tres columnas.*/



import java.util.Scanner;

public class C07Ejercicio4{
public static void main(String[] args) {
int[] num; // se define num como un array de enteros
num = new int[20]; // se reserva espacio para 19 enteros
int random=0;
int[] arraycuadrado;
arraycuadrado = new int[20]; 
int[] arraycubo;
arraycubo = new int[20]; 
			//en vede 19 se puede poner x.length(siendo la x el array que sea) para que lo recorra automaticamente
		for(int cont2=0;cont2<num.length;cont2++){
						random =(int)(Math.random()*100);
						num[cont2] = random;
						arraycuadrado[cont2] = random * random;
						arraycubo[cont2] = random * random * random;
						
		}	
			
		System.out.print("numeros generados\n");
		for (int cont=0; cont<num.length; cont++){ 
				
				System.out.print(num[cont] + "\t");
				
				System.out.print(arraycuadrado[cont] + "\t");
			
				System.out.print(arraycubo[cont] + "\t");
				
				System.out.print("\n");
			
		}
		
		
	}
}

