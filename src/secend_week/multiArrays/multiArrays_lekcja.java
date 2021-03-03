package secend_week.multiArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class multiArrays_lekcja {
    public static void main(String[] args) {

        int[][] twoArray = new int[10][20];//10*20 elementów w tej tablicy
        int[][][] threeArray = new int[5][10][20];//5*10*20 elementów

        twoArray[0][0]=1;
        System.out.println("twoArray to: "+twoArray[0][0]);

        int [][] aray2=new int[10][10];
        int value =0;
        for(int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                aray2[i][j]=value;
                value=value+2;
                System.out.print(aray2[i][j]+"\t");
            }
            System.out.println();
        }
        int[][][] array3 =new int[3][3][3];
        int wartosc=1;
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                for(int n=0; n<3; n++){
                    array3[i][j][n]=wartosc;
                    wartosc +=3;
                    System.out.print("["+i+"] ["+j+"] ["+n+"] = "+array3[i][j][n]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Wypisytanie tablicy: ");
        String[] owoce =new String[3];
        owoce[0]= "Mango";
        owoce[1]="Banan";
        owoce[2]="Smoczy owoc";
        System.out.println(Arrays.toString(owoce));
        System.out.println(owoce[0]+" "+owoce[1]+" "+owoce[2]);

        System.out.println("Wypisywanie listy: ");
        ArrayList<String> lista_owoce=new ArrayList<>();
        lista_owoce.add("jablko");
        lista_owoce.add("Banan");
        lista_owoce.add("Smoczy owoc");
        System.out.println(lista_owoce);

        ArrayList<String> lista_oowce2=new ArrayList<>();
        lista_oowce2.add("Truskawka");
        lista_oowce2.add("Porzeczka");
        lista_oowce2.add("Banan");
        System.out.println(lista_oowce2);

        //Dodawanie nowego objeku
        lista_oowce2.add(1,"Marakuja");
        System.out.println(lista_oowce2);

        //uswanie z listy
        lista_oowce2.remove("Porzeczka");
        System.out.println(lista_oowce2);
        lista_oowce2.remove(0);
        System.out.println(lista_oowce2);

        //nadpisywanie
        lista_oowce2.set(1, "Arbuz");
        System.out.println(lista_oowce2);

        //sortowanie
        Collections.sort(lista_oowce2);
        System.out.println(lista_oowce2);

        //czyszenie listy





    }
}
