package com.andrewsotirov;

public class Main {

    public static void main(String[] args) {
        // write your code here
        getDurationString(12547, 19);
        getDurationString(3486);
    }

    public static void getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println("Invalid Value");
        }
        if (minutes >= 60) {
            int hours = minutes / 60;
            minutes -= hours * 60;
            String leadingZeroHours = Integer.toString(hours);
            String leadingZeroMinutes = Integer.toString(minutes);
            String leadingZeroSeconds = Integer.toString(seconds);
            if (hours < 10 || minutes < 10 || seconds < 10) {
                if (hours < 10) {
                    leadingZeroHours = "0" + hours;
                }
                if (minutes < 10) {
                    leadingZeroMinutes = "0" + minutes;
                }
                if (seconds < 10) {
                    leadingZeroSeconds = "0" + seconds;
                }
                System.out.println(leadingZeroHours + "h " + leadingZeroMinutes + "m " + leadingZeroSeconds + "s");
            }
        } else {
            System.out.println("00h " + minutes + "m " + seconds + "s");
        }
    }

    public static void getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid Value");
        }
        int remainingMinutes = seconds / 60;
        seconds -= remainingMinutes * 60;
        getDurationString(remainingMinutes, seconds);
    }
}
