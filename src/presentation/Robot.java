package presentation;

import java.util.Hashtable;
import java.util.Scanner;


public class Robot {
	static Scanner keyb = new Scanner(System.in);

	public static void main(String[] args) {		
		String[][] carte; //La carte		
		Hashtable<String, Integer[]> dicoRobot = new Hashtable<String, Integer[]>();
		Hashtable<String, Integer[]> dicoCube = new Hashtable<String, Integer[]>();
		
		Hashtable<String, Integer[]> dicoRobot2 = new Hashtable<String, Integer[]>(){
			{
				put("robot0", new Integer[]{9,9});
				put("robot1", new Integer[]{8,3});
			}
		};

		//-------------------------------- TESTS FONCTIONS -------------------------------------\\
		carte = initialiserJeu(dicoRobot, dicoCube);
		
		Integer[] positionRobot = donnerPositionPiece(dicoRobot, "robot0");		
		System.out.println("Le robot " + "robot0" + " se trouve en : (" + positionRobot[0] + "," + positionRobot[1] + ")");
		
		


		//-------------------------------- TESTS FONCTIONS -------------------------------------\\

	}//main


	static public String[][] initialiserJeu(Hashtable<String, Integer[]> dicoR, Hashtable<String, Integer[]> dicoC){
		String[][] carte = creerCarte();		
		dicoC = creerEtPlacerPiece(carte, dicoC, "cube"); //= est inutile puisque passage par référence, voir ligne suivante.
		creerEtPlacerPiece(carte, dicoR, "robot");
		return carte;
	}

	static public String[][] creerCarte(){
		System.out.println("Veuillez configurer les dimensions de la carte : ");
		System.out.print("largeur  : ");
		int largeur = keyb.nextInt();
		System.out.print("longueur : ");
		int longueur = keyb.nextInt();
		return new String[largeur][longueur];
	}	

	static public Hashtable<String, Integer[]> creerEtPlacerPiece(String[][] carte, Hashtable<String, Integer[]> dicoPiece, String typePiece){
		//dicoPiece = new Hashtable<String, Integer[]>(); // Attention, ceci crée un nouvel objet et le programme ne fonctionne plus !
		System.out.print("Nombre de " + typePiece + " sur la carte : ");
		int nombrePiece = keyb.nextInt();
		for (int i = 0; i < nombrePiece; i++){
			System.out.println("Veuillez donner la position du " + (typePiece + i) + " : ");			
			System.out.print("x : ");
			int x = keyb.nextInt();
			System.out.print("y : ");
			int y = keyb.nextInt();
			dicoPiece.put((typePiece + i), new Integer[]{x,y});
			carte[x][y] = typePiece + i;	
		}		
		return dicoPiece; // ici aussi c'est inutile, car passage par référence
	}	

	static public void deplacerRobot(String[][] carte, String robot, String direction){

	}	

	static public Integer[] donnerPositionPiece(Hashtable<String, Integer[]> dicoPiece, String piece){		
		return dicoPiece.get(piece);
	}

	static public boolean validiterMouvementRobot(String direction){
		return false;
	}

}//class
