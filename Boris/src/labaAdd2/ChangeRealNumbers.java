package labaAdd2;

//There are 4 real numbers.
//Conditions:
//a <= b <= c <= d    then all numbers is equal max number.
//a > b > c > d    then all numbers is not changed.
// else  all number will be square of it's value.
public class ChangeRealNumbers {
    public static void main(String[] args) {
        double valueA = Math.random() * 10;
        double valueB = Math.random() * 10;
        double valueC = Math.random() * 10;
        double valueD = Math.random() * 10;
        System.out.println("Первое число было " + valueA + ". Второе число было " + valueB +
                ". Третье число было " + valueC + ". Четвертое число было " + valueD);
        if (valueA <= valueB && valueB <= valueC && valueC <= valueD) {
            valueA = valueD;
            valueB = valueD;
            valueC = valueD;
        } else if (!(valueA > valueB && valueB > valueC && valueC > valueD)) {
            valueA *= valueA;
            valueB *= valueB;
            valueC *= valueC;
            valueD *= valueD;
        }
        System.out.println("Первое число стало " + valueA + ". Второе число стало " + valueB +
                ". Третье число стало " + valueC + ". Четвертое число стало " + valueD);
    }
}
