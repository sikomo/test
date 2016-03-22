package test;

public class O1C {

	private int unAttribut;
	private int unAutreAttribut;
	private O2C lienO2;
	private O3C lienO3;

	public O1C(O3C lienO3) {
		lienO2 = new O2C(); /* un lien de composition est créé */
		this.lienO3 = lienO3; /* un lien d’agrégation est créé */
	}
	public void jeTravaillePourO1() {
		lienO2.jeTravaillePourO2(); /* un message vers O2 */
		lienO3.jeTravaillePourO3(); /* un message vers O3 */
	}
	public int uneAutreMethode(int a) {
		return a;
	}
	protected void finalize() /* appel de cette méthode quand l’objet est effacé de la mémoire */{
		System.out.println("aaahhhh... un Objet O1 se meurt ...");
	}

}
