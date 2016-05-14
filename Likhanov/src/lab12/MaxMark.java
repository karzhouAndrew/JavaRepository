package lab12;

import java.util.Scanner;

/**
 * The task is to find tha max mark and display the number of the student
 **/
public class MaxMark {
    public static void main(String[] args) {
        int [] marks = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < marks.length; i++){
            marks[i] = scan.nextInt();
        }
        int maxMark = marks[0];
        for(int i = 0; i < marks.length - 1; i++){
            if(marks[i] < marks[i + 1]){
                maxMark = marks[i+1];
            }
        }
        for(int i = 0; i < marks.length; i++){
            if(marks[i] == maxMark){
                System.out.println("Student #" + (i + 1) + " has the highest mark " + marks[i]);
            }
        }
        scan.close();
    }
}
