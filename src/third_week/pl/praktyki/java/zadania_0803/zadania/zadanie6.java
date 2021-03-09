package third_week.pl.praktyki.java.zadania_0803.zadania;

public class zadanie6 {
    public static class Pc{
        public void post(){
            System.out.println("Power on self test");
            System.out.println("#######################################\n");
        }
    }

    public static class cpu extends Pc{
        public void post(){
            super.post();
            System.out.println("CPU");
            System.out.println("Name: Intel core i5 10400F\nstatus: ok\n");
        }
    }

    public static class disk extends cpu {
        public void post(){
            super.post();
            System.out.println("Disk\nSize: 1TB\nWindows on C: yes\n");
        }
    }

    public static class memory extends disk{
        public void post() {
            super.post();
            System.out.println("Memoery\nSize: 16GB\nstatus: ok\n");
        }
    }

    public static class Post extends memory{
        public void post() {
            super.post();
            System.out.println("Post done\nWindows 10 loading...");
        }
    }

    public static void main(String[] args) {
        Post post = new Post();
        post.post();
    }


}
