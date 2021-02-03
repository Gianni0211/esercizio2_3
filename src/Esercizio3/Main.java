package Esercizio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Esercizio2.Articolo;
import Esercizio2.CreaArticolo;

public class Main {

	public static void main(String[] args) throws IOException {
		String file = "src/articoli.csv";

		try {

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			String[] art;

			Map<String, Articolo> articoli = new HashMap<String, Articolo>();
			while ((line = br.readLine()) != null) {
				art = line.split(";");
				Articolo articolo = new Articolo();
				articolo.setId(Integer.parseInt(art[0]));
				articolo.setCodice(art[1]);
				articolo.setDescrizione(art[2]);
				articolo.setQuantita(Integer.parseInt(art[3]));
				articoli.put(articolo.getCodice(), articolo);

				

			}
			CreaArticolo artCreator = new CreaArticolo();
			Articolo articolo = artCreator.crea(0);
			articoli.put(articolo.getCodice(),articolo);
			FileWriter csvWriter = new FileWriter("nuovi-articoli.csv");

			for (Articolo a : articoli.values()) {
				System.out.println("Id: " + a.getId() + " Codice: " + a.getCodice() + " Descrizione: "
						+ a.getDescrizione() + " Quantita: " + a.getQuantita());

				csvWriter.append(String.valueOf(a.getId()));
				csvWriter.append(";");
				csvWriter.append(a.getCodice());
				csvWriter.append(";");
				csvWriter.append(a.getDescrizione());
				csvWriter.append(";");
				csvWriter.append(String.valueOf(a.getQuantita()));
				csvWriter.append(String.join(","));
				csvWriter.append("\n");

			}
			csvWriter.flush();
			csvWriter.close();

			Scanner scanner = new Scanner(System.in);
			System.out.println("Cerca un articolo inserendo il suo codice");

			String codiceDaUtente = scanner.nextLine();
			if (articoli.get(codiceDaUtente) == null) {
				System.out.println("L'articolo non esiste");
				System.out.println("Inserisci un nuovo codice");

				codiceDaUtente = scanner.nextLine();
			}

			Articolo res = articoli.get(codiceDaUtente);
			System.out.println("ID: " + res.getId() + " Codice: " + res.getCodice() + " Descrizione: "
					+ res.getDescrizione() + " Quantità: " + res.getQuantita());
			scanner.close();

			br.close();

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
