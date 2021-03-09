package third_week.pl.praktyki.java.zadania_0803.zadania;

import third_week.pl.praktyki.java.zadania_0803.klasy.liczby;

import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        new liczby();
        Scanner skaner= new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba= skaner.nextInt();
        System.out.println("Pierwsiatek z "+liczba+" to: "+ liczby.pierwistkowanie(liczba));
    }


}