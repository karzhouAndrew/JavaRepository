package lab10;

import java.util.Scanner;

/*
  ������� 10. ������� ����� �����, ���������� �������� �� ��� ����� �������, �.�. ������� ��� ������� ������ �� 1 � ����.
 */
public class Task10 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        for(int i = 2; i <= 9; i++){
             if(i == number){
                 continue;
             }
            if(number % i == 0){
                System.out.println(number + " is not simple.");
                break;
            }
            if(i == 9){
                System.out.println(number + " is simple.");
            }

        }

    }
}
