public class Canario extends Ave{
		private String raza;
    public int energia=100;
    //contructores
		public Canario (Sexo s, String r) {
			super(s);	
			raza = r;
      energia=80;
		}
		public Canario (Sexo s) {
			super(s);
			raza = "canario tropical";
      energia=80;
		}
		public Canario(String r) {
			super(Sexo.HEMBRA);
			raza = r;
      energia=80;
		}
		
		public Canario () {
			super(Sexo.HEMBRA);
			raza = "canario tropical";
      energia=80;
		}
    //metodos y toString
		public String toString() {
      
      return super.toString()
			+ "Raza: " + this.raza + "\n"
			+ "\n*************************\n";
		}
		/**
		* Hace que el gato maulle.
		*/
		public void canta() {
			System.out.println(" pio poiiiioooo pi pi pi");
		}
		/**
		* Hace que el gato ronronee
		*/
    //@Overrider
		public void vuela() {
			System.out.println("estoy en jaulado");
		}
		
		public void melimpio() {
			System.out.println("que agua tan fresquita");
		}
    
 
    
		
	}	

