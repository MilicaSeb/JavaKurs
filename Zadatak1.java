package Predavanje1;
import java.util.Random;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Unesite broj ovde: ");  
		int inputNumber = scanner.nextInt();
		
		Random random = new Random();
		int randomNumber = random.nextInt(50) + 1;
		
		if (inputNumber == randomNumber) {
			System.out.println("Neverovatno! Pogodili ste tačan broj!");
		}else if((inputNumber-randomNumber)<=5 || (randomNumber-inputNumber)<=5) {
			System.out.println("Dobar pokušaj, bili ste jako blizu!");
		}else {
			System.out.println("Više sreće sledeći put...");
		}
		scanner.close();

	}

}
