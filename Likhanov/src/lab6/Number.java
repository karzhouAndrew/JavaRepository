package lab6;

// ���������� �����, ���������� ������������ � �������� ������� ���� ������ ������������ ����� n.

public class Number {
    public static void main(String[] args) {
        int number = 123;
        int finalnum;
        while (number > 0) {
            finalnum = number % 10;
            number = number / 10;
            if (finalnum > 0) {
                System.out.print(finalnum);
            } else {
                System.out.print("");
            }
        }

    }
}
