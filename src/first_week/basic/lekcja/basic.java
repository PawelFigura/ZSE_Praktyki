package first_week.basic.lekcja;

public class basic {
    public static void main(String[] args) {
        int myint1 = 2; //liczba całkowita 2
        int myint2 = -32; //lizcba całkowita -32


        System.out.println("Liczba a: "+myint1);
        System.out.println("Liczba b: "+myint2);

        //dowawanie
        int suma=myint1+myint2;
        System.out.println("Dodawanie to: "+suma);

        //odejmowanie zminnych
        int roznica=myint1-myint2;
        System.out.println("Odejmowanie to: " +roznica);

        //mnożenie
        int mnorzenie=myint1*myint2;
        System.out.println("Mnorzenie to: "+mnorzenie);

        //dzielenie
        int dzielenie=myint1/myint2;
        System.out.println("Dzielenie to: "+dzielenie);

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
        System.out.println(mystringB+mystrinC+mystrongA);

        //boolean
        boolean mybool = true;
        System.out.println(!mybool);
    }
}
