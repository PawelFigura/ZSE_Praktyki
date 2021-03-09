package third_week.pl.praktyki.java.zadania_0803.zadania;

import third_week.pl.praktyki.java.zadania_0803.klasy.uczen;

public class zadanie4 {
    public static void main(String[] args) {
        uczen a=new uczen();
        a.setImieNazwisko("Norbert Gierczak");
        a.setKlasa(1);
        a.setRodzaj('b');
        a.setNumer(12);

        System.out.println(a.getImieNazwisko()+" z klasy "+a.getKlasa()+ a.getRodzaj()+" ma numer "+a.getNumer()+" w dzienniku");
    }
}
