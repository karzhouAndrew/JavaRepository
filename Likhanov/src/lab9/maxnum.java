package lab9;

// ��� � �������, ������� ������������������ ��������� �����, ����� � ������� ���������� �� ���.

public class maxnum {
    public static void main(String[] args) {
        int num = 0;
        int randnum = (int) (Math.random() * 30);
        num = randnum;
        while (randnum != 0) {
            randnum = (int) (Math.random() * 30);
            if (num < randnum) {
                num = randnum;
            }
        }
        System.out.println("maximum is " + num);

    }
}
