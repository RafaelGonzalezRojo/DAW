public class Bicicleta extends Vehiculo {
    // atributo de clase
   
         
    private String sillin;    
    private int piñones;
    private String modelo;
    private int kilometraje;
   
   
   
    // método de clase
    public static int getKilometrajeTotal() {
        return kilometrajeTotal;
    }
     void caballito() {
        System.out.println("estoy haciendo el caballito");
        }
  
    
    public Bicicleta(String mo) {
      modelo = mo;
      kilometraje = 0;
      vehiculosCreados++;
    }
     public String getmodelo() {
      return modelo;
    }
    
    
    public int getKilometraje() {
      return kilometraje;
    }
    /**
    * Recorre una determinada distancia.
    *
    * @param km distancia a recorrer en kilómetros
    */
    public void recorre(int km) {
      kilometraje += km;
      kilometrajeTotal += km;
    }
    
}
