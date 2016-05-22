/**
 * PruebaGatoSimple.java
 * Programa que prueba la clase GatoSimple
<<<<<<< HEAD
 * @author Luis José Sánchez
=======
 * @author SarcasticBoy
>>>>>>> 906b029ae19eac54d1fbaaeb3c8b8b81be505b8d
 */

public class PruebaGatoSimple {
  public static void main(String[] args) {
    
    GatoSimple[] gat = new GatoSimple[4];//se declara de cuantas posiciones sera el array
    
    
      //introduce los datos de los gatos
   
      gat[0] = new GatoSimple("Garfield","romano"); 
      
      gat[1] = new GatoSimple("Copito","blanco");
         
      gat[2] = new GatoSimple("hembra");
         
      gat[3] = new GatoSimple("Misifu","manchas", 4.2);
      
      //muestra los gato
      for(int i = 0; i < 4; i++) {
        System.out.print("Gato: " + gat[i] + "\n");
      }  
    
  }
}
