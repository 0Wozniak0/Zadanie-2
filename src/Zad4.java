class ksiazki{
    String tytul;
    String autor;
    String gatunek;
    int wydanie;
    String[] wydania = new String[10];

    void zapisz_wydania()
    {
        wydania[0] = "--";
        wydania[1] = "pierwsze";
        wydania[2] = "drugie";
        wydania[3] = "trzecie";
        wydania[4] = "czwarte";
        wydania[5] = "piate";
        wydania[6] = "szoste";
        wydania[7] = "siodme";
        wydania[8] = "osme";
        wydania[9] = "dziewiate";        
    }
    
    void informacje ()
    {
        System.out.println("-----Informacje o ksiazce-----");
        System.out.println("Autor: "+ autor);
        System.out.println("Tytul: "+ tytul);
        System.out.println("Gatunek: "+ gatunek);
        System.out.println("Wydanie: "+ wydania[wydanie]);
    }

    
}

public class Zad4{

     public static void main(String []args){
       
       ksiazki book1= new ksiazki();
       book1.zapisz_wydania();   
       
       ksiazki book2= new ksiazki();
       book2.zapisz_wydania();       
        
        
        book1.autor = "Adam Mickiewicz";
        book1.tytul = "Tren VII";
        book1.gatunek = "liryka ¿a³obna";
        book1.wydanie = 6;
        book1.informacje();

        book2.autor = "Ron Rivest";
        book2.tytul = "Klasyka informatyki";
        book2.gatunek = "poradnik";
        book2.wydanie = 2;
        book2.informacje();        

     }

}
