package Esercizio3;

import java.util.Map;
import java.util.Scanner;

import Esercizio2.Articolo;

public class AggiungiArticolo {

	static public void aggiungi(Map<String, Articolo> lista) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci il codice del articolo ");
		String codice = scanner.nextLine();
		System.out.println("Inserisci una descrizione");
		String desc = scanner.nextLine();
		System.out.println("Inserisci una quantità");
		int quant = scanner.nextInt();
		System.out.println("Inserisci un id");
		int id = scanner.nextInt();

		Articolo art = new Articolo();
		art.setCodice(codice);
		art.setDescrizione(desc);
		art.setQuantità(quant);
		art.setId(id);

		lista.put(art.getCodice(), art);

	}
}
