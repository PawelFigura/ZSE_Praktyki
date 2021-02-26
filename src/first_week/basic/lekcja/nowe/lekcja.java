package first_week.basic.lekcja.nowe;

import java.util.Scanner;

public class lekcja {
    public static void main(String[] args) {

        boolean stan =false;
//
//        if(stan){
//            System.out.println("Instrukcja warnukowa IF");
//        }
//        else{
//            System.out.println("Instrukcja warnkowa ELSE");
//        }
//        Scanner skaner = new Scanner(System.in);
//        System.out.print("Podaj swój wiek ");
//
//
//        if(wiek >= 18){
//            System.out.println("Jesteś peolnoletni");
//        }
//        else{
//            System.out.println("Jesteś niepełnoletni");
//        }

//
////        System.out.print("Liczba: ");
////        int liczba=wynik.nextInt();
////
////        if(liczba>=10){
////            System.out.println("Jest to liczba");
////        }
////        else{
////            System.out.println("Jest to cyfra");
////        }
        Scanner skaner = new Scanner(System.in);
//        System.out.println("Porównywanie liczb");
//        System.out.print("Podaj liczbe całkowitą A:");
//        int liczbaA = skaner.nextInt();
//        System.out.print("Podaj liczbe całkowitą B:");
//        int liczbaB = skaner.nextInt();
//
//        if(liczbaA>liczbaB){
//            System.out.println(liczbaA+" Jest wieksza od "+liczbaB);
//        }
//        if(liczbaB>liczbaA){
//            System.out.println(liczbaB+" Jest wieksza od "+liczbaA);
//        }
//        if(liczbaA==liczbaB){
//            System.out.println("Liczby są równe");
//        }
//
//        System.out.println("1. Wybor pierwszy");
//        System.out.println("2. Wybor dwa");
//        System.out.print("Podaj swoj wybor: ");
//        int x =skaner.nextInt();
//        switch(x){
//            case 1:
//                System.out.println("Przypadek pierwszy");
//                break;
//            case 2:
//                System.out.println("Opja druga");
//                break;
//            default:
//                System.out.println("nie wybrano żadnie opcji");
//                break;

            System.out.println("A. Wybor pierwszy");
            System.out.println("B. Wybor dwa");
            System.out.print("Podaj swoj wybor: ");
            char y =skaner.next().charAt(0);
            switch(y){
                case '1':
                    System.out.println("Opja z licza 1");
                    break;
                case '2':
                    System.out.println("Opja z liczba 2");
                case 'A':
                    System.out.println("Przypadek pierwszy");
                    break;
                case 'B':
                    System.out.println("Opja druga");
                    break;
                default:
                    System.out.println("nie wybrano żadnie opcji");
                    break;

        }

    }
}
