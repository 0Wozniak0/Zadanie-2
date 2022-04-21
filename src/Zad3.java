class filmy{
	String tytul;
	String gatunek_filmowy;
	double cena_biletu;
	int rok_premiery;
	int czas_filmu_w_minutach;
	
	double czas_filmu_w_godzinach() {
		return czas_filmu_w_minutach/60;
	}
	
}
public class Zad3 {

	public static void main(String[] args) {
		
		filmy film1=new filmy();
		film1.tytul="Star Wars 8";
		film1.gatunek_filmowy= "Science Fiction";
		film1.cena_biletu=22.90;
		film1.rok_premiery=2017;
		film1.czas_filmu_w_minutach=159;
		System.out.println("Czas filmu w godzinach:"+film1.czas_filmu_w_godzinach());
		filmy film2=new filmy();
		film2.tytul="Szybcy i wœciekli 9";
		film2.gatunek_filmowy= "Film akcji";
		film2.cena_biletu=20.54;
		film2.rok_premiery=2021;
		film2.czas_filmu_w_minutach=183;
		System.out.println("Czas filmu w godzinach:"+film2.czas_filmu_w_godzinach());

	}

}
