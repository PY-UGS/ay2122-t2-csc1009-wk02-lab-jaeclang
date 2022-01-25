public class GMT {
    public static void main(String[] args){
        double totalMilliseconds = System.currentTimeMillis();
        double totalSeconds = totalMilliseconds / 1000;
        double currentSeconds = totalSeconds % 60;

        double totalMinutes = totalSeconds / 60;
        double currentMinutes = totalMinutes % 60;

        double totalHours = totalMinutes / 60;
        double currentHours = totalHours % 24;

        String currentTime = String.format("Current time is %.0f:%.0f:%.0f GMT", currentHours, currentMinutes, currentSeconds);
        System.out.println(currentTime);
    }
}
