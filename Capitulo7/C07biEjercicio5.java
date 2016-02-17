/**Ejercicio 5
Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
deberá dar la posición tanto del máximo como del mínimo.*/



import java.util.Scanner;  
public class C07biEjercicio5{
  public static void main(String[] args) 
    throws InterruptedException { //se añade para poner tiempo de sleep y tal
           
int[][] num; // se define num como un array de enteros
num = new int[7][11]; // se reserva 6 filas y 10 columnas
int fila=0;
int columna=0;
int filaguarda=0;
int columnaguarda=0;
int filaguarda2=0;
int columnaguarda2=0;
int minimo=9999;
int maximo=0;
                // x.length(siendo la x el array que sea) para que lo recorra automaticamente
			//introduce los digitos en el array bidimensional modo aleatorio
		for(fila = 0; fila < 6; fila++) {
       
        for(columna = 0; columna < 10; columna++) {
         
							
						num[fila][columna] = (int)(Math.random()*1001);//genera aleatorio desde 0 hasta 1000
            
           
        }
        System.out.println();
      }	

    
    
     
    
    //suma la fila1
    for(fila = 0; fila < 6; fila++) {
       
        
       
        for(columna = 0; columna < 10; columna++) {
          
            
              if (minimo > num[fila][columna]){
            
                   minimo =num[fila][columna];
                    
                    filaguarda=fila;
                    columnaguarda=columna;
            
              }  
              
               if (maximo < num[fila][columna]){
            
                   maximo =num[fila][columna];
                    
                    filaguarda2=fila;
                    columnaguarda2=columna;
            
              }  
              
              
       
           
        }
        
    
    }	
    
    
  
    	
    
    
    
      for(fila = 0; fila < 6; fila++) {
        System.out.print("Fila: " + fila);
        for(columna = 0; columna < 10; columna++) {
            
            System.out.printf("%10d ", num[fila][columna]);
         
        }
        System.out.println();
        
     
      }	
    
    
    
      System.out.print("posicion minimo: f:(0-5)" + filaguarda + " c:(0-9) " + columnaguarda);
      System.out.print("\nposicion maximo: f:(0-5)" + filaguarda2 + " c:(0-9) " + columnaguarda2);
    
    
   
    
	}
}


