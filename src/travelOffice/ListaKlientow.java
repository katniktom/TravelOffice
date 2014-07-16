package travelOffice;

import java.util.Scanner;

public class ListaKlientow {
	int lp = 0;
	int i = 0;
	String listaKlientow[][] = new String[20][3];

	void dodajKlienta() {

		// while (listaKlientow [lp][0].equals(0)) {
		// lp++;
		// }
		lp++;
		Scanner odczyt2 = new Scanner(System.in);
		System.out.println("podaj nazwisko i imie");
		this.listaKlientow[lp][0] = odczyt2.next();
		System.out.println("podaj adres");
		Scanner odczyt3 = new Scanner(System.in);
		this.listaKlientow[lp][1] = odczyt3.next();
		System.out.println("podaj telefon");
		Scanner odczyt4 = new Scanner(System.in);
		this.listaKlientow[lp][2] = odczyt4.next();
		
//		System.out.println("udanie doda³eœ klienta");
//		System.out.println(listaKlientow[lp][0]);
//		System.out.println(listaKlientow[lp][1]);
//		System.out.print(listaKlientow[lp][2] + "\n");
//		System.out.print("");
	
		 System.out.println("udanie doda³eœ klienta");
		 for (int a = 0; a < 3; a++) {
		 System.out.println(listaKlientow[lp][a]);
		 }
	}

	void wyswietlKlientow() {
		for (int a1 = 0; a1 < 2; a1++)

				System.out.print(listaKlientow[a1][0] +" "+ listaKlientow[a1][1] +" "+listaKlientow[a1][2] +" "+" \n");

	}
}
