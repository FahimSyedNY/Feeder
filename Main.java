public class Main {
    public static void main(String[] args) {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
        f.simulateOneDay(12);
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
        f = new Feeder(1000);
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
        f.simulateOneDay(22);
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
        f = new Feeder(2400);
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
        System.out.println(f.simulateManyDays(10, 4) + " days.");
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
        f = new Feeder(250);
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
        System.out.println(f.simulateManyDays(10, 5) + " days.");
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
        f = new Feeder(0);
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
        System.out.println(f.simulateManyDays(5, 10) + " days.");
        System.out.println("Current Food: " + f.getCurrentFood() + "g");
    }
}