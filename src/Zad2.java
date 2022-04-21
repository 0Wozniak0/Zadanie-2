class ubrania{
	int cena_w_Euro;
	double kurs_EURO;
	String rodzaj;
	String marka;
	String rozmiar;
	
	double cena_w_EU()
    {
        return cena_w_Euro*kurs_EURO ;
    }
	
}

public class Zad2 {

	public static void main(String[] args) {
	ubrania ubr1=new ubrania();
	ubrania ubr2=new ubrania();
	ubr1.cena_w_Euro=20;
	ubr1.kurs_EURO=4.65;
	ubr1.rodzaj="koszulka";
	ubr1.marka="Lacoste";
	ubr1.rozmiar="L";
	System.out.println("Cena ubranuia 1 w Z³otówkach:"+ubr1.cena_w_EU()+"z³");
	ubr2.cena_w_Euro=30;
	ubr2.kurs_EURO=4.65;
	ubr2.rodzaj="bluza";
	ubr2.marka="Adidas";
	ubr2.rozmiar="M";
    System.out.println("Cena ubrania 2 w Z³otowkach:"+ubr2.cena_w_EU()+"z³");
	}

}
