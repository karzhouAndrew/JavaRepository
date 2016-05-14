package lab10;

import java.util.Scanner;

/*
  «адание 10. »меетс€ целое число, определить €вл€етс€ ли это число простым, т.е. делитс€ без остатка только на 1 и себ€.
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
