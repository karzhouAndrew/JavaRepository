package lab19;

/* Задание 19. Напишите два цикла выполняющих многократное сложение строк, один с помощью оператора сложения и String, а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения. */
public class Task19 {
    private static final String TEST_STR = "test ";

    public static void main(String[] args) {
        int iterationQuantity = 100;
        long startTime = System.nanoTime();
        testStringAddition(iterationQuantity);
        long resultOfStringAddTest = System.nanoTime() - startTime;
        System.out.println("Результат теста String и оператора сложения, нс: " + resultOfStringAddTest);
        startTime = System.nanoTime();
        testStringBuilderAppend(iterationQuantity);
        long resultOfStrBuildAppTest = System.nanoTime() - startTime;
        System.out.println("Результат теста StringBuilder и метода append, нс: " + resultOfStrBuildAppTest);
        System.out.println("Вывод: метод append в StringBuilder быстрее простого сложения String оператором \'+\' в " + (double) resultOfStringAddTest / (double) resultOfStrBuildAppTest + " раз");
    }

    private static void testStringAddition(int iterationQuantity) {
        String resultString = "";
        for (int i = 0; i < iterationQuantity; i++) {
            resultString += TEST_STR;
        }
        System.out.println(resultString);
    }

    private static void testStringBuilderAppend(int iterationQuantity) {
        StringBuilder resultStringBuilder = new StringBuilder("");
        for (int i = 0; i < iterationQuantity; i++) {
            resultStringBuilder.append(TEST_STR);
        }
        System.out.println(resultStringBuilder);
    }
}