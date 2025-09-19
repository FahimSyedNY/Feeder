import java.util.Objects;

public class Feeder {
    private int currentFood;
    public Feeder(int food) {
        currentFood = food;
    }
// Get Current Food Method
    public int getCurrentFood() {
        return currentFood;
    }
// Simulate One Day Method
    String sendmsg = "true";
    public void simulateOneDay(int numBirds) {
        if (Math.random() < 0.05) {
            currentFood = 0;
            System.out.println("A bear ate all of the food"); }
        else {
            for (int i = 1; i <= numBirds; i++) {
                int eaten = (int) (((Math.random() * 41) + 10));
                currentFood -= eaten;
            } // I decided to go with this for a more accurate simulation of birds eating.
            if (Objects.equals(sendmsg, "true")) System.out.println(numBirds + " birds came and ate.");
        }
        if (currentFood < 0) currentFood = 0;
    }
// Simulate Many Days Method
    public int simulateManyDays(int numBirds, int numDays)
    {
        sendmsg = "false";
        int days = 0;
        while (numDays > 0) {
            if (currentFood == 0) {
                sendmsg = "true";
                System.out.print((numBirds * days) + " birds came to find and eat from the feeder over the course of ");
                return days;
            }
            simulateOneDay(numBirds);
            numDays--;
            days++;
            }
        sendmsg = "true";
        System.out.print((numBirds * days) + " birds came to find and eat from the feeder over the course of ");
        return days;
    }
}