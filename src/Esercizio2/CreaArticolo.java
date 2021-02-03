package Esercizio2;

import java.util.Scanner;

public class CreaArticolo {
	
	

	 public  Articolo crea( int ord) {
		Articolo art = new Articolo();
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println("Inserisci il codice del articolo " + (ord + 1));
		String codice = scanner.nextLine();
		System.out.println("Inserisci una descrizione");
		String desc = scanner.nextLine();
		System.out.println("Inserisci una quantità");
		int quant = scanner.nextInt();

		art.setCodice(codice);
		art.setDescrizione(desc);
		art.setQuantita(quant);
		art.setId(ord + 1);
		
		
		return art;

	}
	 
	 
}
