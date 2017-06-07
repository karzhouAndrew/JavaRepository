package lab31;

/* Задание 31. Имеется файл с текстом, в котором присутствуют числа.
Найти все числа, распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.

УТОЧНЯЮ ЗАДАНИЕ: убирает повторы двумя способами:
- без создания в памяти второй коллекции;
- "пропусканием" через Set
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task31 {

    private static final String INPUT_TXT_FILE_PATH = "./Dudinsky/src/lab31/textFileToTest.txt";

    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor();
        try {
            textProcessor.readText(INPUT_TXT_FILE_PATH);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Double> foundNumbers = textProcessor.findAllNumbers();
        if (foundNumbers != null) {
            System.out.println("Найдены числа: " + foundNumbers);
            NumberProcessor numberProcessor = new NumberProcessor();
            System.out.println("Сумма чисел: " + numberProcessor.calcSum(foundNumbers));
            List<Double> secondNumList = new ArrayList<>(foundNumbers);
            numberProcessor.removeAllRepeatsIn(foundNumbers);
            System.out.println("После удаления повторов итератором: " + foundNumbers);
            System.out.println("secondNumList = " + secondNumList);
            List<Double> resultNumList = numberProcessor.passThroughTheSet(secondNumList);
            System.out.println("После его \"пропускания\" через set: " + resultNumList);
        } else {
            System.out.println("Числа не найдены.");
        }
    }
}

/*Результат:
Найдены числа: [375.0, 44.0, 570.0, -22.0, -22.0, 375.0, 29.0, 222.0, -24.0, -60.0, 19.0, 8.0, 15.44, 12.54, 44.91, 15.0, 12.0, 44.0, 44.0, 7.0, 54.0, 44.0, 125.0, 63.08, 44.72, 70.35, 44.0, 64.0, 61.0, 44.0]
Сумма чисел: 2323.04
После удаления повторов итератором: [375.0, 44.0, 570.0, -22.0, 29.0, 222.0, -24.0, -60.0, 19.0, 8.0, 15.44, 12.54, 44.91, 15.0, 12.0, 7.0, 54.0, 125.0, 63.08, 44.72, 70.35, 64.0, 61.0]
secondNumList = [375.0, 44.0, 570.0, -22.0, -22.0, 375.0, 29.0, 222.0, -24.0, -60.0, 19.0, 8.0, 15.44, 12.54, 44.91, 15.0, 12.0, 44.0, 44.0, 7.0, 54.0, 44.0, 125.0, 63.08, 44.72, 70.35, 44.0, 64.0, 61.0, 44.0]
После его "пропускания" через set: [15.0, -22.0, 19.0, 63.08, 222.0, 7.0, 64.0, 29.0, 375.0, 44.0, 61.0, -24.0, 44.91, 44.72, 12.0, 570.0, 125.0, 8.0, 70.35, 15.44, 12.54, -60.0, 54.0]
*/