package secend_week.metodsandobjects;

interface Suszarka{
    void suszeniePranie();

}
interface Pralka{
    void pranieBawelny();
    void praniePoscieli();
    void pranieCiuchow();

}


public class pralkosuszrka_lekcja implements Pralka, Suszarka {


    private int czas;
    private int temp;
    private int wirowanie;

    @Override
    public void suszeniePranie() {
        czas = 135;
        temp = 50;
        wirowanie = 1000;
        wlacz();
    }

    @Override
    public void pranieBawelny() {
        czas = 65;
        temp = 30;
        wirowanie = 600;
        wlacz();

    }

    @Override
    public void praniePoscieli() {
        czas = 80;
        temp = 45;
        wirowanie = 1200;
        wlacz();

    }

    @Override
    public void pranieCiuchow() {
        czas = 120;
        temp = 60;
        wirowanie = 1000;
        wlacz();

    }

     private void wlacz(){
        System.out.println("Wlaczamy pralkosuszarke" + "ustawiamy temp" + temp
                + "\nstponi wirowania: " + wirowanie + "\nczas trwania " + czas);


    }



    public static void main(String[] args) {
        pralkosuszrka_lekcja pralkosuszrka = new pralkosuszrka_lekcja();
        Suszarka suszrka=pralkosuszrka;
        Pralka pralka=pralkosuszrka;


        suszrka.suszeniePranie();
        pralka.pranieBawelny();
        pralka.pranieCiuchow();
        pralka.praniePoscieli();

    }
}
