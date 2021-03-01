package secend_week.pętle_zadania;

import java.util.Scanner;

public class zadania {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println("\nZadanie 2");
        for (int i = 30; i >= 0; i -= 3) {
            System.out.println(i);
        }
        System.out.println("\nZadanie 3\nMnożenie (pierwsza kolumna i wiersz nie są za X'owane, bo są to mnożniki*)");

        for (int x = 1; x <= 10; x++) {

            for (int y = 1; y <= 10; y++) {
                int iloczyn = x * y;
                if (y < 10) {
                    if (iloczyn % 2 != 0&&x!=1&&y!=1) {
                        System.out.print("X  ");
                    } else {
                        if (iloczyn < 10) {
                            System.out.print(iloczyn + "  ");
                        } else {
                            System.out.print(iloczyn + " ");
                        }
                    }
                } else {
                    System.out.println(iloczyn);
                }

            }

        }


        System.out.println("\n Zadanie 4\nDzilniki przez 4:");
        for (int i=-40; i<=40; i++){
            if(i%4==0){
                System.out.println(i);
            }
        }

        System.out.println("\nZadania doatkowe\npetla while");
        int l=0;
        while(l<=20){
            System.out.println(l);
            l+=2;
        }
        System.out.println("Petla do while");
        int k=30;
        do {
            System.out.println(k);
            k-=3;
        }
        while (k>=0);


        System.out.println("choinka");
        for(int x=1; x<=10;x++ ){
            for(int y=x; y<10; y++){
                System.out.print(" ");
            }
            for(int dl=x*2-2;dl>0;dl--){
                System.out.print("*");
            }
            System.out.println("*");
        }

        System.out.println("kwadrat 10x5");
            for(int i=0; i<5;i++){
                if(i==0||i==4){
                for (int j=0; j<10; j++) {
                    if (j == 9) System.out.print("#\n");
                    else {
                        System.out.print("#");
                    }
                }
                }else{
                    for(int j=0; j<10; j++){
                        if(j==0){
                            System.out.print("#");
                        }else{
                            if (j==9){
                                System.out.print("#\n");
                            }else{
                                System.out.print(" ");
                            }
                        }
                    }

                    }


            }
        System.out.println("choinka z skanerem\n");
        Scanner liczba=new Scanner(System.in);
        System.out.print("Wysokosc choinki: ");
        int h=liczba.nextInt();
        for(int x=1; x<=h;x++ ) {
            for (int y = x; y < h; y++) {
                System.out.print(" ");
            }
            for (int dl = x * 2 - 2; dl > 0; dl--) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
