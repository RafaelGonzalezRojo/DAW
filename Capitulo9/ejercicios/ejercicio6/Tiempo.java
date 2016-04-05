
public class Tiempo {
      // atributos /////////////////////////////
     
      private int hora;
      private int minuto;
      private int segundo;
      // constructor
        Tiempo(int h,int m,int s) {
            this.hora= h;
             this.minuto = m;
             this.segundo = s;
        }
        // getter
        int getdevueltasegundos() {
          
          int resultado = (this.hora * 3600) + this.segundo;
          resultado =  (this.minuto * 60) + resultado;
          return resultado;
        }
  
          
         // métodos ///////////////////////////////
    
        
        
                  //otro es otro objeto(el otro caballo que viene desde main)
        void sumatiempo(Tiempo otrotiempo) {
          
          
            System.out.println(otrotiempo.getdevueltasegundos());
             System.out.println(this.getdevueltasegundos());//hace referencia al objeto actual
              System.out.println(otrotiempo.getdevueltasegundos()+ this.getdevueltasegundos());
              int sumasegundos = otrotiempo.getdevueltasegundos()+ this.getdevueltasegundos();
              int hora = sumasegundos /3600;
              int minuto = ((sumasegundos)-(hora * 3600))/60 ;
              int segundo = (sumasegundos-(((hora * 3600) + (minuto * 60)))) ;
              System.out.println("hora sum: " + hora);
              System.out.println("minuto sum: " + minuto);
              System.out.println("segundo sum: " + segundo);
      }   
      
      
      void restatiempo(Tiempo otrotiempo) {
          
          
            System.out.println(otrotiempo.getdevueltasegundos());
             System.out.println(this.getdevueltasegundos());//hace referencia al objeto actual
              System.out.println(otrotiempo.getdevueltasegundos()+ this.getdevueltasegundos());
              int restasegundos = otrotiempo.getdevueltasegundos()- this.getdevueltasegundos();
              int hora = restasegundos /3600;
              int minuto = ((restasegundos)-(hora * 3600))/60 ;
              int segundo = (restasegundos-(((hora * 3600) + (minuto * 60)))) ;
              System.out.println("hora res: " + hora);
              System.out.println("minuto res: " + minuto);
              System.out.println("segundo res: " + segundo);
      }    
      
      
      
      //toString
      
      public String toString() {
    
			return this.hora + " horas " + this.minuto + " minutos " + this.segundo + " segundos ";
  
		}     
        
        
}
