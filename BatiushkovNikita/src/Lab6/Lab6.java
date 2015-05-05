package Lab6;

// Reverse number

public class Lab6 {
    public static void main(String[] args) {
        int number = 987111;
        String strNumModified = "";
        while (number / 10 != 0 || number % 10 != 0) {
            strNumModified += Integer.toString(number % 10);
            number /= 10;
        }
        int NumModified = Integer.parseInt(strNumModified);
        System.out.println(NumModified);
    }
}
