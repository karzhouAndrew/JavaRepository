package dopLab8;

public class DopLab8Main {
    public static void main(String[] args) {
        String text = "Child Trends improves the lives and prospects of child and youth by 1234 conducting " +
                "high-quality research and sharing the resulting child with 11practitioners and 22policymakers";
        DopLab8 dopLab8 = new DopLab8();
        System.out.println("Редактированный текст: " + dopLab8.replaceWord(text));
        System.out.println("Редактированный текст без чисел: " + dopLab8.replaceNumbers(text));

    }
}
