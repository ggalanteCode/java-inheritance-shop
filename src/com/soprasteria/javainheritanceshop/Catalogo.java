package com.soprasteria.javainheritanceshop;

import java.util.Scanner;

import com.soprasteria.javainheritanceshop.prodotto.Prodotto;
import com.soprasteria.javainheritanceshop.prodotto.impl.Cuffia;
import com.soprasteria.javainheritanceshop.prodotto.impl.Smarphone;
import com.soprasteria.javainheritanceshop.prodotto.impl.Televisore;

public class Catalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int nProdotti;
		Prodotto p;
		
		int codice;
		String nome, marca;
		double prezzo, iva;
		
		System.out.print("Quanti prodotti vuoi valorizzare?: ");
		nProdotti = s.nextInt();
		s.nextLine();
		
		Prodotto[] prodotti = new Prodotto[nProdotti];
		
		int i = 0;
		while(nProdotti > 0) {
			System.out.print("Scegli il prodotto:\ns) smartphone\nt) televisore\nc) cuffie\n>");
			String sProdotto = s.nextLine();
			switch(sProdotto) {
				case "s":
					System.out.print("codice: ");
					codice = s.nextInt();s.nextLine();
					System.out.print("nome: ");
					nome = s.nextLine();
					System.out.print("marca: ");
					marca = s.nextLine();
					System.out.print("prezzo: ");
					prezzo = s.nextDouble();s.nextLine();
					System.out.print("iva: ");
					iva = s.nextDouble();s.nextLine();
					System.out.print("codice IMEI: ");
					long codiceIMEI = s.nextLong();s.nextLine();
					System.out.print("memoria: ");
					double memoria = s.nextDouble(); s.nextLine();
					p = new Smarphone(codice, nome, marca, prezzo, iva, codiceIMEI, memoria);
					prodotti[i] = p;
					i++;
					nProdotti--;
					break;
				case "t":
					System.out.print("codice: ");
					codice = s.nextInt();s.nextLine();
					System.out.print("nome: ");
					nome = s.nextLine();
					System.out.print("marca: ");
					marca = s.nextLine();
					System.out.print("prezzo: ");
					prezzo = s.nextDouble();s.nextLine();
					System.out.print("iva: ");
					iva = s.nextDouble();s.nextLine();
					System.out.print("pollici: ");
					double pollici = s.nextDouble();s.nextLine();
					System.out.print("è smart?(true o false): ");
					boolean smart = s.nextBoolean();s.nextLine();
					p = new Televisore(codice, nome, marca, prezzo, iva, pollici, smart);
					prodotti[i] = p;
					i++;
					nProdotti--;
					break;
				case "c":
					System.out.print("codice: ");
					codice = s.nextInt();s.nextLine();
					System.out.print("nome: ");
					nome = s.nextLine();
					System.out.print("marca: ");
					marca = s.nextLine();
					System.out.print("prezzo: ");
					prezzo = s.nextDouble();s.nextLine();
					System.out.print("iva: ");
					iva = s.nextDouble();s.nextLine();
					System.out.print("colore: ");
					String colore = s.nextLine();
					System.out.print("è wireless?(true o false)");
					boolean wireless = s.nextBoolean();s.nextLine();
					p = new Cuffia(codice, nome, marca, prezzo, iva, colore, wireless);
					prodotti[i] = p;
					i++;
					nProdotti--;
					break;
				default:
					System.err.println("TIPO DI PRODOTTO SCONOSCIUTO: REINSERIRE LA LETTERA");
					break;
			}
		}
	}

}
