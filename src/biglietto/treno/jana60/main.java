package biglietto.treno.jana60;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int eta, km, numero = 1;
		do {
			do {
				System.out.println("Benvenuto alla biglietteria, inserisci la tua etá");
				eta = scan.nextInt();
				if (eta < 1)
					System.out.println("etá non valida");
			} while (eta < 1);

			System.out.println("Inserisci km da percorrere");
			km = scan.nextInt();
			Biglietteria t = new Biglietteria(eta, km);
			System.out.println(t.toString());
			System.out.println("per continuare digita 1");
			numero = scan.nextInt();
		} while (numero == 1);
		scan.close();
	}
}