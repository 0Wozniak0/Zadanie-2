class pieczywo{
	String nazwa;
	int waga;
	String sk³adniki;
	
	void wyswietl() {
		System.out.println("-----Informacje o pieczywie-----");
        System.out.println("Nazwa: "+ nazwa);
        System.out.println("Waga: "+ waga+"g");
        System.out.println("Sk³adniki: "+ sk³adniki);
	}
}
public class Zad5 {

	public static void main(String[] args) {
		pieczywo pie1=new pieczywo();
		pie1.nazwa="Chleb";
		pie1.waga=1100;
		pie1.sk³adniki="M¹ka pszenna,dro¿d¿e,mas³o,sól,letnia woda,sezam";
		pie1.wyswietl();
		pieczywo pie2=new pieczywo();
		pie2.nazwa="Chleb pe³noziarnisty";
		pie2.waga=1300;
		pie2.sk³adniki="M¹ka pszenna,dro¿d¿e,miód,letnia woda,ziarna s³onecznika i dyni,oliwa nierafinowana";
		pie2.wyswietl();
	}

}
