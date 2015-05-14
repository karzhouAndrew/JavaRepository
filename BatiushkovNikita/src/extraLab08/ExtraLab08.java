package extraLab08;

// Replace 'child' -> 'children'. Remove [0-9]

public class ExtraLab08 {
    public static void main(String[] args) {
        String str = "childchildFF 0934FF5chiZldren434 9585child";
        System.out.println(getStrModifNumbers(getStrModifChild(str)));
    }

    private static String getStrModifChild(String str) {
        return str.replaceAll("child", "children");
    }

    private static String getStrModifNumbers(String str) {
        return str.replaceAll("[0-9]", "");
    }
}
