package Lab19;

public class Lab19 {

    public void methodString(String str1,String str2,String str3,String str4) {
        for (int i = 0; i < 100; i++) {
            String strString = "";
            strString += str1 + str2 + str3 + str4;
        }
    }

    public void methodAppend(String str1,String str2,String str3,String str4) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            strBuilder.append(str1 + str2 + str3 + str4);
        }
    }


    public void SpeedMethodString(String str1,String str2,String str3,String str4) {
        Lab19 Speed = new Lab19();
        int startTimeMethod1 = (int) System.nanoTime();
        System.out.println("Method 1 Start time: " + startTimeMethod1);
        Speed.methodString(str1,str2,str3,str4);
        int estimatedTime = (int) System.nanoTime() - startTimeMethod1;
        System.out.println("Method 1 End time: " + estimatedTime);
    }


    public void SpeedMethodAppend(String str1,String str2,String str3,String str4) {
        Lab19 Speed = new Lab19();
        int startTimeMethod2 = (int) System.nanoTime();
        System.out.println("Method 2 Start time: " + startTimeMethod2);
        Speed.methodAppend(str1,str2,str3,str4);
        int estimatedTime2 = (int) System.nanoTime() - startTimeMethod2;
        System.out.println("Method 2 End time: " + estimatedTime2);
    }
}