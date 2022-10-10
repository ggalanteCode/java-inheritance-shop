package com.soprasteria.javainheritanceshop.prodotto;

public abstract class Prodotto {
	
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;
	
	public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public int getCodice() {
		return codice;
	}

}
