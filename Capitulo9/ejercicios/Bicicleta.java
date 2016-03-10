public class Bicicleta extends Vehiculo {
    // atributo de clase
    private static int kilometrajeTotal = 0;
    // método de clase
    public static int getKilometrajeTotal() {
        return kilometrajeTotal;
    }
     void caballito() {
        System.out.println("estoy haciendo el caballito");
        }
    private String sillin;    
    private int piñones;
    private String modelo;
    private int kilometraje;
    public Bicicleta(String mo) {
      modelo = mo;
      kilometraje = 0;
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
