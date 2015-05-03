package lab07;

/*Дано любое натуральное n. Верно ли, что все цифры числа различны?*/
public class Task07 {
    public static void main(String[] args) {
        int n = 25716;
        int curDigit, dig0, dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9;
        dig0 = dig1 = dig2 = dig3 = dig4 = dig5 = dig6 = dig7 = dig8 = dig9 = 0;
        System.out.print("В заданном числе n = " + n);
        while (n > 0) {
            curDigit = (int) n % 10;
            switch (curDigit) {
                case 0:
                    dig0++;
                    break;
                case 1:
                    dig1++;
                    break;
                case 2:
                    dig2++;
                    break;
                case 3:
                    dig3++;
                    break;
                case 4:
                    dig4++;
                    break;
                case 5:
                    dig5++;
                    break;
                case 6:
                    dig6++;
                    break;
                case 7:
                    dig7++;
                    break;
                case 8:
                    dig8++;
                    break;
                case 9:
                    dig9++;
                    break;
            }
            n /= 10;
        }
        if (dig0 > 1 || dig1 > 1 || dig2 > 1 || dig3 > 1 || dig4 > 1 || dig5 > 1 || dig6 > 1 || dig7 > 1 || dig8 > 1 || dig9 > 1) {
            System.out.println(" имеет место не менее 1 повтора цифр");
        } else {
            System.out.println(" все цифры различны");
        }
    }
}
