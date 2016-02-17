/**Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
esquina inferior derecha.**/

import java.util.Scanner;  
public class C07biEjercicio2{
  public static void main(String[] args) 
    throws InterruptedException { //se añade para poner tiempo de sleep y tal
           
int[][] num; // se define num como un array de enteros
num = new int[5][6]; // se reserva 3 filas y 6 columnas
int fila=0;
int columna=0;
int sumafila=0;
int sumacolum=0;
int totalfila=0;
int totalcolum=0;
int total=0;
                // x.length(siendo la x el array que sea) para que lo recorra automaticamente
			//introduce los digitos en el array bidimensional
		for(fila = 0; fila < 4; fila++) {
        System.out.print("Fila: " + fila + "\n");
        for(columna = 0; columna < 5; columna++) {
          
            Scanner s = new Scanner(System.in);
						System.out.print("Introduce numero : ");
							
						num[fila][columna] = Integer.parseInt(s.nextLine());
            System.out.print(" " + columna + " columna\n");
           
        }
        System.out.println();
      }	

    
    
     
    
    //suma la fila
    for(fila = 0; fila < 4; fila++) {
       
        
       
        for(columna = 0; columna < 5; columna++) {
            
          sumafila = num[fila][columna] + sumafila;  
           
       
           
        }
        
        num[fila][5]=sumafila;//suma diferentes filas se  guarda en la columna asignada
    
        totalfila= sumafila + totalfila; //se guarda los totales 
        sumafila = 0; //resetea la suma cada vez
    
    }	
    
    
    //suma columa
      for(columna = 0; columna < 5; columna++) {
       
        
       
        for(fila = 0; fila < 4; fila++) {
            
        
           sumacolum = num[fila][columna] + sumacolum; 
       
           
        }
        
       
        num[4][columna]=sumacolum;//suma diferentes columnas
        totalcolum = sumacolum + totalcolum; //se guarda la suma total en totalcolum
        sumacolum=0;//resetea la suma cada vez
        
     
    }	
    
    
      total =totalcolum + totalfila;//se suman los totales tanto de fila y columna
      
      num[4][5] = total;//al la suma del total se le asigna una posicion de guardado hay que tener cuidado para no machacar otra asignada o escrita
    
    
      for(fila = 0; fila < 5; fila++) {
        System.out.print("Fila: " + fila);
        for(columna = 0; columna < 6; columna++) {
            
            System.out.printf("%10d ", num[fila][columna]);
            Thread.sleep(200); // retardo de un segundo
           
        }
        System.out.println();
        
     
      }	
    
    
    
    
    
   
    
	}
}
