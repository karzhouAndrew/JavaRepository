package pwt.regulars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kirilenko_MV on 11.05.2015.
 * Найти в строке все абзацы, в том числе у которых есть параметры и заменить найденное на простой тэг <p>
 *
 */
public class Ex21 {
    public static void main(String[] args) {
        Pattern pattern =  Pattern.compile("(<p(.)+>)");//("<p(.)+>");
        Matcher matcher = pattern.matcher("jhfbdf<p  jh>rfrf</p>mnb<p jhg>  gkjgf</p>nhvmg");
        //matcher.replaceAll()
        while(matcher.find()){
            System.out.println("123 "+matcher.group());
        }
    }
}
