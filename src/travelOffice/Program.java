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
			System.out.println("3-Wy�wietl klient�w");
			System.out.println("4-Wy�wietl wycieczki");
			System.out.println("5-Przypisz wycieczk� Klientowi");

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

				// System.out.println("czy chcesz kontynuowa�? (");
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
				System.out.println("Nie ma tej funkcji. Powt�rz wyb�r");

				break;
			}
		}
	}
}
