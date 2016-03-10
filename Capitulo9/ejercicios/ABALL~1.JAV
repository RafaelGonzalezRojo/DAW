
public class Caballo {
      // atributos /////////////////////////////
      String color, raza, sexo, nombre;//solo utilizo para los metodos sexo y nombre
      int edad;
      double peso;
      // métodos ///////////////////////////////
      // constructor
        Caballo(String s, String nom) {
            this.sexo = s;
             this.nombre = nom;
        }
        // getter
        String getSexo() {
          return this.sexo;
        }
        
         String getNombre() {
          return this.nombre;
        }
        
        /**
        * Hace que el  caballo trote
        */
        void trote() {
        System.out.println("Taca ta taca ta taca ta");
        }
        /**
        * Hace que el caballo relinche
        */
        void relincha() {
        System.out.println("bruuuuhhhuuuu");
        }
                  //otro es otro objeto(el otro caballo que viene desde main)
        void copulacon(Caballo otro) {
                if (this.sexo.equals("macho")) {
                System.out.println(this.nombre + ": soy todo un semental");
                } 
                if ((otro.getSexo().equals("macho")&& this.sexo.equals("hembra")) ||(otro.getSexo().equals("hembra")&& this.sexo.equals("macho"))){
                System.out.println(this.nombre + ": quieres tener una cita conmigo " + otro.getNombre());//utilizo get para obtener sexo o nombre en eeste caso y compararlo this para el objeto actual
                }
                if ((otro.getSexo().equals("macho") && this.sexo.equals("macho"))){
                System.out.println(this.nombre + ": lo siento no soy gay no puedo copular contigo " + otro.getNombre());
                }
        
      }        
        
        
        
}
