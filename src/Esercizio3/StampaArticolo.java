package Esercizio3;

import Esercizio2.Articolo;
import java.util.Map;

public class StampaArticolo {

	static public void stampa(Map<String, Articolo> mappa, String codice) {
		if (mappa.get(codice) == null) {
			System.out.println("L'articolo non esiste");
		} else {
			Articolo articolo = mappa.get(codice);

			System.out.println("ID: " + articolo.getId() + " Codice: " + articolo.getCodice() + " Descrizione: "
					+ articolo.getDescrizione() + " Quantità: " + articolo.getQuantità());

		}
	}

}
