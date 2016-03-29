public class Lagarto extends Animal{
		private String raza;
  
    //contructores
		public Lagarto(Sexo s, String r) {
			super(s);	
			raza = r;
       energia=160;
		}
		public Lagarto (Sexo s) {
			super(s);
			raza = "iguana sudamericana";
        energia=160;
		}
		public Lagarto (String r) {
			super(Sexo.HEMBRA);
			raza = r;
      energia=160;
		}
		
		
		public Lagarto () {
			super(Sexo.HEMBRA);
			raza = "iguana sudamericana";
      energia=160;
		}
    //metodos y toString
		public String toString() {
      
      return super.toString()
			+ "Raza: " + this.raza 
			+ "\n*************************\n";
		}
		/**
		* Hace que el gato maulle.
		*/
		public void camuflarse() {
			System.out.println("estoy camuflado");
		}
		/**
		* Hace que el gato ronronee
		*/
		public void caminardospatas() {
			System.out.println("estoy caminando a dos patas");
		}
		
		public void hibernar() {
			System.out.println("estoy hibernando");
		}
		
	}	
