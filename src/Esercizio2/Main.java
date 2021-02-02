package Esercizio2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Articolo[] articoli = new Articolo[3];

		Articolo articolo1 = new Articolo();
		Articolo articolo2 = new Articolo();
		Articolo articolo3 = new Articolo();

		CreaArticolo.crea(articolo1, 0);
		CreaArticolo.crea(articolo2, 1);
		CreaArticolo.crea(articolo3, 2);

		articoli[0] = articolo1;
		articoli[1] = articolo2;
		articoli[2] = articolo3;

		Arrays.sort(articoli);
		System.out.println("L'id dell'articolo è : " + articoli[2].getId());
		System.out.println("Il codice dell'articolo è : " + articoli[2].getCodice());
		System.out.println("La descrizione dell'articolo è : " + articoli[2].getDescrizione());
		System.out.println("La quantità dell'articolo è : " + articoli[2].getQuantità());

	}
}
