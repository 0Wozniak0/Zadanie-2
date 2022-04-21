class malarstwo{
	String tytu³;
	String autor;
	int rok_powstania;
	String technika;
	int cena;
	void wyswietl() {
		System.out.println("-----Informacje o obrazie-----");
        System.out.println("Tytul: "+ tytu³);
        System.out.println("Autor: "+ autor);
        System.out.println("Rok powstania: "+ rok_powstania );
        System.out.println("Technika: "+ technika);
        System.out.println("Cena: "+ cena+"mln €" );
	}
	void wyswietl2() {
		System.out.println("-----Informacje o obrazie-----");
        System.out.println("Tytul: "+ tytu³);
        System.out.println("Autor: "+ autor);
        System.out.println("Rok powstania: "+ rok_powstania );
        System.out.println("Technika: "+ technika);
        System.out.println("Cena: "+ cena+"z³" );
	}
}

public class Zad6 {

	public static void main(String[] args) {
		malarstwo obraz1=new malarstwo();
		obraz1.tytu³="Mona Lisa";
		obraz1.autor="Leonardo da Vinci";
		obraz1.rok_powstania=1503;
		obraz1.technika="Farba olejna";
		obraz1.cena=50;
		obraz1.wyswietl();
		
		malarstwo obraz2=new malarstwo();
		obraz2.tytu³="Z³ota pe³nia";
		obraz2.autor="Mariola Œwigulska";
		obraz2.rok_powstania=2021;
		obraz2.technika="Akryl,p³ócienne";
		obraz2.cena=1560;
		obraz2.wyswietl2();

	}

}
