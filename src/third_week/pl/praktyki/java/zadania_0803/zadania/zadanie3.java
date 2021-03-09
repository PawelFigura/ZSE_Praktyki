package third_week.pl.praktyki.java.zadania_0803.zadania;

import third_week.pl.praktyki.java.zadania_0803.zadania.chronienie;

import java.util.Scanner;

class zadanie3 extends chronienie {
    public static void main(String[] args) {
        chronienie reszta=new chronienie();
        Scanner skaner = new Scanner(System.in);
        System.out.print("Dzielenik: ");
        int a=skaner.nextInt();
        System.out.print("Podzilena: ");
        int b=skaner.nextInt();
        System.out.println("Reszta z dzielenie wynosi: "+reszta.resztaDzielenie(a,b));
    }

}
