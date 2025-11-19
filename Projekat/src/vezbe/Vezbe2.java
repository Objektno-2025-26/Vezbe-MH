package vezbe;

import java.util.Scanner;

public class Vezbe2 {

	public static void main(String[] args) {
//		Vezba 1
		int broj = 20;
		double decimalniBroj = 20.50;
		String tekst = "Ovo je nas prvi string u Javi";
		
//		System.out.println("Broj: " + broj + " ,decimalni broj: " + decimalniBroj
//				+ " ,tekst: " + tekst);
		
//		System.out.println(String.format("Broj: %s\nDecimalni broj: %s\nTekst: %s",
//				broj, decimalniBroj, tekst));

//		Zadatak 1
		int kolicina = 12;
		double cenaProizvoda = 80.99;
		double cenaBezPDV = kolicina*cenaProizvoda;
		double cenaPDV = cenaBezPDV + cenaBezPDV*0.2;
		
//		System.out.println(String.format
//				("Vrednost %s proizvoda jedinicne cene %s bez PDV-a iznosi: %s"
//						+ " a sa PDV-om: %s", kolicina, cenaProizvoda, 
//						Math.round(cenaBezPDV)
//						,Math.round(cenaPDV)));
		
		
//		Vezba 2
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Unesite celobrojnu vrednost");
//		int vrednost = Integer.valueOf(scanner.nextLine());
//		if(vrednost %2 == 0) {
//			System.out.println(String.format("Broj: %s je paran", vrednost));
//		}else {
//			System.out.println(String.format("Broj: %s je neparan", vrednost));
//		}
		
//		Zadatak 2
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj godina");
		int godine = Integer.valueOf(scanner.nextLine());
		if(godine > 0 && godine <=12) {
			System.out.println("Dete");
		}else if(godine > 12 && godine <=19) {
			System.out.println("Tinejdzer");
		}else if(godine > 19 && godine < 65) {
			System.out.println("Odrasla osoba");
		}
		else {
			System.out.println("Starija osoba");
		}
	}

}
