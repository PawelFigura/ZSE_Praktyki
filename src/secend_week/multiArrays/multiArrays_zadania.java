package secend_week.multiArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class multiArrays_zadania {
    public static void main(String[] args) {


        System.out.println("Zadanie 1");
        int[][] array=new int[5][5];
        int wartosc=0;

        for (int i=0; i<5; i++ ){
            for(int j=0; j<5; j++){
                array[i][j]=wartosc;
                wartosc+=5;
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("\n\nZadanie 2");
        int[][][][] array2=new int[3][3][3][3];
        int wartosc2=0;

        for(int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                for(int n=0; n<3; n++){
                    for (int m=0; m<3; m++){
                        array2[i][j][n][m]=wartosc2;
                        wartosc2++;
                        System.out.print("["+i+"] ["+j+"] ["+n+"] ["+m+"] = "+wartosc2+"\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }

        System.out.println("\n\nZadanie 3");
        int[][][][][] array3=new int[2][2][2][2][2];
        int wartosc3=0;

        for(int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                for(int n=0; n<2; n++){
                    for (int m=0; m<2; m++){
                        for(int l=0; l<2; l++) {
                            array3[i][j][n][m][l] = wartosc2;
                            System.out.print("[" + i + "] [" + j + "] [" + n + "] [" + m + "] [" + l + "] = " + wartosc3 + " \t");
                            wartosc3 += 2;
                        }

                        System.out.println();
                    }
                    System.out.println();
                }

            }

        }


        System.out.println("Zadanie 1 (lista)");
        ArrayList<String> listaNaopi =new ArrayList<>();
        listaNaopi.add("Pepsi");
        listaNaopi.add("Cola");
        listaNaopi.add("Mosterek");
        listaNaopi.add("Sok jablkowy");
        System.out.println("Dodawanie z .add="+listaNaopi);

        listaNaopi.add(0, "Lipton");
        listaNaopi.add(2,"Fanta");
        System.out.println("Dddawanie po index'ie: "+listaNaopi);

        listaNaopi.remove("Cola");
        System.out.println("Usuniecie po podaniu obiektu (Cola): "+listaNaopi);
        listaNaopi.remove(2);
        System.out.println("Usuniecie po index'ie (2)"+listaNaopi);

        listaNaopi.set(0,"Nestea");
        System.out.println("Zamina (index'em) liptona na nestea: "+listaNaopi);

        Collections.sort(listaNaopi);
        System.out.println("Posortowana lista:"+listaNaopi);

        listaNaopi.clear();
        System.out.println("Lista po czyszeniu: "+listaNaopi);


        System.out.println("\n\nZadanie 4");
        int[][] array4=new int[2][2];
        int[][] array5=new int[2][2];

        Random random=new Random();
        System.out.println("\nTablica 2x2 pierwsza: ");
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                int warosc4= random.nextInt(100);
                array4[i][j]=warosc4;
                System.out.print(array4[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("\nTablica 2x2 druga");
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                int warosc5= random.nextInt(100);
                array5[i][j]=warosc5;
                System.out.print(array5[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Suma dwoch poprzednich tablic:");

        int[][] array6=new int[2][2];
        for (int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                array6[i][j]=array4[i][j]+array5[i][j];
                System.out.print(array6[i][j]+"\t");
            }
            System.out.println();
        }



    }
}
