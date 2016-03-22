package test;

public class O1A {

	private int unAttribut;
	private int unAutreAttribut ;
	private O2A lienO2; // réalise l’association avec la classe O2

	public O1A(O2A lienO2) /* Le constructeur prévoit de recevoir un référent vers un objet de classe 02 */{
		this.lienO2 = lienO2;
	}
	public void jeTravaillePourO1() {
		lienO2.jeTravaillePourO2() ; /* Voici l’envoi de message */
	}
	public int uneAutreMethode(int a){
		return a;
	}
}

