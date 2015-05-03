package tasks;

/**
 * Created by KirilenkoMV on 02.05.2015.
 */
public class Task5 {
    public static void main(String[] args) {
        char[] array = new char[]{'d','g','(','g','d',')',')','g','(','g','d','g','d','g','d','g'};
        boolean flag=false;
        int count=0;
        int pairs=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]=='('){
                count++;
            }else if(array[i]==')'){
                count--;
                pairs++;
            }

            if(count<0){
                //дальше идти нет смысла
                flag = true;
                break;
            }
        }
        if(count>0||flag){
            System.out.println("Скобки расставлены не верно");
        }else{
            System.out.println(pairs+" пар скобок");
        }

    }
}
