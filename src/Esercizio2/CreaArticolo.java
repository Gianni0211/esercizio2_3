package Esercizio2;

import java.util.Scanner;

public class CreaArticolo {

	static public void crea(Articolo art, int ord) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il codice del articolo " + (ord + 1));
		String codice = scanner.nextLine();
		System.out.println("Inserisci una descrizione");
		String desc = scanner.nextLine();
		System.out.println("Inserisci una quantità");
		int quant = scanner.nextInt();

		art.setCodice(codice);
		art.setDescrizione(desc);
		art.setQuantità(quant);
		art.setId(art.createId(ord));

	}
}
