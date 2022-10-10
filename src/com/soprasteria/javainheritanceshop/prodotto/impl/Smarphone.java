package com.soprasteria.javainheritanceshop.prodotto.impl;

import com.soprasteria.javainheritanceshop.prodotto.Prodotto;

public class Smarphone extends Prodotto {
	
	private long codiceIMEI;
	private double memoria;
	
	public Smarphone(int codice, String nome, String marca, double prezzo, 
			double iva, long codiceIMEI,double memoria) {
		super(codice, nome, marca, prezzo, iva);
		this.codiceIMEI = codiceIMEI;
		this.memoria = memoria;
	}

	public long getCodiceIMEI() {
		return codiceIMEI;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "smartphone " + super.toString() + " caratteristiche smartphone: codiceIMEI: " 
				+ codiceIMEI + " memoria: " + memoria;
	}
	
}
