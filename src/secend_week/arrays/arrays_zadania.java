package secend_week.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class arrays_zadania {
    public static void main(String[] args) {
        System.out.println("Zadanie 1\n");
        Character[] array1={'v','r','a','z','l','t','q','o','n','3'};
        Arrays.sort(array1);
        System.out.println("Posortowane rosnąco: "+Arrays.toString(array1));

        System.out.println("\n\nZadanie 2");
        String[] aray2={"siemanko","witam","w","mojej","kuchni","kuchnia","wita","moje","siemanko","."};
        Arrays.sort(aray2, Collections.reverseOrder());
        System.out.println("Kolejnosc majeląca: "+Arrays.toString(aray2));

        System.out.println("\n\nZadanie 3");
        String[] imie={"Pimpek","Kropka","Brudas"};
        Random rand = new Random();
        int nazwa=rand.nextInt(3);
        System.out.println("Nowe imię dla psa to: "+imie[nazwa]);

        System.out.println("\n\nZadanie 4");
        String[] jedzenie={"Pizza","BigMak","Kubełek KFC dla czterech osób","Kebab","Zinger","z 3 hamburgery z frytkami","najlepiej to wszytko po co się oszczędzać"};
        int ile= jedzenie.length;


        for(int i=0; i<3; i++) {
            int jakie = rand.nextInt(ile);
            if(i==0)System.out.print("Na śniadanie zjem: " + jedzenie[jakie]);
            if(i==1) System.out.print(", a na obiadek: "+jedzenie[jakie]);
            if(i==2) System.out.print(", a na kolacje: "+jedzenie[jakie]);
        }

        System.out.println("\n\n\nZadanie 5");
        Integer[] liczby={345,5462,3456,23,53,-123,435,23,3,-346,33,-94,0,2,6,8643,30,12,578,-1};
        System.out.println("Liczby przed zamianą: "+Arrays.toString(liczby));
        Arrays.sort(liczby,10,20);
        Arrays.sort(liczby,0,9,Collections.reverseOrder());
        System.out.println("Liczby po zamianianie: "+Arrays.toString(liczby));



    }

}
