public class Pizza {
      // atributos /////////////////////////////
      String sabor, tamano;//solo utilizo para los metodos sexo y nombre
      String estado;
     private static int pedidas=0;
      private static int servidas=0;
      // métodos ///////////////////////////////
      // constructor
        Pizza(String s, String tam) {
            this.sabor = s;
             this.tamano = tam;
             this.estado = "pedida";
             pedidas++;
        }
        // getter
        String getSabor() {
          return this.sabor;
        }
        
         String getTamano() {
          return this.tamano;
        }
        
        static int getTotalPedidas() {
          return pedidas;
        }
        
        static int getTotalServidas() {
          return servidas;
        }
        /**
        * Hace que el  caballo trote
        */
      
        /**
        * Hace que el caballo relinche
        */
        void sirve() {
             if (this.estado.equals("servida")) {
                System.out.println("esa pizza ya se ha servido");
                }else{
                servidas++;
                this.estado="servida";
                }
            
        }
                  //otro es otro objeto(el otro caballo que viene desde main)
         public String toString() {
          String salida;
          salida=" " + this.tamano ;
          salida+="," +this.sabor ;
          salida+="," + this.estado ;
           return salida;
         }    
        
        
 }       

