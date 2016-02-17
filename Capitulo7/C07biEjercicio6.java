/**Ejercicio 6
Modifica el programa anterior de tal forma que no se repita ningún número en el array.**/


import java.util.Scanner;  
public class C07biEjercicio6{
  public static void main(String[] args) 
    throws InterruptedException { //se añade para poner tiempo de sleep y tal
           
      int[][] num; // se define num como un array de enteros
      num = new int[7][11]; // se reserva 6 filas y 10 columnas
      int [][] guard;
      guard = new int[7][11];
      int fila=0;
      int columna=0;
      int filaguarda=0;
      int columnaguarda=0;
      int filaguarda2=0;
      int columnaguarda2=0;
      int minimo=9999;
      int maximo=0;
      int fila2=0;
      int columna2=0;
      int cont=0;
      int bandera=0;
                // x.length(siendo la x el array que sea) para que lo recorra automaticamente
			//introduce los digitos en el array bidimensional modo aleatorio
      for(fila = 0; fila < 6; fila++) {
           
            for(columna = 0; columna < 10; columna++) {
      
                  guard[fila][columna]= -1; //inicializamos a -1 para poder tener un valor en el guard y que pueda mostrar el 0 a la hora de generar los numeros
            }
      }
        
        for(fila = 0; fila < 6; fila++) {
           
            for(columna = 0; columna < 10; columna++) {
             
              do {  
                num[fila][columna] = (int)(Math.random()*61);//genera aleatorio desde 0 hasta 1000
                bandera = 0;//se inicializa la bandera a 0 para controlar repeticiones
                for(fila2 = 0; fila2 < 6; fila2++) {
                   
                    for(columna2 = 0; columna2 < 10; columna2++) {
                       
                          
                        if(num[fila][columna] == guard[fila2][columna2]){//se compara con la copia del array
                          
                          bandera=1;//si es igual ke la copia del array vuelve a generarse otro numero
                          
                        }
                    }
                } 
              } while (bandera==1);   // aqui  se ve el valor de bandera si entara en el if se repite el proceso, que no se guarda en la linea de abajo
              
             guard[fila][columna] = num[fila][columna];  //aqui se guarda el numero generado no repetido en la copia del array
            }
            System.out.println();
          }	

      
    
     
    
        //suma la fila1
        for(fila = 0; fila < 6; fila++) {
           
            
           
            for(columna = 0; columna < 10; columna++) {
              
                
                  if (minimo > guard[fila][columna]){
                
                       minimo =guard[fila][columna];
                        filaguarda=fila;
                        columnaguarda=columna;
                
                  }  
                  
                   if (maximo < guard[fila][columna]){
                
                       maximo = guard[fila][columna];
                        filaguarda2=fila;
                        columnaguarda2=columna;
                
                  }  
                  
            }
            
        
        }	
    
    
  
    	
    
    
    
      for(fila = 0; fila < 6; fila++) {
        System.out.print("Fila: " + fila);
        for(columna = 0; columna < 10; columna++) {
            
            System.out.printf("%10d ", guard[fila][columna]);
         
        }
        System.out.println();
        
     
      }	
    
    
    
      System.out.print("posicion minimo: f:(0-5)" + filaguarda + " c:(0-9) " + columnaguarda);
      System.out.print("\nposicion maximo: f:(0-5)" + filaguarda2 + " c:(0-9) " + columnaguarda2);
    
    
   
    
	}
}
