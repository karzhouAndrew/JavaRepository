package lab10;
//Задание 10 Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.

/**
 * Created by USER on 10.05.2015.
 */
public class task10 {
    public static void main(String[] args) {
            int n = 15779899;
            int i;
            boolean isComposite = false;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    isComposite = true;
                    break;
                }
            }
            if (isComposite) {
                System.out.println("число составное ");
            } else {
                System.out.println("число  простое ");
            }
        }
    }

