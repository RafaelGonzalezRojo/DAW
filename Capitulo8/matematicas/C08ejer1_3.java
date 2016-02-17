/**Devuelve el menor primo que es mayor al número que se pasa
como parámetro.*/



public class C08ejer1_3 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero positivo: ");
        int n = Integer.parseInt(System.console().readLine());
     boolean bandera = true;   
     boolean esPrimo = true; 
     int maximo=Integer.MAX_VALUE;
     for(int y=0; y <= maximo; y++){  
       esPrimo = true; 
        for (int i = 2; i < y; i++) {
          if ((y % i) == 0) {
            esPrimo = false;
          }
        }
        
        
        
        if ((esPrimo)&&(bandera)) {
          
            if(y>n && bandera == true){
               System.out.println("El " + y + " es primo siguiente");
               bandera = false;
            }  
           
        }else if(bandera == true) {
          
         
        }
      }
      
    }
}
