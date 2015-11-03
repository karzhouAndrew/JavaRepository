package lab30;

/* Задание 30. Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов. */

public class Task30 {

    private final static String INPUT_TXT_FILE_PATH = "./Dudinsky/src/lab30/textFileToTest.txt";

    public static void main(String[] args) {
        
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.readText(INPUT_TXT_FILE_PATH);
        System.out.print("В файле \'" + INPUT_TXT_FILE_PATH + "\' обнаружено ");
        System.out.print(textProcessor.countPunctMarksQuantity() + " знак(ов/а) препинания, а также ");
        System.out.println(textProcessor.countWordsQuantity() + " слов(о/а).");
    }
}