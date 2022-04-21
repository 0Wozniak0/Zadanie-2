class telefony_komorkowe{
    int ilosc_pamieci;
    String numer_seryjny;
    int rozdzielczoscX;
    int rozdzielczoscY;
    int pojemnosc_baterii;
    
    int ilosc_pikseli()
    {
        return rozdzielczoscX*rozdzielczoscY;
    }
   
}
public class Zad1{

     public static void main(String []args){
        telefony_komorkowe tel1=new telefony_komorkowe();
        telefony_komorkowe tel2=new telefony_komorkowe();
        tel1.ilosc_pamieci=156;
        tel1.numer_seryjny="SvX784";
        tel1.rozdzielczoscX=1920;
        tel1.rozdzielczoscY=1080;
        tel1.pojemnosc_baterii=4800;
        System.out.println("Ilosc pikseli wyswietlacza tel1: "+tel1.ilosc_pikseli());
        
        tel2.ilosc_pamieci=156;
        tel2.numer_seryjny="HJGUYGJH436";
        tel2.rozdzielczoscX=1270;
        tel2.rozdzielczoscY=720;
        tel2.pojemnosc_baterii=5200;
        System.out.println("Ilosc pikseli wyswietlacza tel2: "+tel2.ilosc_pikseli());
        
     }

}