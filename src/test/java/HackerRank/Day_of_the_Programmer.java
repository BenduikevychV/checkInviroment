package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Day_of_the_Programmer {

    public static void main(String[] args) {

        int dayProgrammer = 256;
        String isLeapYear = "No";

        Day_of_the_Programmer day_of_the_programmer = new Day_of_the_Programmer();

        int year = 1918;

        if (year >= 1700 && year < 1918) {

            if (year % 4 == 0) {
                isLeapYear = "leap";
            }
        } else if (year > 1918) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                isLeapYear = "leap";
            }
        } else if (year == 1918) {
            dayProgrammer += 14;
            isLeapYear = "leap";
        }

        List<Integer> date = day_of_the_programmer.dayAndMonth(dayProgrammer, isLeapYear);
//        dd.mm.yyyy
        String dd = "" + date.get(0);
        String mm = "0" + date.get(1);

        String dateMonthYeayr = dd + "." + mm + "." + year;
        System.out.println(dateMonthYeayr);

    }


    public List dayAndMonth(int dayProgrammer1, String leapYear) {

        int January = 31;
        int February = 28;
        if (leapYear.equals("leap")) {
            February = 29;
        }
        int March = 31;
        int April = 30;
        int May = 31;
        int June = 30;
        int July = 31;
        int August = 31;
        int September = 30;
        int October = 31;
        int November = 30;
        int December = 31;

        List<Integer> month = new ArrayList<>();
        month.add(January);
        month.add(February);
        month.add(March);
        month.add(April);
        month.add(May);
        month.add(June);
        month.add(July);
        month.add(August);
        month.add(September);
        month.add(October);
        month.add(November);
        month.add(December);

        int days = 0;
        int day = 0;
        int numbMonth = 1;
        List<Integer> dayMonth = new ArrayList<>();
        for (int i = 0; i < month.size(); i++) {
            days += month.get(i);
            numbMonth++;
            if ((dayProgrammer1 - days) >= 0 && (dayProgrammer1 - days) <= 30) {
                day = dayProgrammer1 - days;
                dayMonth.add(day);
                dayMonth.add(numbMonth);
                break;
            }
        }


        return dayMonth;
    }
}
