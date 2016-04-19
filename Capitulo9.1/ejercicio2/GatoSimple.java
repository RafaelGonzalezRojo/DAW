/**
 * GatoSimple.java
 * Definición de la clase GatoSimple
 * @author Luis José Sánchez
 */

public class GatoSimple {

  // atributos /////////////////////////////
  String nombre = "vacio";
  String color = "vacio";
  String raza = "vacio";
  String sexo = "vacio";
  int    edad;
  double peso = 0;
  
  // métodos ///////////////////////////////
  
  // constructor
  GatoSimple (String s) {
    this.sexo = s;
  }
  
  GatoSimple (String nom,String col) {
    this.nombre = nom;
    this.color = col;
  }
  GatoSimple (String nom,String col,double kg) {
    this.nombre = nom;
    this.color = col;
    this.peso = kg;
  }
  
  
  // getter
  String getSexo() {
    return this.sexo;
  }
  
   double getPeso() {
    return this.peso;
  }
  
  
    String getNombre() {
    return this.nombre;
  }
  
   String getColor() {
    return this.color;
  }
  
  /**
   * Hace que el gato maulle
   */
  void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */  
  void ronronea() {
    System.out.println("mrrrrrr");
  }
  
  /**
   * Hace que el gato coma.
   * A los gatos les gusta el pescado, si le damos otra comida
   * la rechazará.
   * 
   * @param comida la comida que se le ofrece al gato
   */
  void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  /**
   * Pone a pelear dos gatos.
   * Solo se van a pelear dos machos entre sí.
   * 
   * @param contrincante es el gato contra el que pelear
   */
  void peleaCon(GatoSimple contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo().equals("hembra")) {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aquí que te vas a enterar");
      }
    }
  }
  
  public String toString() {
    String salida;
          salida="";  //inicializa la salida se predifine los string vacio para comprobar ahora que los datos mandados no estan null
          if(this.nombre != "vacio"){
          salida+=" " + this.nombre ;
        }
          if(this.color != "vacio"){
          salida+="," +this.color ;
        }
          if(this.sexo != "vacio"){
           salida+=" " +this.sexo ;
         }
          if(this.peso != 0){
          salida+="," + this.peso ;
        }
           return salida;
    
    
  }  
  
}
