/**1 Ejercicio Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando instancias y
aplicándole algunos métodos.**/


public class PruebaCaballo{
  public static void main(String[] args) {
    
    Caballo Rocinante= new Caballo("macho","Rocinante");
    Rocinante.trote();
    Rocinante.relincha();
    Caballo Perdigon = new Caballo("macho","Perdigon");
    Perdigon.trote();
    Perdigon.relincha();
    Perdigon.copulacon(Rocinante);
    Rocinante.copulacon(Perdigon);
    Caballo Blanca = new Caballo("hembra", "Blanca");
    Blanca.trote();
    Blanca.copulacon(Perdigon);
    Perdigon.copulacon(Blanca);

    }
}  
