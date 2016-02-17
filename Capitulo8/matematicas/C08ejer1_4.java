/**potencia: Dada una base y un exponente devuelve la potencia.*/

public class C08ejer1_4 {
    public static void main(String[] args) {
      System.out.print("Introduce un número entero positivo base: ");
      int n = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un número entero positivo exponente: ");
      int e = Integer.parseInt(System.console().readLine());
      boolean bandera = true;   
      int potencia=0;
      int resultado=0;
     for(int y=1; y < e ; y++){  
       
       potencia = n * n;
       resultado = resultado + potencia;
        }
        
        
            System.out.print("potencia: " + resultado);
        
    
      
    }
}
