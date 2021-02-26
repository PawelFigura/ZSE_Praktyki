package first_week.zadania;

public class Zadania {
    public static void main(String[] args) {
        //zadanie 1
        int myint1 = 6; //liczba całkowita 6
        int myint2 = -39; //lizcba całkowita -39
        int myint3 = 1002;

        System.out.println("Liczba a: "+myint1);
        System.out.println("Liczba b: "+myint2);
        System.out.println("Liczba c: "+myint3);

        //dowawanie
        int suma=myint1+myint2+myint3;
        System.out.println("Dodawanie to: "+suma);

        //odejmowanie zminnych
        int roznica=myint1-myint2;
        System.out.println("Odejmowanie to: " +roznica);

        //mnożenie
        int mnorzenie=myint1*myint2;
        System.out.println("Mnorzenie to: "+mnorzenie);

        //dzielenie
        int dzielenie=myint2/myint1;
        System.out.println("Dzielenie to: "+dzielenie);
        double podzial_int = myint3/myint1;
        System.out.println(podzial_int);

        double mydouble =1.65;
        double mydoublea =1.89;
        double sumad = mydouble+mydoublea;
        System.out.println("suma double: " +sumad);

        //znaki
        char mychara ='J';
        char mycharb = 'D';
        char mycharc ='7';
        System.out.println("Moja ulubiona liczba to: "+ mycharc);
        System.out.println("Moj ulubiony skrot to: "+mychara + mycharb);

        //string
        String mystrongA = "Wadowic";
        String mystringB = "Papież Polak ";
        String mystrinC = "z";
        System.out.println(mystringB+mystrinC+" "+mystrongA);

        //boolean
        boolean mybool = true;
        System.out.println(!mybool);
        System.out.println("\n");

        //zadanie 2
        int myintA = 7;
        int myintB = 5;
        int wynik = (myintA*myintA)+(myintB*myintB);
        System.out.println("Syma potengi A i B: "+wynik);
        System.out.println("\n");

        //zadanie 3
        int bok= 7;
        double pierwsiatek =Math.sqrt(3);
        double pole=(bok*bok*pierwsiatek)/4;
        System.out.println("Pierwisatek z 3: "+pierwsiatek);
        System.out.println("Pole: "+pole+" cm2");
        System.out.println("\n");

        //zadanie 4
        String imie = "Paweł";
        String Nazwisko = "Figura";
        System.out.println(imie +"\n \t" + Nazwisko);
    }
}
