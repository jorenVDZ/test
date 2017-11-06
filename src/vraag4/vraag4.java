package vraag4;

import java.util.Random;
import java.util.Scanner;

public class vraag4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		int[] getallen;
		int som = 0;
		int gemiddelde;

		System.out.println("Geef het aantal getallen dat random zal berekend worden:");
		int aantalRandom = keyboard.nextInt();

		while (aantalRandom < 1) {
			System.out.println("Geef het aantal getallen dat random zal berekend worden:");
			aantalRandom = keyboard.nextInt();
		}

		getallen = new int[aantalRandom];

		System.out.println("Geef het veelvoud op:");
		int veelvoud = keyboard.nextInt();

		while (veelvoud > 9) {
			System.out.println("Geef het veelvoud op:");
			veelvoud = keyboard.nextInt();
		}

		for (int i = 0; i < getallen.length; i++) {
			getallen[i] = randomFill(veelvoud);
		}

		System.out.println("De gegenereerde getallen zijn:");

		for (int k : getallen) {
			System.out.print((k) + " ");
		}
		System.out.println("");
		System.out.println("De array in speciale afdruk:");

		for (int k2 = getallen.length - 1; k2 >= 0; k2--) {
			System.out.print((getallen[k2]) + " ");
		}

		for (int e : getallen) {
			som += (e);
		}

		gemiddelde = som / getallen.length;

		System.out.println("");
		System.out.println("De getallen die kleiner zijn dan het gemiddelde:");

		for (int k3  = 0; k3 < getallen.length; k3++) {
			if (getallen[k3] < gemiddelde) {
				System.out.print((getallen[k3]) + " ");
			}
		}

		keyboard.close();
	}

	public static int randomFill(int veelvoud) {
		Random rand = new Random();
		int randomNum = rand.nextInt(100 - 1) + 1;

		while (randomNum % veelvoud != 0) {
			randomNum = rand.nextInt(100 - 1) + 1;
		}

		return randomNum;
	}

}
