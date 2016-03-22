//Un programme de komo

package test;

import java.util.Arrays;

public class tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab = {45,30,5,1,3, 2,4,1};
		int ref = 0, indice = 0, tmp = 0; 
		
		for (int i = 0; i < tab.length; i++){
			ref = tab[i];
			indice = i;
			for (int j = i + 1; j < tab.length; j++){
				if (ref > tab[j]) {
					ref = tab[j];
					indice = j;
				}
			}
			tmp = tab[i];
			tab[i] = ref;
			tab[indice] = tmp;			
		}
		System.out.println(Arrays.toString(tab));
	}
}
