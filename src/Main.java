public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Clock c = new Clock();
        c.setTime(20, 99);

        Clock customClock = new Clock(3, 15);

        System.out.println(c.getTime());
        System.out.println(customClock.getTime());
    }
}