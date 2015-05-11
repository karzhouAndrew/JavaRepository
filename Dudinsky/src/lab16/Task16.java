package lab16;

/* Задание 16. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество. */
public class Task16 {
    public static void main(String[] args) {
        PunctCounters punctCounter = new PunctCounters();
        String givenPunctStr = "Тестовая строка, - для подсчета знаков препинания!";
        System.out.println("В строке {\n" + givenPunctStr + "\n} найдено " + punctCounter.calculatePunct(givenPunctStr) + " знак(ов/а) препинания");
    }
}