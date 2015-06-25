package lab19;

public class Lab19 {

    public void methodString(String str) {
        for (int i = 0; i < 100; i++) {
            String strString = "";
            strString += str;
        }
    }

    public void methodBuilder(String str) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            strBuilder.append(str);
        }
    }

    public void methodBuffer(String str) {
        StringBuffer strBuffer = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            strBuffer.append(str);
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


    public void speedMethodBuilder(String str) {
        Lab19 Speed = new Lab19();
        int startTimeMethod2 = (int) System.nanoTime();
        System.out.println("Method 2 Start time: " + startTimeMethod2);
        Speed.methodBuilder(str);
        int estimatedTime2 = (int) System.nanoTime() - startTimeMethod2;
        System.out.println("Method 2 End time: " + estimatedTime2);
    }

    public void speedMethodBuffer(String str) {
        Lab19 Speed = new Lab19();
        int startTimeMethod2 = (int) System.nanoTime();
        System.out.println("Method 3 Start time: " + startTimeMethod2);
        Speed.methodBuffer(str);
        int estimatedTime2 = (int) System.nanoTime() - startTimeMethod2;
        System.out.println("Method 3 End time: " + estimatedTime2);
    }
}