package secend_week.ćwiczenia;

public class osoba<ile> {

    static int ile;

    String name;
    int wiek;
    boolean matura;
    int zarobki;
    boolean wyksztalcenieWyzsze;
    void przedstawSie(boolean formal) {
        ile++;
        if (formal == false) {
            System.out.println("\nSiema jestem " + name + " mam " + wiek + " lat " + "\n zdalem mature: " + matura + "\n mam wyksztalcenie wyższe: " + wyksztalcenieWyzsze + "\nzarabiam: " + zarobki + "zł miesięcznie");
        }else{
            System.out.println("\nDzień dobry, witam wszytkich zgromadznych. Mam na imię: "+name+" oraz mam "+wiek+" lat. Chciałbym porazmawiac na temat moich zarobków które wynoszą: "+zarobki+" złotych miesiecznie");
        }
    }

    static int ileRazy(){
        return ile;
    }
}
