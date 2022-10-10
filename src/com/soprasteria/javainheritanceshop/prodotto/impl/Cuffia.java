package com.soprasteria.javainheritanceshop.prodotto.impl;

import com.soprasteria.javainheritanceshop.prodotto.Prodotto;

public class Cuffia extends Prodotto {

	private String colore;
	private boolean wireless;
	
	public Cuffia(int codice, String nome, String marca, double prezzo, 
			double iva, String colore, boolean wireless) {
		super(codice, nome, marca, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	}

	public String getColore() {
		return colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	@Override
	public String toString() {
		return "cuffia " + super.toString() + " caratteristiche cuffia: colore: " 
				+ colore + " wireless: " + wireless;
	}

}
