package test;

public class O2C {

	private int unAttribut;
	private double unAutreAttibut;
	public O2C() {}
	public void jeTravaillePourO2() {
		System.out.println("Je suis une instance d'O2 " +
				"au service de toutes les classes");
	}
	protected void finalize(){
		System.out.println("aaahhhh... un Objet O2 se meurt ....");
	}

}
