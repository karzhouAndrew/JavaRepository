package lab16;

/**
 * Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 */
public class Task {
    public static void main(String[] args) {
        Calculation calc=new Calculation();
        String str = "Текстовая : строка.. с различными,, знаками  препинания?, :найти ;количество!!!.,";
        System.out.println(str);
        System.out.println("Количество знаков препинания : " + calc.calcOfPunctuationMarks(str));
    }
}
