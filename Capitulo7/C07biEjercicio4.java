/**Modifica el programa anterior de tal forma que las sumas parciales y la suma total
aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el ordenador
se queda “pensando” antes de mostrar los números.**/



import java.util.Scanner;  
public class C07biEjercicio4{
  public static void main(String[] args) 
    throws InterruptedException { //se añade para poner tiempo de sleep y tal
           
int[][] num; // se define num como un array de enteros
num = new int[5][6]; // se reserva 4 filas y 5 columnas
int fila=0;
int columna=0;
int sumafila=0;
int sumacolum=0;
int totalfila=0;
int totalcolum=0;
int total=0;
                // x.length(siendo la x el array que sea) para que lo recorra automaticamente
			//introduce los digitos en el array bidimensional modo aleatorio
		for(fila = 0; fila < 4; fila++) {
       
        for(columna = 0; columna < 5; columna++) {
         
							
						num[fila][columna] = (int)(Math.random()*899 + 100);//genera aleatorio desde 100 hasta 999
            
           
        }
        System.out.println();
      }	

    
    
     
    
    //suma la fila1
    for(fila = 0; fila < 4; fila++) {
       
        
       
        for(columna = 0; columna < 5; columna++) {
            
          sumafila = num[fila][columna] + sumafila;  
           
       
           
        }
        
        num[fila][5]=sumafila;//suma diferentes filas se  guarda en la columna asignada
    
        totalfila= sumafila + totalfila; //se guarda los totales 
        sumafila = 0;
    
    }	
    
    
    //suma columa
      for(columna = 0; columna < 5; columna++) {
       
        
       
        for(fila = 0; fila < 4; fila++) {
            
        
           sumacolum = num[fila][columna] + sumacolum; 
       
           
        }
        
       
        num[4][columna]=sumacolum;//suma diferentes columnas
        totalcolum = sumacolum + totalcolum; //se guarda la suma total en totalcolum
        sumacolum=0;
        
     
    }	
    
    
      total =totalcolum + totalfila;//se suman los totales tanto de fila y columna
      
      num[4][5] = total;//al la suma del total se le asigna una posicion de guardado hay que tener cuidado para no machacar otra asignada o escrita
    
    
      for(fila = 0; fila < 5; fila++) {
        System.out.print("Fila: " + fila);
        for(columna = 0; columna < 6; columna++) {
            
            System.out.printf("%10d ", num[fila][columna]);
            if(num[fila][columna] == num[fila][4]){//pongo el tiempo una posicion antes para dar el efecto de carga antes de la suma del total de la fila si se pone justo en la que es parece que solo carga ene l salto de linea
            Thread.sleep(500); // retardo de un segundo
            }
            if(num[fila][columna] == num[4][columna]){
            Thread.sleep(500); // retardo de un segundo
            }
            
        }
        System.out.println();
        
     
      }	
    
    
    
    
    
   
    
	}
}
