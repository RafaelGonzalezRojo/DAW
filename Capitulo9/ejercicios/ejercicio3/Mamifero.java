public class Mamifero extends Animal{
	protected String madre="anonima";
	protected int mesesgestacion=0;
  
	public Mamifero (Sexo s) {
		super(s);
	}
	
	public Mamifero(Sexo s,String m){
		super(s);
		madre = m;
	}
	
  public Mamifero(){
		super();
	
	}
  	public int getGestacion() {
		return mesesgestacion;
	}
  
  
	public String getMadre() {
		return madre;
	}
  
	public String toString() {
		return "Madre: " + this.madre + "\n"
		+ super.toString();
	}
	/**
	* Hace que el animal amantar.
	*/
	public void amamantar() {
		System.out.println("glup glup glup");
	}
	
	public void cuidardelbebe() {
		System.out.println("ea ea ea");
	}
	
	public void parto() {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAA!!!! la cosa mas gore de mi vida");
	}
	
}
