package first_week.zadania_if;

import java.util.Scanner;

public class zadania_if {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        Scanner skaner= new Scanner(System.in);
        System.out.print("Proszę podać liczbę: ");
        int liczba1 = skaner.nextInt();
        if(liczba1>0){
            System.out.println("Liczba wieksza od 0");
        }
        else{
            if(liczba1<0){
                System.out.println("Liczba mniejsa od 0");
            }
            else{
                System.out.println("To jest zero");
            }
        }
        System.out.println("\nZadanie 2");
        System.out.print("Podaj pierwsza liczbe: ");
        int liczba2a = skaner.nextInt();
        System.out.print("Podaj drugą liczbe: ");
        int liczba2b = skaner.nextInt();
        System.out.print("Podaj trzecia liczbe: ");
        int liczba2c = skaner.nextInt();

        if(liczba2a>=liczba2b && liczba2a>=liczba2c){
            System.out.println(liczba2a+" jest najwieksza");
        }
        else {
            if(liczba2b>=liczba2a && liczba2b>=liczba2c){
                System.out.println(liczba2b+" jest najwieksza");
            }
            if(liczba2c>=liczba2b && liczba2c>=liczba2a){
                System.out.println(liczba2c+" jest najwieksza");
            }
        }

        System.out.println("\n Zadanie 3");
        System.out.print("Podaj login: ");
        String login=skaner.next();
        System.out.print("Podaj haslo: ");
        String haslo=skaner.next();
        if(login.equals("admin")&&haslo.equals("tajnehaslo")){
            System.out.println("Witamy");
        }
        else {
            if (login.equals("Jan") && haslo.equals("Kowalski")) {
                System.out.println("Witamy");
            }
            else{
                if(login.equals("Jan")||login.equals("admin")){
                    System.out.println("Nie poprawne haslo");
                }
                else {
                    System.out.println("Użytkownik nie istnieje :(");
                }
            }
        }
        System.out.println("\n Zadanie 4");
        System.out.print("Podaj pierwsza liczbe: ");
        int liczba4a = skaner.nextInt();
        System.out.print("Podaj druga liczbe: ");
        int liczba4b = skaner.nextInt();
        System.out.print("Podaj trzecia liczbe: ");
        int liczba4c = skaner.nextInt();

        if(liczba4a>liczba4b&&liczba4b>liczba4c){
            System.out.println("Kolejnosc malejaca");
        }
        else{
            if(liczba4c>liczba4b&&liczba4b>liczba4a) {
                System.out.println("Kolejnosc rosnaca");
            }
                else{
                    System.out.println("Brak kolejnosci");
                }
        }
        System.out.println("\nZadanie 5");
        System.out.print("Podaj pierwsza liczbe: ");
        float liczba5a= skaner.nextFloat();
        System.out.print("Podaj druga liczbe: ");
        float liczba5b= skaner.nextFloat();
        System.out.print("Co robimy (+,-,*,/)?");
        char znak=skaner.next().charAt(0);
        switch (znak){
            case '+':
                float suma=liczba5a+liczba5b;
                System.out.println("Suma  z "+liczba5a+" oraz "+liczba5b+" to "+suma);
                break;
            case '-':
                float roznica=liczba5a-liczba5b;
                System.out.println("Rożnica  "+liczba5a+" z "+liczba5b+" to "+roznica);
                break;
            case '*':
                float iloczyn=liczba5a*liczba5b;
                System.out.println("Iloczyn  "+liczba5a+" razy "+liczba5b+" to "+iloczyn);
                break;
            case '/':
                float iloraz=liczba5a/liczba5b;
                System.out.println("Iloraz  "+liczba5a+" przez "+liczba5b+" to "+iloraz);
                break;
            default:
                System.out.println("podaj dobry znak");
                break;
        }


    }
}
