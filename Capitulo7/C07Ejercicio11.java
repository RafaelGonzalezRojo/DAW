/**Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
desplazando el resto de números (los que no son primos) de tal forma que no se pierda
ninguno. Al final se debe mostrar el array resultante.*/




import java.util.Scanner;

public class C07Ejercicio11{
public static void main(String[] args) {
int[] num; // se define num como un array de enteros
num = new int[10]; // se reserva espacio para 19 enteros
int[] aux;
aux = new int[10];
int primo=0;
int posicion=0;
			//en vede 19 se puede poner x.length(siendo la x el array que sea) para que lo recorra automaticamente
		for(int cont2=0;cont2<num.length;cont2++){
					
				Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						num[cont2] = Integer.parseInt(s.nextLine());
						
		}	
    
    
    System.out.print("array original: \t"); 
		
		for (int cont=0; cont<num.length; cont++){ 
				
				
					System.out.print(" " + cont + " ");
				
		}
		System.out.print("\n");
    System.out.print("\t\t\t");
		for (int cont=0; cont<num.length; cont++){ 
				
				
					System.out.print(" " + num[cont] + " ");
				
		}
    	
			
			
			
		//meto los primos se guarda la posicion
		for (int cont=0; cont<num.length; cont++){ 
				
                  for(int div=2; div<=num[cont];div++){  //divide por todos los numeros hasta llegar al numero dentro de la celda
                        
                    
                                  if(num[cont]% div == 0){
                                
                                      primo++;//cuenta cada vez que es divisible
                            
                                   }		
                  }
                 
                 
                 
                  if((primo==1)|| (num[cont]==1)){//si es igual y tan solo se divide por si mismo seria primo y lo guardaria despues de los primos
                        aux[posicion] = num[cont];//guarda el numero en el auxilia
                        posicion++;//mueve la posicion del array auxiliar a la siguiente
                        
                   } 
                  primo=0;
		}
		
		for (int cont=0; cont<num.length; cont++){ 
			
         for(int div=2; div<=num[cont];div++){  
				
              if(num[cont]% div == 0){//divide por todos los numeros hasta llegar al numero dentro de la celda
            
                  primo++;//cuenta cada vez que es divisible
        
               }		
        }
      
        if(primo>1){//si es mayor seria no primo y lo guardaria despues de los primos
              aux[posicion] = num[cont];
              posicion++;
         } 
		  
      primo=0;//inicializa el contador de primo en cada celda del array
			
		}	
		
		System.out.print("\narray modificado: \t"); 
    
    for (int cont=0; cont<aux.length; cont++){ 
				
				
					System.out.print(" " + cont + " ");
				
		}
		System.out.print("\n");
    System.out.print("\t\t\t");
		for (int cont=0; cont<aux.length; cont++){ 
				
				
					System.out.print(" " + aux[cont] + " ");
				
		}
    
    
  }  
    
}    
    
			
