package lab19;

public class Lab19 {

    public void methodString(String str) {
        for (int i = 0; i < 100; i++) {
            String strString = "";
            strString += str;
        }
    }

    public void methodAppend(String str) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            strBuilder.append(str);
        }
    }


    public void speedMethodString(String str) {
        Lab19 Speed = new Lab19();
        int startTimeMethod1 = (int) System.nanoTime();
        System.out.println("Method 1 Start time: " + startTimeMethod1);
        Speed.methodString(str);
        int estimatedTime = (int) System.nanoTime() - startTimeMethod1;
        System.out.println("Method 1 End time: " + estimatedTime);
    }


    public void speedMethodAppend(String str) {
        Lab19 Speed = new Lab19();
        int startTimeMethod2 = (int) System.nanoTime();
        System.out.println("Method 2 Start time: " + startTimeMethod2);
        Speed.methodAppend(str);
        int estimatedTime2 = (int) System.nanoTime() - startTimeMethod2;
        System.out.println("Method 2 End time: " + estimatedTime2);
    }
}