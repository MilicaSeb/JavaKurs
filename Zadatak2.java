package predavanje2;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Unesite ukupan broj studenata: ");
		int n = scan.nextInt();
		scan.nextLine();
		String student;
		int poeni;
		int brojIstihPoena = 1;
		int maxPoeni = 0;
		int maxPoeni2 = 0;
		String maxStudent= "";
		
		for (int i=0; i<n; i++) {
			System.out.println("Unesite ime studenta: ");
			student = scan.nextLine();
			
			System.out.println("Unesite broj poena za " + student + ":");
			poeni = scan.nextInt();
			scan.nextLine();
			
			if(poeni > maxPoeni) {
				maxStudent= student;
				maxPoeni = poeni;
				if(maxPoeni != maxPoeni2)
					brojIstihPoena = 1; //vraca vrednost na 1 za slucaj da je prethodni maximalni iznos prevazidjen
			} else if (poeni == maxPoeni) {
				maxPoeni2 = maxPoeni;
				brojIstihPoena++; //broji koliko puta je trenutni maximalni iznos poena ostvaren
			}
		}
		if (maxPoeni>maxPoeni2) {
		System.out.println("Najbolji student je " + maxStudent + " sa "+ maxPoeni + " poena.");

	}else {
		System.out.println("Postoje " + brojIstihPoena + " studenta sa najvecim brojem poena: "+ maxPoeni + ".");
	}
		scan.close();

  }

}