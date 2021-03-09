package third_week.pl.praktyki.java.zadania_0803.zadania;

import java.util.Scanner;

public class zadanie7 {

    public static class Automat{
        protected final int cenaPepsi=11;
        protected int zaplacono= 0;

        public void ileBrakuje(){
            int ile=cenaPepsi-zaplacono;//sprawdzanie ile brakuje bądź ile jest nadmiaru
            if(ile>0)System.out.println("Doplcono: "+ile+"zł");
            if(ile<0){
                int reszta=ile-ile-ile;
                System.out.println("Wydano: "+reszta+"zł reszty");
            }
            ileBrakuje(ile);
        }
        public void ileBrakuje(int ile){
            if(ile+zaplacono==cenaPepsi){
                zaplacono+=ile;
                System.out.println("Zapłacono pomyslnie "+cenaPepsi+ "zł za pepsi!");
            }else{
                zaplacono+=ile;
                System.out.println("Nie udało sie zapłacić");
        }
        }

    }

    public static void main(String[] args) {
        Scanner kasa = new Scanner(System.in);
        Automat automat=new Automat();
        System.out.println("KASA\nPepsi 1.5l cena: "+automat.cenaPepsi+"zł");//cena do zaplaty
        System.out.println("Zaplacono: "+automat.zaplacono+"zł"); //ile zostało już zapłacone
        System.out.print("Zaplac: ");
        int zaplata=kasa.nextInt();//płacenie
        automat.ileBrakuje(zaplata);//sprawdzenie czy sapłacono odpowidnią liczbe
        if(zaplata!=11) {
            System.out.println("Zaplacone: " + automat.zaplacono);// dopłacnie bądź wydanie reszty
            automat.ileBrakuje();//doplata
        }

    }
}
