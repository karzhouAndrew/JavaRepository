package additionalTask6;

//проверить валидность строки на скобки
public class CheckStringBracket {
    public static void main(String[] args) {
        char[] stringTest;
        stringTest = new char[]{'q', 'w', ')', '(', '9', '0', '(', '0', ')', 'm'};
        int checkSum = 0;
        for (int i = 0; i < stringTest.length; i++) {
            if (stringTest[i] == '(') {
                checkSum++;
            }
            if (stringTest[i] == ')') {
                checkSum--;
            }
            if (checkSum < 0) {
                break;
            }
        }
        if (checkSum == 0) {
            System.out.println("string is valid!!!");
        } else {
            System.out.println("string is NOT valid");
        }
    }
}
