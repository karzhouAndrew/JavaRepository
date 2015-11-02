package lab2;

import java.util.Scanner;

//task 2
public class HellowWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int s = scanner.nextInt();
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int week = (d - day) / 7;
        System.out.println(week + " weeks " + day + " days " + hour + " hours " + min + " minutes " + sec + " seconds");
    }
}
