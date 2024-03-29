package com.serge.clock;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SecondCalendar {
    public static void main(String[] atrs) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year;
        year = input.nextInt();

        System.out.println("Enter the weekday that the year starts: ");
        int firstDayYear = input.nextInt();

        for (int month = 1; month<=12; month ++) {
            int daysMonth = 0;
            String monthDisplay = "";

            switch (month) {
                case 1:
                    monthDisplay = "January";
                    daysMonth = 31;
                    break;

                case 2:
                    monthDisplay = "February";
                    int leapYear = 0;
                    while (leapYear > -1) {
                        leapYear += 4;

                        if (year == leapYear) {
                            daysMonth = 29;
                            break;
                        } else {
                            daysMonth = 28;
                        }
                    }
                    break;

                case 3:
                    monthDisplay = "March";
                    daysMonth = 31;
                    break;

                case 4:
                    monthDisplay = "April";
                    daysMonth = 30;
                    break;

                case 5:
                    monthDisplay = "May";
                    daysMonth = 31;
                    break;

                case 6:
                    monthDisplay = "June";
                    daysMonth = 30;
                    break;

                case 7:
                    monthDisplay = "July";
                    daysMonth = 31;
                    break;

                case 8:
                    monthDisplay = "August";
                    daysMonth = 31;
                    break;

                case 9:
                    monthDisplay = "September";
                    daysMonth = 30;
                    break;

                case 10:
                    monthDisplay = "October";
                    daysMonth = 31;
                    break;

                case 11:
                    monthDisplay = "November";
                    daysMonth = 30;
                    break;

                case 12:
                    monthDisplay = "December";
                    daysMonth = 31;
                    break;

                default:
                    System.out.println("Invalid : your month is not recognized");
                    System.exit(0);
            }

            System.out.println(" " + monthDisplay + " " + year);
            System.out.println("_");
            System.out.println("SUN  MON  TUE  WED  THU  FRI  SAT");

            int firstDayEachMonth = (daysMonth + firstDayYear) % 7;
            for (int space = 1; space <= firstDayEachMonth; space++) {
                System.out.println(" ");
            }

            for (int daysDisplay = 1; daysDisplay <= daysMonth; daysDisplay++) {
                if (firstDayYear % 7 == 0) {
                    System.out.println();
                }

                System.out.printf("%3d ", daysDisplay);
                firstDayYear += 1;
            }
            System.out.println();
        }
    }
}
