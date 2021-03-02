package secend_week.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import static java.util.Arrays.*;

public class arrays_lekcja {
    public static void main(String[] args) {

        int[] array = {2, 45, 56, -23};
        int array2[] = {-7, 6, 52, 2, 100, 0, 77};

        System.out.println("Element pierwszy tablicy 1: " + array[0]);
        System.out.println("Długośc tablicy pierwszej: " + array.length);
        System.out.println("Długośc tabvlicy 2: " + array2.length);

        System.out.println("\n\n Tablica array przed zminą: " + Arrays.toString(array));

        array[0] = 15;
        array[1] = 10;
        array[2] = 5;
        array[3] = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("\n\narray3 = {");
        for (int i = 0; i < array3.length; i++) {
            if (i < (array3.length - 1)) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.println(i + "}");
            }
        }
        Integer[] intArray = {6, 3, 76, 2, 345, 4, 2, 34};
        sort(intArray);
        System.out.println("Sorotowanie tablicy rosnąca: " + Arrays.toString(intArray));

        sort(intArray, Collections.reverseOrder());
        System.out.println("Sorotowanie malejące: " + Arrays.toString(intArray));


        char[] chararrays = {'l', 't', 'j', 'u', 'r'};
        Arrays.sort(chararrays);
        System.out.println("SOrtowanie w porządku ronącym: " + Arrays.toString(chararrays));

        Character[] chararray2 = {'z', '3', 'h', 'j', 'm', 'y'};
        Arrays.sort(chararray2, Collections.reverseOrder());
        System.out.println("SOrtowanie malejące: " + Arrays.toString(chararray2));

//        String stringarray ={"~","Papierz","polak","z","Wadowoc"};
//        Arrays.sort(stringarray);
//        System.out.println("Sortowanie rosnoaco: "+Arrays.toString(stringarray));

        Random rand = new Random();
        System.out.println("\n\n");

        for (int i = 0; i < 18; i++) {
            int rand_int1 = rand.nextInt(10)+1;
            System.out.println("WArtość randomowoa: " + rand_int1);

        }
    }
}
