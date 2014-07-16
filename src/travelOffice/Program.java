package travelOffice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		boolean p = true;
		while (p) {
			System.out.println("Wybierz opcje:");
			System.out.println("1-Dodaj Klienta");
			System.out.println("2-Dodaj wycieczke");
			System.out.println("3-Wyœwietl klientów");
			System.out.println("4-Wyœwietl wycieczki");
			System.out.println("5-Przypisz wycieczkê Klientowi");

			try {
				Scanner odczyt = new Scanner(System.in);
				i = odczyt.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("to nie jest liczba z zakresu");
			}
			switch (i) {
			case 1:
				ListaKlientow x = new ListaKlientow();
				x.dodajKlienta();

				// System.out.println("czy chcesz kontynuowaæ? (");
				// Scanner decyzja = new Scanner(System.in);
				// String g = decyzja.next();
				//
				// p=false;
				break;
			case 2:
				System.out.println("wybrales" + i);
				p = false;
				break;
			case 3:
				ListaKlientow x3 = new ListaKlientow();
				x3.wyswietlKlientow();
///*				System.out.println("wybrales" + i);
//				p = false;*/
				break;
			case 4:
				System.out.println("wybrales" + i);
				p = false;
				break;
			case 5:
				System.out.println("wybrales" + i);
				p = false;
				break;
			default:
				System.out.println("Nie ma tej funkcji. Powtórz wybór");

				break;
			}
		}
	}
}
