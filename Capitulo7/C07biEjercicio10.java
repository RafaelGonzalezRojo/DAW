/*Realiza el juego de las tres en raya.*/


import java.util.Scanner;  
public class C07biEjercicio10{
   static final int VACIO = 0;
   static final int X = 1;
   static final int O = 2;
  public static void main(String[] args) 
    throws InterruptedException { //se añade para poner tiempo de sleep y tal
           
          int[][] num; // se define num como un array de enteros
          num = new int[4][4]; // se reserva 3 filas y 3 columnas
          int fila=0;
          int columna=0;
          int filax=0;
          int columnax=0;
          int filaO=0;
          int columnaO=0;
          boolean ganado = false;
          boolean finjuego = false;
          boolean ganado2 = false;
                // x.length(siendo la x el array que sea) para que lo recorra automaticamente
			//pinta tablero
      for(fila = 0; fila < 3; fila++) {
       
        for(columna = 0; columna < 3; columna++) {
         
							  System.out.print("| |");
						;//genera aleatorio desde 0 hasta 1000
              num[fila][columna] = VACIO;
           
        }
        System.out.println();
      }
      
     // pedimos donde poner la x
     
    do{ 
        //inicializo booleans a false al principio del bucle para solo activarlo en los comprobantes de cada jugador
        ganado = false;
        finjuego =false;
        ganado2 = false;
        
          //parte jugador2
  
        System.out.print("turno de juegador1 \n");
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce numero para fila : ");
        	filax = Integer.parseInt(s.nextLine());
          
        System.out.print("Introduce numero para columna : ");
        	columnax = Integer.parseInt(s.nextLine());  
          
          
      for(fila = 0; fila < 3; fila++) {
       
        for(columna = 0; columna < 3; columna++) {
         
							 
						
            if(filax == fila && columnax == columna){//leo por teclado la fila y la columna del usuario y se compara con el array si es igual se marca con x
                num[fila][columna] = X;//maraca como  uno la casilla activa
               System.out.print("|x|");
              
            }else if(num[fila][columna] == 1){
              
              System.out.print("|x|");
               
            }else if(num[fila][columna] == 2){
              
              System.out.print("|O|");
              
              }else{
              
              System.out.print("| |");
              
            }      
       
        }
        System.out.println();
      }
          
          //comprueba las horizontales
          if((num[0][0] == X && num[0][1] == X && num[0][2] == X)  || (num[1][0] == X && num[1][1] == X && num[1][2] == X) || (num[2][0] == X && num[2][1] == X && num[2][2] == X)){
               
                ganado = true;
                finjuego = true;
            
          }     
          
          //comprueba las verticales
          if((num[0][1] == X && num[1][1] == X && num[2][1] == X ) || (num[0][0] == X && num[1][0] == X && num[2][0] == X) || (num[0][2] == X && num[1][2] == X && num[2][2] == X)){
               
                ganado = true;
                finjuego =true;
            
          }   
          
          
          
          //comprueba las diagonales
          if((num[0][0] == X && num[1][1] == X && num[2][2] == X ) || (num[0][2] == X && num[1][1] == X && num[2][0] == X )){
               
                ganado = true;
                finjuego =true;
            
          }    
          
       //evita que entre en el turno jugador 2 si ya ha ganado   
     if(!ganado){     
        //parte jugador2
        
        System.out.print("turno de juegador2 \n");
        
        System.out.print("Introduce numero para fila : ");
          filaO = Integer.parseInt(s.nextLine());
          
        System.out.print("Introduce numero para columna : ");
          columnaO = Integer.parseInt(s.nextLine());  
                
         for(fila = 0; fila < 3; fila++) {
             
              for(columna = 0; columna < 3; columna++) {
               
                     
                  
                  if(filaO == fila && columnaO == columna){//leo por teclado la fila y la columna del usuario y se compara con el array si es igual se marca con x
                      num[fila][columna] = O;//marcara como  uno la casilla activa
                     System.out.print("|O|");
                    
                  }else if(num[fila][columna] == 2){
                    
                    System.out.print("|O|");
                     
                  }else if(num[fila][columna] == 1){
                    
                    System.out.print("|X|");
                     
                  }else{
                    
                    System.out.print("| |");
                    
                  }      
             
              }
              System.out.println();
            }
                
                //comprueba las horizontales
                if(num[0][1] == O && num[0][0] == O && num[0][2] == O  || num[1][1] == O && num[1][0] == O && num[1][2] == O || num[2][1] == O && num[2][0] == O && num[2][2] == O){
                     
                      ganado2 = true;
                      finjuego = true;
                  
                }     
                
                //comprueba las verticales
                if(num[1][1] == O && num[2][1] == O && num[0][1] == O  || num[1][0] == O && num[2][0] == O && num[0][0] == O || num[1][2] == O && num[2][2] == O && num[0][2] == O){
                     
                      ganado2 = true;
                      finjuego =true;
                  
                }   
                
                
                
                //comprueba las diagonales
                if(num[0][0] == O && num[1][1] == O && num[2][2] == O || num[0][2] == O && num[1][1] == O && num[2][0] == O || num[1][2] == O){
                     
                      ganado2 = true;
                      finjuego =true;
                  
                }          
          
        }
          
          
          
    }while(!finjuego); 
      	
        
        if(ganado){
          
          System.out.print("has ganado enhorabuena jugador 1");
          
        }
        
        
        if(ganado2){
          
           System.out.print("has ganado enhorabuena jugador 2");
          
        }    
        
    }
  }  
