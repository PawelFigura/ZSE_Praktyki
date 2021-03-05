package secend_week.ćwiczenia;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        osoba Norbert =new osoba();
        Norbert.name ="Norbert";
        Norbert.wiek=23;
        Norbert.matura=false;
        Norbert.zarobki=2300;

        osoba Friz =new osoba();
        Friz.name="Friz";
        Friz.wiek=23;
        Friz.matura=true;
        Friz.wyksztalcenieWyzsze=false;
        Friz.zarobki=100200;

        Friz.przedstawSie(false);
        Norbert.przedstawSie(false);
        Friz.przedstawSie(true);

        int ile=osoba.ileRazy();
        System.out.println("Przedstawiło się: "+ile+" osób");

        osoba os1 = new osoba();

        Scanner skaner=new Scanner(System.in);
        System.out.println("\n\nDodwanie nowej osoby: ");
        System.out.println("########################");
        System.out.print("Podaj imie: ");
        String name=skaner.nextLine();
        os1.name=name;
        System.out.print("Podaj wiek: ");
        int wiek = skaner.nextInt();
        os1.wiek=wiek;

        System.out.print("Podaj zarobki na miesiąc: ");
        int zarobki= skaner.nextInt();
        os1.zarobki=zarobki;

        os1.przedstawSie(true);
        ile = osoba.ileRazy();
        System.out.println(ile);


    }
}
