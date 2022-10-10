package com.soprasteria.javainheritanceshop.prodotto.impl;

import com.soprasteria.javainheritanceshop.prodotto.Prodotto;

public class Televisore extends Prodotto {

	private double dimensionePollici;
	private boolean smart;

	public Televisore(int codice, String nome, String marca, double prezzo, 
			double iva, double dimensionePollici, boolean smart) {
		super(codice, nome, marca, prezzo, iva);
		this.dimensionePollici = dimensionePollici;
		this.smart = smart;
	}

	public double getDimensionePollici() {
		return dimensionePollici;
	}

	public boolean isSmart() {
		return smart;
	}

}
