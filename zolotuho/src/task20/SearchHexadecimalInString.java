package task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SearchHexadecimalInString {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[0][x][0-9a-fA-F]{1,15}");
        Matcher matcher = pattern.matcher("dgfdfgdf 0xab4 0x2d3498 fdgsgsg 0x90993d 0njvfk");
        int i = 0;

        while (matcher.find(i)) {
            //matcher.regionStart();
            //  System.out.println(matcher.start() + "\n" + matcher.end());
            System.out.println(matcher.group());
            i = matcher.end();
        }


        Pattern pattern1 = Pattern.compile("<[pP][\\s]?[^>]*>");
        //matcher=  matcher.reset("dscdku sdhbsbks hsbdjhsd <p> pid= sjd>jnjns");

//
        StringBuilder stringBuilder = new StringBuilder("dscdku  <P  index-1> sdhbsbks hsbdjhsd <p fjkdk'dd'> pid= sjd>jnjns");
        Matcher matcher1 = pattern1.matcher(stringBuilder);

        if (matcher1.find()) {
            System.out.println("found");
        }
        i = 0;
        System.out.println(matcher1.toString());
        while (matcher1.find(i)) {
            //matcher.regionStart();
            // System.out.println(matcher1.start() + "\n" + matcher1.end());
            System.out.println(matcher1.group());
            stringBuilder.replace(matcher1.start(), matcher1.end(), "<p>");
            i = matcher1.end();
        }



        //additional
        System.out.println(stringBuilder);
        StringBuilder string = new StringBuilder("hdsvbm hsdvcs  hvsdchv  children gs children   bhsd child");
        Pattern pattern3 = Pattern.compile("children");
        Matcher matcher3 = pattern3.matcher(string);
        System.out.println(string);
        i=0;
        while (matcher3.find(i)) {
            string.replace(matcher3.start(), matcher3.end(), "child");
            i=matcher3.end();
        }

        System.out.println(string);


        //additional111
        System.out.println(stringBuilder);
        StringBuilder string4 = new StringBuilder("хорошо   жить.\n сладко спать.\n  удача есть?");
        Pattern pattern4 = Pattern.compile("[уеыаоэяию]");
        Matcher matcher4 = pattern4.matcher(string4);
        System.out.println(string4);
        int counter=0;
        i=0;
        while (matcher4.find(i)) {
           // string.replace(matcher3.start(), matcher3.end(), "child");
            i=matcher4.end();
            counter++;
        }
        System.out.println("counter = "+counter);
       Pattern pattern5 = Pattern.compile("[йцкнгшщзхъфвпрлджчсмтьб]");
        Matcher matcher5 = pattern5.matcher(string4);
         counter=0;
        i=0;
        while (matcher5.find(i)) {
            // string.replace(matcher3.start(), matcher3.end(), "child");
            i=matcher5.end();
            counter++;
        }
        System.out.println("counter = "+counter);


        Pattern pattern6 = Pattern.compile("[.?!]");
        Matcher matcher6 = pattern6.matcher(string4);
        counter=0;
        i=0;
        while (matcher6.find(i)) {
            // string.replace(matcher3.start(), matcher3.end(), "child");
            //StringBuilder str=new StringBuilder.(string4);
           System.out.println(string4.substring(i, matcher6.end()));
            System.out.println("Number of symbols = "+(matcher6.end()-i));
            //System.out.println( matcher6.region(matcher6.start(), matcher6.end()));
            System.out.println(matcher6.group());
            i=matcher6.end();
            counter++;
        }
        System.out.println("counter = "+counter);


        Pattern pattern7 = Pattern.compile("[ ]");//  \n is possible
        Matcher matcher7 = pattern7.matcher(string4);
        counter=0;
        i=0;
        System.out.println(string4);
        while (matcher7.find(i)) {
            i=matcher7.end();
            counter++;
        }
        System.out.println("counter = "+counter);

        Pattern pattern8 = Pattern.compile("[ ]+");//  \n is possible
        Matcher matcher8 = pattern8.matcher(string4);
        counter=0;
        i=0;
        System.out.println(string4);
        StringBuilder str = new StringBuilder(string4);
        System.out.println(str);
        while (matcher8.find(i)) {

            i=matcher8.end();
            string4.delete(matcher8.start(),matcher8.end());
            counter++;
        }
        System.out.println("counter = "+counter);
        System.out.println(string4);

    }
}
