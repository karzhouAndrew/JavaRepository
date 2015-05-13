package lab5;

//вывод сообщения со словом рубль в правильном падеже
public class Lab5 {
    public static void main(String[] args) {
        int number = 111;
        if (((number % 10) == 1) && ((number % 100) != 11)) {
            System.out.println(number + " рубль");
        } else if ((number % 10) == 2 || (number % 10) == 3 || (number % 10) == 4) {
            if ((number % 100) != 12 && (number % 100) != 13 && (number % 100) != 14) {
                System.out.println(number + " рубля");
            }
        } else {
            System.out.println(number + " рублей");
        }
    }
}
