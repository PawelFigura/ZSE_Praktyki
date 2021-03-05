package secend_week.metodsandobjects;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

interface piecPiekacz{
        void pieczenieCiastek();
        void pieczenieChleba();
    }

    interface piecGrill{
        void grilowanieKurczaka();
    }

    public class Piec implements piecPiekacz, piecGrill{

        int czas;
        int temp;

        @Override
        public void pieczenieCiastek(){
            temp =220;
            czas = 10;
            wlacz();
        }

        @Override
        public void pieczenieChleba(){
            temp = 200;
            czas = 30;
            wlacz();
        }

        @Override
        public void grilowanieKurczaka(){
            temp=100;
            czas=30;
            wlacz();
        }

        private void wlacz(){
            System.out.println("Pieczenie wlaczone..."+
                    "\ntemperatura ustawiona to: "+temp+"*C"+
                    "\nCzas: "+czas+"min");
        }



        public static void main(String[] args) {

            Piec piec = new Piec();
            piecPiekacz piekacz=piec;
            piecGrill grill=piec;

            System.out.println("MUNU PIECA");
            System.out.println("1.Grill");
            System.out.println("2. Pieczenie");
            Scanner skaner=new Scanner(System.in);

            System.out.print("Co robimy?");
            int wybor = skaner.nextInt();
            switch (wybor){
                case 1:
                    grill.grilowanieKurczaka();
                    break;
                case 2:
                    System.out.print("1. Ciastka \n2.Chleb\nWybór: ");
                    int wybor2=skaner.nextInt();
                    if (wybor2==1){
                        piekacz.pieczenieCiastek();
                    }else{
                        if(wybor2==2){
                            piekacz.pieczenieChleba();
                        }else{
                            System.out.println("Liczenie do 2 jest za ciężkie ;(");
                        }
                    }


                    break;
                default:
                    System.out.println("Matma powyżej 2 przeraża :0 ");
            }
        }
    }



