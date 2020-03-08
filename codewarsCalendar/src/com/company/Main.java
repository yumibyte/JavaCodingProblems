package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();

        for (int i = 0; i < start + 1; i ++) {
            String dayName = sc.next();
            int dayNum = sc.nextInt();
            Calculate(dayName, dayNum);
        }
        


    }
    private static void Calculate(String dayName, int dayNum) {

        int dayPosition = -1;
        int position;
        String[] days = {
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday"
        };

        // find index of day
        for(int i = 0; i < days.length; i ++) {
            if (days[i].equals(dayName)) {
                dayPosition = i;
                break;
            }
        }

        position = dayPosition + dayNum - 1;

        int row = position / 7;
        int first = (position % 7) * 3;
        int second = ((position % 7) * 3) + 1;

//        double division = position / 7;
//        int row2 = (int) Math.floor(division);
//        System.out.println(row2);

        String r = Integer.toString(row);
        String f = Integer.toString(first);
        String s = Integer.toString(second);
//
        if (dayNum > 9) {
            System.out.println(r + " " + f + " " +  s);
        } else {
            System.out.println(r + " " + s);
        }

    }

}
