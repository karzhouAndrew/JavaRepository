package addit_file05;

/*Доп.задание по файлам №5. В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов,
которые имеют средний балл более 7. Для вывода результатов создавать новую директорию и файл средствами класса File.
УТОЧНЯЮ задание: каждый студент в файле указан с новой строки, но их оценки могут разделяться как запятыми, так и пробелами.*/

import java.io.File;

public class AdditFileTask05 {

    private static final String MARKS_FILE_PATH = "./Dudinsky/src/addit_file05/Marks.txt";
    private static final String EDITED_FILE_PATH = "./Dudinsky/src/addit_file05/result/Marks_edited.txt";
    private static final double BORDER_LEVEL = 7.0;

    public static void main(String[] args) {
        MarksListProcessor marksListProcessor = new MarksListProcessor();
        String givenList = marksListProcessor.readMarkList(MARKS_FILE_PATH);
        String editedList = marksListProcessor.upCaseWhenAverMarkOver(BORDER_LEVEL, givenList);
        File outputFile = new File(EDITED_FILE_PATH);
        marksListProcessor.createFile(outputFile);
        marksListProcessor.write(editedList, outputFile);
    }
}
