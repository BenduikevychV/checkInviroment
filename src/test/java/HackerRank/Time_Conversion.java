package HackerRank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Conversion {

    public static void main(String[] args) {

        String time = "12:01:00PM";
        String time1 = "12:01:00AM";

        Time_Conversion time_conversion = new Time_Conversion();
        System.out.println(time_conversion.getTime(time));
        System.out.println(time_conversion.getTime(time1));

    }

    public String getTime(String s) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");

        LocalTime localTime = LocalTime.parse(s, formatter);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String newTime = formatter1.format(localTime);

        return newTime;
    }
}
