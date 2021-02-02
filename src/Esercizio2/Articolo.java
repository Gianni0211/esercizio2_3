package Esercizio2;

public class Articolo implements Comparable<Articolo> {

	private int id;
	private String codice;
	private String descrizione;
	private int quantità;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public int createId(int index) {
		return index + 1;
	}

	public int compareTo(Articolo compareArticolo) {

		int compareQuantity = ((Articolo) compareArticolo).getQuantità();

		// ascending order
		return this.quantità - compareQuantity;

		// descending order
		// return compareQuantity - this.quantity;

	}
}
