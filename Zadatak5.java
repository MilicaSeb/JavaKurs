package predavanje2;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak5 {

public static void main(String []args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Unesite duzinu niza: ");
		int n = scan.nextInt();
		
		int [] niz = new int[n];
		int i=0;
		while (i< niz.length) {
			System.out.println("Unesite neku vrednost: ");
			int vrednost = scan.nextInt();
			niz[i] = vrednost;
			
			 i++;
		}	
		Arrays.sort(niz);
		
		System.out.println("Unesite trazeni broj iz niza: ");
		int x = scan.nextInt();
		int pozicija = Arrays.binarySearch(niz, x);
		if(pozicija>0) {
			System.out.println("Broj " + x + " nadjen je na poziciji " + pozicija + " u datom nizu.");
		}else {
			System.out.println("Broj " + x + " nije nadjen u datom nizu.");
		}
		
		int[] noviNiz = Arrays.copyOf(niz, 5);
		System.out.println(Arrays.toString(noviNiz));
}
}