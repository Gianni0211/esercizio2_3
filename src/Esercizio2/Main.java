package Esercizio2;

public class Main {

	public static void main(String[] args) {

		Articolo[] articoli = new Articolo[3];
		CreaArticolo articoloCreator = new CreaArticolo();

		for (int i = 0; i < articoli.length; i++) {
			Articolo art = articoloCreator.crea(i);

			articoli[i] = art;
		}

		int maxQnt = articoli[0].getQuantita();
		for (Articolo art : articoli) {
			while (maxQnt < art.getQuantita()) {
				maxQnt = art.getQuantita();

			}

		}

		for (int i = 0; i < articoli.length; i++) {
			if (maxQnt == articoli[i].getQuantita()) {
				System.out.println("Id: " + articoli[i].getId() + " Codice: " + articoli[i].getCodice()
						+ " Descrizione " + articoli[i].getDescrizione() + " Quantita " + articoli[i].getQuantita());
			}
		}

	}
}
