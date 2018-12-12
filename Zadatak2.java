package Predavanje1;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Unesite prvi broj: ");  
		int n1 = scanner.nextInt();
		
		System.out.print("Unesite drugi broj: ");  
		int n2 = scanner.nextInt();
		
		System.out.print("Unesite kod operacije koju zelite: ");  
		String kod  = scanner.next();
		
		switch(kod) {
		case "s": 
			System.out.println("Vas rezultat je:" + n1+n2);
		break;
		case "o": 
			System.out.println("Vas rezultat je:" + (n1-n2));
			break;
		case "m": 
			System.out.println("Vas rezultat je:" + n1*n2);
			break;
		case "d": 
			if (n2 ==0) {
				System.out.println("Deljenje nulom nije dozvoljeno");
			}else {
			System.out.println("Vas rezultat je:" + (double) n1/n2);
			break;
		}
		scanner.close();

	}

	}
	}
