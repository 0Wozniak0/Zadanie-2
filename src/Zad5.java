class pieczywo{
	String nazwa;
	int waga;
	String sk�adniki;
	
	void wyswietl() {
		System.out.println("-----Informacje o pieczywie-----");
        System.out.println("Nazwa: "+ nazwa);
        System.out.println("Waga: "+ waga+"g");
        System.out.println("Sk�adniki: "+ sk�adniki);
	}
}
public class Zad5 {

	public static void main(String[] args) {
		pieczywo pie1=new pieczywo();
		pie1.nazwa="Chleb";
		pie1.waga=1100;
		pie1.sk�adniki="M�ka pszenna,dro�d�e,mas�o,s�l,letnia woda,sezam";
		pie1.wyswietl();
		pieczywo pie2=new pieczywo();
		pie2.nazwa="Chleb pe�noziarnisty";
		pie2.waga=1300;
		pie2.sk�adniki="M�ka pszenna,dro�d�e,mi�d,letnia woda,ziarna s�onecznika i dyni,oliwa nierafinowana";
		pie2.wyswietl();
	}

}
