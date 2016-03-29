public class Pinguino extends Ave{
		private String raza;
    //contructores
		public Pinguino (Sexo s, String r) {
			super(s);	
			raza = r;
      energia=120;
		}
		public Pinguino (Sexo s) {
			super(s);
			raza = "emperador";
      energia=120;
		}
		public Pinguino(String r) {
			super(Sexo.HEMBRA);
			raza = r;
       energia=120;
		}
		
		public Pinguino() {
			super(Sexo.HEMBRA);
			raza = "emperador";
       energia=120;
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
		public void andatorpemente() {
			System.out.println(" uis que me caigo con cada paso");
		}
		/**
		* Hace que el gato ronronee
		*/
    //@Overrider
		public void vuela() {
			System.out.println("yo no puedo volar, pero nado muy rapido");
		}
		
		public void pesca() {
			System.out.println("que peces tan ricos hay en el mar");
		}
		
	}	
