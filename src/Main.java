import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Please insert the amount of minutes.");
        int inputMinutes = scr.nextInt();
        System.out.println("Now insert the amount of seconds you wish to add.");
        int inputSeconds = scr.nextInt();
        System.out.println(getDurationString(inputMinutes, inputSeconds));
        getDurationString(inputSeconds);
    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0)) {
            return "Invalid value";
        } else {
            int hours = minutes / 60;
            int remainingSeconds = seconds % 60;
            int otherMinutes = (minutes % 60) + (seconds / 60);
            String hoursString = hours + "h";
            String minutesString = otherMinutes + "m";
            String secondsString = remainingSeconds + "s";
            if(hours < 10) {
                hoursString = "0" + hoursString;
            }
            if (otherMinutes < 10){
                minutesString = "0" + minutesString;
            }
            if (remainingSeconds < 10){
                secondsString = "0" + secondsString;
            }
           return hoursString + minutesString + secondsString;
        }
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
