class malarstwo{
	String tytu�;
	String autor;
	int rok_powstania;
	String technika;
	int cena;
	void wyswietl() {
		System.out.println("-----Informacje o obrazie-----");
        System.out.println("Tytul: "+ tytu�);
        System.out.println("Autor: "+ autor);
        System.out.println("Rok powstania: "+ rok_powstania );
        System.out.println("Technika: "+ technika);
        System.out.println("Cena: "+ cena+"mln �" );
	}
	void wyswietl2() {
		System.out.println("-----Informacje o obrazie-----");
        System.out.println("Tytul: "+ tytu�);
        System.out.println("Autor: "+ autor);
        System.out.println("Rok powstania: "+ rok_powstania );
        System.out.println("Technika: "+ technika);
        System.out.println("Cena: "+ cena+"z�" );
	}
}

public class Zad6 {

	public static void main(String[] args) {
		malarstwo obraz1=new malarstwo();
		obraz1.tytu�="Mona Lisa";
		obraz1.autor="Leonardo da Vinci";
		obraz1.rok_powstania=1503;
		obraz1.technika="Farba olejna";
		obraz1.cena=50;
		obraz1.wyswietl();
		
		malarstwo obraz2=new malarstwo();
		obraz2.tytu�="Z�ota pe�nia";
		obraz2.autor="Mariola �wigulska";
		obraz2.rok_powstania=2021;
		obraz2.technika="Akryl,p��cienne";
		obraz2.cena=1560;
		obraz2.wyswietl2();

	}

}
