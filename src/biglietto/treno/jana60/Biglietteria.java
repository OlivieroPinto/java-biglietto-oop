package biglietto.treno.jana60;

import java.text.DecimalFormat;

public class Biglietteria {
	private double prezzoKm = 0.21, scontoGiovane = 0.2, scontoVecchio = 0.4;
	private int eta, km, giovane = 18, vecchio = 65;
	DecimalFormat f = new DecimalFormat("#.## €");

	public Biglietteria(int eta, int km) {
		super();
		this.eta = eta;
		this.km = km;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double calcoloSconto() {
		double calcoloSconto = 0;
		double prezzo = km * prezzoKm;
		if (eta < giovane) {
			return calcoloSconto = prezzo - (prezzo * scontoGiovane);
		} else if (eta >= vecchio)
			return calcoloSconto = prezzo - (prezzo * scontoVecchio);
		else
			return prezzo;
	}

	public String prezzoStringa() {
		return f.format(calcoloSconto());
	}

	public String toString() {
		String stringa = "";
		if (eta < giovane)
			stringa += "hai diritto allo sconto per i giovani";
		else if (eta >= vecchio)
			stringa += "hai diritto allo sconto over 65";
		else
			stringa += "non hai diritto allo sconto";
		stringa += "\n il costo del biglietto é di " + prezzoStringa();
		return stringa;

	}
}
