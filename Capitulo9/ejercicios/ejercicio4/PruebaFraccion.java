/**
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de los
métodos pueden ser invierte , simplifica , multiplica , divide , etc.
 */
public class PruebaFraccion {
  public static void main(String[] args) {
    
    Fraccion f1 = new Fraccion(2,3);
    Fraccion f2 = new Fraccion(3, 4);
    Fraccion f3 = new Fraccion(-300, 200);
    
    
    System.out.println(f1 + " x 5 = "+ f1.multiplica(5));
    System.out.println(f1 + " ^-1 = " + f1.invierte());
    System.out.println(f1 + " x " + f2 + " = " + f1.multiplica(f2));
    System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));
    System.out.println(f3 + " = " + f3.simplifica());      
  }
}
