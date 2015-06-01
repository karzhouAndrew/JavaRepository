package task5;

import java.util.Scanner;

//Имеется целое число (любое), это число — сумма денег в рублях.
// Вывести это число, добавив к нему слово «рублей» в правильном падеже.
public class WritingRubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rubles do you want to enter: ");
        if (sc.hasNext()) {
            int rub = sc.nextInt();
            int residue;
            int digitCounter = 0;
            int[] twoLastDigits = new int[2];
            while (rub > 0) {
                residue = rub % 10;
                if (digitCounter <= 1) {
                    twoLastDigits[digitCounter] = residue;
                }
                rub = (rub - residue) / 10;
                digitCounter++;
            }

            if ((twoLastDigits[1] == 1) && (digitCounter >= 2)) {
                System.out.println(" рублей");
            } else {
                switch (twoLastDigits[0]) {
                    case 0:
                        System.out.println(" рублей");
                        break;
                    case 1:
                        System.out.println(" рубль");
                        break;
                    case 2:
                        System.out.println(" рубля");
                        break;
                    case 3:
                        System.out.println(" рубля");
                        break;
                    case 4:
                        System.out.println(" рубля");
                        break;
                    case 5:
                        System.out.println(" рублей");
                        break;
                    case 6:
                        System.out.println(" рублей");
                        break;
                    case 7:
                        System.out.println(" рублей");
                        break;
                    case 8:
                        System.out.println(" рублей");
                        break;
                    case 9:
                        System.out.println(" рублей");
                        break;
                }
            }
        } else {
            System.out.println("Incorrect number is entered");
        }
        sc.close();
    }
}
