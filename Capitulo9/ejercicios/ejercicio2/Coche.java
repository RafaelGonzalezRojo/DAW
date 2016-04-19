public class Coche extends Vehiculo {
    // atributo de clase
    private String sillin;    
    private int cilindrada;
    private String modelo;
    private int kilometraje;
   
    // método de clase
    public static int getKilometrajeTotal() {
        return kilometrajeTotal;
    }
     void quemarueda() {
        System.out.println("brrrrrrrrr      uiiiiiiiiiiyyyyy¡¡¡¡ ...     pfffff");
        }
  
    
    public Coche(String mo) {
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
