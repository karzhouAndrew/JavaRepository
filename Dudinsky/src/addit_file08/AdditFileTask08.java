package addit_file08;

/*Доп.задание по файлам №8. Прочитать текст Java-программы и удалить из него все «лишние» пробелы
и табуляции, оставив только необходимые для разделения операторов.*/

public class AdditFileTask08 {

    private static final String GIVEN_FILE_PATH = "./Dudinsky/src/addit_file08/TextProcessor.java";
    private static final String RESULT_FILE_PATH = "./Dudinsky/src/addit_file08/result/TextProcessor.txt";

    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor();
        textProcessor.removeAdditionalBlanks(GIVEN_FILE_PATH, RESULT_FILE_PATH);
    }
}
