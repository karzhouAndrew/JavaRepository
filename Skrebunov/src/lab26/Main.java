package lab26;

import java.util.List;

/*Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.
 */
public class Main {
    public static void main(String[] args) {
        Students emppty = new Students();
        List<Integer> students = emppty.createscores(10);
        System.out.println(students);
        List<Integer> bestStudenst = emppty.deleateScores(students);
        System.out.println(bestStudenst);
    }
}
