/**
 * PruebaGatoSimple.java
 * Programa que prueba la clase GatoSimple
 * @author SarcasticBoy
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
