public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        System.out.println(timer.end());
    }
}
