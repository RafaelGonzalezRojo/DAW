/**
 * PruebaGatoSimple.java
 * Programa que prueba la clase GatoSimple
 * @author Luis José Sánchez
 */

public class PruebaGatoSimple {
  public static void main(String[] args) {
    
    GatoSimple[] gat = new GatoSimple[4];//se declara de cuantas posiciones sera el array
    
    
      //introduce los datos de los gatos
      for(int i = 0; i < 4; i++) { 
        System.out.println("Gato: " + i);
        System.out.print("Nombre: ");
        String nombreIntroducido = System.console().readLine();
        System.out.print("Color: ");
        String colorIntroducido = System.console().readLine();
         gat[i] = new GatoSimple(nombreIntroducido, colorIntroducido);//contrulle los gatos con las variables de introducir readline
      }
      
      //muestra los gato
      for(int i = 0; i < 4; i++) {
        System.out.print("Nombre: " + gat[i].getNombre() + " ");
        System.out.print("Color: " + gat[i].getColor() + "\n");
      }  
    
  }
}
