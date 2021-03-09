package third_week.pl.praktyki.java.zadania_0803.zadania;
import third_week.pl.praktyki.java.zadania_0803.klasy.porownanie;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        porownanie porownanie=new porownanie();
        Scanner skaner=new Scanner(System.in);
        System.out.print("Podaj liczbę a: ");
        int a=skaner.nextInt();
        System.out.print("Podaj liczbe b: ");
        int b=skaner.nextInt();
        System.out.println("Wieksza jest: "+porownanie.dwieLiczb(a,b));
    }
}
