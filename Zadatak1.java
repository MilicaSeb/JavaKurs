package predavanje2;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Upisite vrednost prvog broja: ");
		int a = scan.nextInt();
		
		System.out.println("Upisite vrednost drugog broja: ");
		int b = scan.nextInt();
		
		int i = a;
		
		while (i<=b) {
			if(i % 2== 0) {
			System.out.println(i);
			i++;	
		}
			i++;

	}
		scan.close();
}
	}


