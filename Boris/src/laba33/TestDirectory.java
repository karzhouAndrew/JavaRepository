package laba33;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestDirectory {
    public static void main(String[] args) {
        Directory directory = new Directory("d:/MyProg/");
        System.out.println(directory.getStringBuilderCatalogs());
//        System.out.println(directory.getStringBuilderFiles());


//        String str = "d:\\MyProg\\123\\321";
//        String regex = "\\\\([^\\\\]+)$";
//        Matcher matcher = Pattern.compile(regex).matcher(str);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

    }
}
