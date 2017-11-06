package vraag1;

import java.util.Scanner;

public class vraag1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard2 = new Scanner(System.in);

		String[] regen = new String[7];
		int[] temperatuur = new int[7];
		int aantalDagen = 0;

		for (int teller = 0; teller < 7; teller++) {

			System.out.println("Geef regen in");
			regen[teller] = keyboard2.next();

			if (regen[teller].equals("overvloed")) {
				break;
			}

			System.out.println("Geef temperatuur in");
			temperatuur[teller] = keyboard2.nextInt();

			// aantal ingegeven dagen bijhouden; vb. aantaldagen = 4 => vijfdedag overvloed
			aantalDagen++;
		}

		System.out.println("dag\ttemperatuur\tneerslag");
		for (int i = 1; i <= aantalDagen; i++) {
			System.out.println(i + "\t" + temperatuur[i - 1] + "\t\t" + regen[i - 1]);
		}

		if (aantalDagen < 7) {
			System.out.println("We blijven thuis");
		} else {
			// absurt hoge temperatuur
			int laagsteTemperatuur = 1000;
			for (int i = 0; i < 7; i++) {
				if (temperatuur[i] < laagsteTemperatuur) {
					laagsteTemperatuur = temperatuur[i];
				}
			}

			int som = 0;
			for (int i = 0; i < 7; i++) {
				som = +temperatuur[i];
			}

			double gemiddeldeTemperatuur = som / temperatuur.length;

			boolean veelIngegeven = false;

			for (int i = 0; i < 7; i++) {
				if (regen[i].equals("veel")) {
					veelIngegeven = true;
				}
			}

			if (laagsteTemperatuur < 15 || veelIngegeven == true || laagsteTemperatuur < (gemiddeldeTemperatuur * 0.20)) {
				System.out.println("we gaan op daguitstap");
			} else {
				System.out.println("we gaan op tweedaagse");
			}

		}

		keyboard2.close();
	}

}
