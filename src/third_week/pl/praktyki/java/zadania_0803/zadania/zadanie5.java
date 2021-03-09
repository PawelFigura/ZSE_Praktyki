package third_week.pl.praktyki.java.zadania_0803.zadania;

public class zadanie5 {

    public static class CPU {
        public void nazwaCPU() {
            System.out.println("CPU: Intel core i5 10400F");
        }
    }

        public static class taktowanie extends CPU {
            public void taktowanieCPU() {
                System.out.println("Taktowanie: 2.90GHz");
            }
        }

            public static class Pc extends taktowanie{
                public void startPc(){
                    System.out.println("Windows loading...");
                }

            }



    public static void main(String[] args) {
        Pc pc=new Pc();
        pc.startPc();
        pc.nazwaCPU();
        pc.taktowanieCPU();





    }
}
