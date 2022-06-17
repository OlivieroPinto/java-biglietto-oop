package biglietto.treno.jana60;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int eta, km;
		do {
			System.out.println("Benvenuto alla biglietteria, inserisci la tua etá");
			eta = Integer.parseInt(scan.nextLine());
			if (eta < 1)
				System.out.println("etá non valida");
		} while (eta < 1);

		System.out.println("Inserisci km da percorrere");
		km = Integer.parseInt(scan.nextLine());
		Biglietteria t = new Biglietteria(eta, km);
		System.out.println(t.toString());
		scan.close();

	}
}