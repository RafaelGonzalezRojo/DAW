public class Perro extends Mamifero{
		private String raza;
    private int mesesgestacion;
    //contructores
		public Perro (Sexo s, String r,String m) {
			super(s);	
			raza = r;
			madre = m;
      mesesgestacion = 3;
      energia=200;
		}
		public Perro (Sexo s) {
			super(s);
			raza = "labrador";
      mesesgestacion = 3;
       energia=200;
		}
		public Perro (String r) {
			super(Sexo.HEMBRA);
			raza = r;
      mesesgestacion = 3;
       energia=200;
		}
		
		public Perro (Sexo s,String r) {
			super(s);
			raza = r;
      mesesgestacion = 3;
       energia=200;
		}
		
		public Perro () {
			super(Sexo.HEMBRA);
			raza = "labrador";
      mesesgestacion = 3;
       energia=200;
		}
    //metodos y toString
		public String toString() {
      
      return super.toString()
			+ "Raza: " + this.raza + "\n"
      + "Meses Gestacion: " + this.mesesgestacion
			+ "\n*************************\n";
		}
		/**
		* Hace que el gato maulle.
		*/
		public void ladrar() {
			System.out.println("wauf wauf");
		}
		/**
		* Hace que el gato ronronee
		*/
		public void buscar() {
			System.out.println("niff niff niff, donde estara");
		}
		
		public void marcarterritorio() {
			System.out.println("estoy marcando mi terrirorio");
		}
		
	}	
