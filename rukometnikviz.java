import java.util.Scanner;

public class kviz {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Kviz o rukometu");
		System.out.println("Molimo te da uneses svoje ime:");
		try {
		
		String imeIgraca= s.next();
		String odgovorIgraca;
		
		int poeniIgraca=0;
		int brojPosjetilaca;
		
		boolean pitanje;
		
		
		System.out.println("Dobrodosao " + imeIgraca + " pocinjemo sa kvizom");
		System.out.println("Trenutno stanje poena " + poeniIgraca);
		System.out.println("Koja zemlja je osvojila evropsko prvenstvo 2024. u Njemackoj?");
		
		while(true) {
		odgovorIgraca=s.next();
		if(odgovorIgraca.equals("Francuska")) {
			System.out.println("To je tacan odgovor");
			poeniIgraca++;
			break;
		}
		System.out.println("Mislim da si se zbunio");
		}
		
		System.out.println("Trenutno imas " + poeniIgraca + " poen");
		System.out.println("Drugo pitanje:Ko je bio najkorisniji igrac prvenstva?");
		while(true) {
			odgovorIgraca=s.next();
			if(odgovorIgraca.equals("Remili")) {
				poeniIgraca++;
				System.out.println("Sjajan odgovor imas " + poeniIgraca + " poena");
				break;
			}
			System.out.println("Trebao bi malo bolje da razmislis");
		}
		
		System.out.println("Dosao si do treceg pitanja");
		System.out.println("Da li je istina da se evropsko igra svake dvije godine ?");
		while(true){
			 pitanje=s.nextBoolean();
			if(pitanje) {
				poeniIgraca++;
			System.out.println("Bravo stigao si do kraja.Osvoijo si sva " + poeniIgraca + " poena!" );
				break;
			}
			System.out.println("Pogresno si informisan");
		}
		}
		
		catch(Exception e){
			System.out.println("Nisi unio vrstu podatka koju si trebao.Počni ispočetka!");
		}
		
			}
			}