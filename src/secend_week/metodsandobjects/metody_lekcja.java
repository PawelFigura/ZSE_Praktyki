package secend_week.metodsandobjects;

import java.util.Scanner;

public class metody_lekcja {

    static int addNumbers(int numer1, int number2, int number3){
        return numer1+number2+number3;
    }

    static String getName(){
        return "Norbert Gierczak";
    }

    static void printSomething(){
        System.out.println("\nPogO");
    }

    static void printSomethingIfNumberIsBig (int number){
        if (number<10){
            return;
        }
        System.out.println("Number is soooooo big");
    }

    static boolean islegal (int age){
        return age>= 17;
    }

    public static void main(String[] args) {
        System.out.println("Wywoływanie metody dodawania: ");
        int suma =addNumbers(3,6,8);
        System.out.println(suma);

        System.out.println("\nPrzykładowe imię: "+getName());

        printSomething();

        System.out.print("Podaj liczbe: ");
        Scanner skaner=new Scanner(System.in);
        int liczba= skaner.nextInt();
        printSomethingIfNumberIsBig(liczba);

        int age = 18;
        boolean result =islegal(age);
        System.out.println(result);

    }

}
