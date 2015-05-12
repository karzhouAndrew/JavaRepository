package lab16_with_reg_exp;

/* Задание 16. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество. */
public class Task16WithRegExp {
    public static void main(String[] args) {
        PunctCounters punctCounter = new PunctCounters();
        String givenPunctStr = "Тестовая; строка, - для: подсчета ! самых \' разных \" знаков ` препинания. (?)";
        System.out.println("В строке {\n" + givenPunctStr + "\n} " + punctCounter.calculatePunct(givenPunctStr) + " знак(ов/а) препинания");
    }
}
