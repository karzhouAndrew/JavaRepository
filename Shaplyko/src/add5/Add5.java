package add5;

/**
 * Задача про скобки - пары скобок и правильность выражения
 */
public class Add5 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', '(', ')', '(', '(', '(', '(', 'a', 'b', 'c', 'd', ')', ')', ')', ')'};
        char open = '(';
        char close = ')';
        int markerOpen = 0;
        int markerClose = 0;
        int markerWrong = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == open) {
                markerOpen++;
            }
            if ((array[i] == close) && (markerOpen > markerClose)) {
                markerWrong++;
            }
            if (array[i] == close) {
                markerClose++;
            }
        }
        if (markerOpen == markerClose && markerClose == markerWrong) {
            System.out.println("Выражение верно, пар скобок равно = " + markerClose);
        } else {
            System.out.println("Выражение ошибочно, проверьте скобки");
        }
    }
}
