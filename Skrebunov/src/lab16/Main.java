package lab16;

/*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */
public class Main {
    public static void main(String[] args) {
        Punctuation first = new Punctuation();
        int number = first.punctuationNumber("сколько. запятых,; сколько, точек., сколько точек с запятой.");
        System.out.println("Колчество знаков препинания = " + number);
    }
}
