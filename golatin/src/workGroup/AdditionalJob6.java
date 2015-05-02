package workGroup;

/**
 * Created by User on 02.05.2015.
 * Корректность ввода скобок
 */
public class AdditionalJob6 {
    public static void main(String[] args) {
        String Text = "()()()(()((()()())()(((())))))()()()()((()()()))";
        int Count_of_Brackets = 0,Check_Brackets=0;
        String res = "\nЧисло закрывающих скобок = Число открывающих скобок. Скобок: ";
        System.out.println(Text);
        for (int i = 0; i < Text.length(); i++) {
            if (Text.charAt(i) == '(') {
                Count_of_Brackets++;
                Check_Brackets++;
            } else if (Text.charAt(i) == ')') {
                Check_Brackets--;
            }
            if (Check_Brackets < 0) {
                res = "\nЧисло закрывающих скобок > Число открывающих скобок";
                break;
            }
            System.out.print(Text.charAt(i));
        }
        if (Check_Brackets > 0) {
            res = "\nЧисло закрывающих скобок < Число открывающих скобок";
        }else if(Check_Brackets==0)
        {
            res+=Count_of_Brackets;
        }
        System.out.println(res);
    }
}
