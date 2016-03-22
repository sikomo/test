package test;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {

		//Dépendance Version1

		O1D o1 = new O1D();
		o1.methode01();

		System.out.println("a = " + o1.getA());

		//Dépendance Version2
		O2D o2 = new O2D(200);

		o1.methodeO1(o2);
		System.out.println("a = " + o1.getA());

		//Association (= Agregatgion en Java)
		O2A unObjet2 = new O2A();
		O1A unObjet1 = new O1A(unObjet2); // on passe dans le constructeur de l’objet O1 le référent de l’objet O2

		unObjet1.jeTravaillePourO1(); // un premier message envoyé par le main à l’objet de classe O1 en déclenchera un autre vers un objet de classe O2

		// Composition
		O3C[] lesObjets3 = new O3C[10000];
		for (int i=0; i<10000; i++){
			lesObjets3[i] = new O3C();
			O1C unObjet1C = new O1C(lesObjets3[i]); // On passe ici le référent de l'objet O3 à l'objet O1
			unObjet1C.jeTravaillePourO1();
			unObjet1C = null; /* Par cette instruction, on cherche à se débarasser de l’objet unObjet1, mais elle n’est pas nécessaire */
			System.gc();
		}		
	}
}
