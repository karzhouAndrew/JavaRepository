package lab8;

/**
 * ������� 8. �������� ������ � ������ ����� ����� �������, ����� �������������� �� �����, � ������������, �.�. ��������� �����.
 */
public class Task08 {
    public static void main(String [] args){
        long randomNumber = (long)(Math.random() * 20);
        long factorial = 1;
        for(long i = 1; i <= randomNumber; i++){
        factorial = factorial * i;
        }
        System.out.println("The factorial of " + randomNumber + " is: " + factorial + ".");
    }
}
