/*Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil
se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican
con las letras de la “a” a la “h” y las filas se indican del 1 al 8.*/



import java.util.Scanner;  
public class C07biEjercicio8{
   static final int VACIO = 0;
   static final int alfil = 1;
   static final int trayectoria = 2;
  public static void main(String[] args) 
    throws InterruptedException { //se añade para poner tiempo de sleep y tal
           
      int[][] tablero; // se define num como un array de enteros
      tablero = new int[8][8]; // se reserva 3 filas y 3 columnas
      int fila=0;
      int columna=0;
      int filaA=0;
      int columnaA=0;
      int distanciax = 0;
      int distanciay = 0;
      int numfiladeco=1;
      char letracolum;
      
                // x.length(siendo la x el array que sea) para que lo recorra automaticamente
			//pinta tablero
      for(fila = 0; fila < 8; fila++) {
        
          System.out.print(numfiladeco);
          numfiladeco++;
       
        for(columna = 0; columna < 8; columna++) {
         
							  System.out.print("| |");
					
              tablero[fila][columna] = VACIO;
           
        }
        System.out.println();
      }
     System.out.printf(" "+" a "+" b "+" c "+" d "+" e "+" f "+" g "+" h "+"\n"); 
     
 
      
     Scanner s = new Scanner(System.in);
     System.out.print("Introduce numero para fila : (1-8)");
     filaA = Integer.parseInt(s.nextLine());
     filaA = filaA -1; //se le resta uno para que coordine con lo mostrado literalmente
     System.out.print("Introduce numero para columna : (a-h)");
     String posicionletra=(s.nextLine());
     columnaA = (int)(posicionletra.charAt(0)) - 97;
      //se coge el string y se pasa chatAt la letra luego se resta para el codigo assci correspondiente y se parchea para int
  
     numfiladeco=1;
      //reseteanumero para pintar numeros de lado 
       for(fila = 0; fila < 8; fila++) {
  
          System.out.print(numfiladeco);
          numfiladeco++;
        for(columna = 0; columna < 8; columna++) {
         
               //calcula trayectoria
            distanciax = filaA - fila;
         
            distanciax = Math.abs(distanciax);
            
            distanciay = columnaA-columna;   
          
            distanciay = Math.abs(distanciay);
                      
            if(filaA==fila && columnaA==columna){
               
               tablero[fila][columna] = alfil; 
                
                System.out.print("|A|");
          
                //pinta alfil
          
                
            }else if(distanciax==distanciay){
              
                tablero[fila][columna] = trayectoria; 
                
                System.out.print("|X|");
              //pinta trayectoria
            
            }else{  
               
              tablero[fila][columna] = VACIO;
              System.out.print("| |");
              //pinta vacio
              
            }
              
           
        }
        System.out.println();
      }
      
      System.out.printf(" "+" a "+" b "+" c "+" d "+" e "+" f "+" g "+" h "+"\n"); 
      
      
      
      
    } 
  }  
    
