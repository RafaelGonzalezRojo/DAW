public abstract class Vehiculo {
//atributos
  public static int kilometrajeTotal = 0;
  public static int  vehiculosCreados = 0;

    // método de clase   
    public static int getKilometrajeTotal() {
        return kilometrajeTotal;
    }
    
    public static int getvehiculosCreados() {
        return vehiculosCreados;
    }


    public void  kilometrosRecorridos(int km) {
      kilometrajeTotal += km;
    }
   


}
