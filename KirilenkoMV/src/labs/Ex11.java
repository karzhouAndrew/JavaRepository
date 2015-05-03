package labs;

/**
 * Created by Kirilenko_MV on 02.05.2015.
 *
 * Найти сумму первых n чисел, которые делятся на 3.
 */

public class Ex11 {
    public static void main(String[] args) {
        int number=22;
        int count=0;
        int i=0;
        int result=0;
        while(true){
            i++;
            if(i%3==0){
                result+=i;
                count++;
                if(count==number){
                    break;
                }
            }
        }
        System.out.println("result = " + result);
    }
}
