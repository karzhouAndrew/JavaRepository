package task2;

import java.util.Scanner;

//Продолжите приведенный пример, добавьте расчет и вывод суток и недель.
public class TimeBar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds:");
        if (sc.hasNextInt()) {
            int sec = sc.nextInt();
            int secResidue = sec % 60;
            int min = (sec - secResidue) / 60;
            int minResidue = min % 60;
            int hour = (min - minResidue) / 60;
            int hourResidue = hour % 24;
            int day = (hour - hourResidue) / 24;
            int dayResidue = day % 7;

            int week = (day - dayResidue) / 7;
            System.out.println(week + " weeks " + dayResidue + " days " + hourResidue + " hours "
                    + minResidue + " minutes " + secResidue + " seconds ");
        } else {
            System.out.println("Entered incorrect number");
        }
        sc.close();
    }
}
