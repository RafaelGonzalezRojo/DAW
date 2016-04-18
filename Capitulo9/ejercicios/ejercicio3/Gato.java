
public class Gato extends Mamifero{
		private String raza;
    private int mesesgestacion;
    
		public Gato (Sexo s, String r,String m) {
			super(s);	
			raza = r;
			madre = m;
      mesesgestacion = 2;
      energia=150;
		}
		public Gato (Sexo s) {
			super(s);
			raza = "siamés";
      mesesgestacion = 2;
      energia=150;
		}
		public Gato (String r) {
			super(Sexo.HEMBRA);
			raza = r;
      mesesgestacion = 2;
      energia=150;
		}
		
		public Gato (Sexo s,String r) {
			super(s);
			raza = r;
      mesesgestacion = 2;
      energia=150;
		}
		
		public Gato () {
			super(Sexo.HEMBRA);
			raza = "siamés";
      mesesgestacion = 2;
      energia=150;
		}
		public String toString() {
      
      return super.toString()
			+ "Raza: " + this.raza + "\n"
      + "Meses Gestacion: " + this.mesesgestacion
			+ "\n*************************\n";
		}
		/**
		* Hace que el gato maulle.
		*/
		public void maulla() {
			System.out.println("Miauuuu");
      
		}
		/**
		* Hace que el gato ronronee
		*/
		public void ronronea() {
			System.out.println("mrrrrrr");
		}
		
		public void iralarenero() {
			System.out.println("lo siento necesito un momento a solas...");
		}
   
   
		
	}	
