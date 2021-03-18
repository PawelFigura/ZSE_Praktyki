package projekt.salon;

import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class salon {

    public static String dodaj(){
        Scanner skaner=new Scanner(System.in);
        System.out.print("Podaj markę auta: ");
        String marka=skaner.next();
        System.out.print("Podaj model auto:");
        String model=skaner.next();
        System.out.print("Podaj kolor samochodu: ");
        String kolor=skaner.next();
        System.out.print("Podaj numer rejestracyjny: ");
        String numer=skaner.next();
        String nazwa=marka+" "+model+" "+kolor+" "+numer;
        return nazwa;
    }

    public static void brak(int ile){
        if(ile==0){
            System.out.println("Brak samochodów w spisie *dodawanie aut opcja 1 i 2*");
        }
    }

      public static void main(String[] args) throws InterruptedException {
        Scanner skaner = new Scanner(System.in);
        ArrayList<String> listaAut =new ArrayList<>();
        Character[] usuwanie={'u','s','u','w','a','m','.','.','.'};
        Character[] wyl={'s','h','a','t',' ','d','o','w','n','.','.','.','.','.'};






        for (;;){
            Menu.wyswietl();
            int dl = listaAut.toArray().length;
            try {
                int wybor = skaner.nextInt();

                switch (wybor) {
                   case 1:
                       listaAut.add(dodaj());
                       break;

                   case 2:

                       System.out.print("Podaj index: ");
                       int index = skaner.nextInt();
                       if (index > dl || index < 0) {
                           if (index < 0) System.out.println("Podany index jest za mały");
                           if (index > dl) System.out.println("Podany index jest za duży");
                           Thread.sleep(2000);
                       } else {
                           listaAut.add(index, dodaj());
                       }
                       break;

                   case 3:
                       brak(dl);
                       if (dl != 0) {
                           for (int i = 0; i < dl; i++) {
                               System.out.println("Samochód " + (i + 1) + ":\n" + listaAut.get(i));
                           }
                           System.out.print("\nJaki numer samochodu podminiamy? ");
                           index = skaner.nextInt();
                           if (index <= 0 || index > dl) {
                               System.out.println("Podany samochoód nie istnieje");
                               Thread.sleep(2000);
                           } else {
                               listaAut.set(index - 1, dodaj());
                           }
                       } else {
                           Thread.sleep(2000);
                       }
                       break;

                   case 4:
                       brak(dl);
                       if (dl != 0) {
                           for (int i = 0; i < dl; i++) {
                               System.out.println("Samochód " + (i + 1) + ":\n" + listaAut.get(i));
                           }
                           System.out.print("\nKtóre auto usuwamy?");
                           index = skaner.nextInt();
                           if (index <= 0 || index > dl) {
                               System.out.println("Podany samochoód nie istnieje");
                               Thread.sleep(2000);
                           } else {
                               listaAut.remove(index - 1);
                           }
                       } else Thread.sleep(2000);
                       break;

                   case 5:
                       brak(dl);
                       if (dl != 0) {
                           for (int i = 0; i < dl; i++) {
                               System.out.println("Samochód " + (i + 1) + ":\n" + listaAut.get(i));
                           }
                           System.out.println("\nKtóry samochoód chcesz usunąć? (*marka model kolor NumerRejestracyjny*)");
                           Scanner scanner = new Scanner(System.in);//ogl wiem że 2 raz skaner ale jak nie ma go tu to mi nie czyta tego na początku xD
                           String string = scanner.nextLine();
                           listaAut.remove(string);
                           int noweDl = listaAut.toArray().length;
                           if (noweDl != dl) {
                               System.out.println("Usunięcie sie powiodło");
                           } else System.out.println("Wystąpił błąd");
                                            }
                       Thread.sleep(2000);
                       break;

                   case 6:
                       brak(dl);
                       if (dl != 0) {
                           System.out.println("\nKtóry samochoód chcesz sprawdzić czy jest? (*marka model kolor NumerRejestracyjny*)");
                           Scanner scanner = new Scanner(System.in);//ogl wiem że 2 raz skaner ale jak nie ma go tu to mi nie czyta tego na początku xD
                           String string = scanner.nextLine();
                           for (int i = 0; i>=0&&i < dl; i++) {
                               if (string.equals(listaAut.get(i))) {
                                   System.out.println("jest ");
                                   i=-1000;
                               } if(i+1==dl) {
                                   System.out.println("Nie ma");
                               }
                           }

                       }
                       Thread.sleep(2000);
                       break;
                   case 7:
                       brak(dl);
                       if (dl != 0) {
                           System.out.print("Wybierz rodzaj sortowania: \n[M] Malejąco \n[R] Rosnąco \nRodzaj:");
                           char co = skaner.next().charAt(0);
                           if (co == 'r' || co == 'R') {
                               Collections.sort(listaAut);
                           } else {
                               if (co == 'm' || co == 'M') {
                                   Collections.sort(listaAut);
                                   Collections.reverse(listaAut);
                               } else {
                                   System.out.println("Wpisz odpowiednią litere :)");
                               }
                           }
                       } else Thread.sleep(2000);
                       break;

                       case 8:
                           brak(dl);
                           if (dl != 0) {
                               for (int i = 0; i < dl; i++) {
                                   System.out.println("Samochód " + (i + 1));
                               }
                               System.out.println("Informacje o którym aucie chcesz wyświetlić: ");
                               int jakie = skaner.nextInt();
                               if (jakie <= 0 || jakie > dl) {
                                   System.out.print("Nie ma takiej fury");
                               } else {
                                   System.out.println(listaAut.get(jakie - 1));
                               }
                           }
                           Thread.sleep(2000);
                           break;

                       case 9:
                           brak(dl);
                           if (dl != 0) {
                               System.out.println("Mamy w salonie: " + dl + " aut");
                           }
                           Thread.sleep(2000);
                           break;

                       case 10:
                           listaAut.clear();
                           for (int i = 0; i < 9; i++) {
                               System.out.print(usuwanie[i]);
                               if (i < 6) Thread.sleep(200);
                               if (i > 5) Thread.sleep(800);
                           }
                           break;

                       case 11:
                           brak(dl);
                           for (int i = 0; i < dl; i++) {
                               System.out.println("Samochód " + (i + 1) + ":\n" + listaAut.get(i));
                           }
                           Thread.sleep(5000);
                           break;


                       case 12:
                          for (int i = 0; i < 14; i++) {
                              System.out.print(wyl[i]);
                              if (i < 9) Thread.sleep(250);
                              if (i > 8) Thread.sleep(900);
                          }
                          return;

                       default:
                           System.out.println("Podaj liczbe w zakresie 1-12");
                           Thread.sleep(2000);
                           break;
                                    }

                                } catch (InputMismatchException exception) {
                                    System.out.println("Zły typ zminnych");
                                    return;

                                }
                            }












    }
}

