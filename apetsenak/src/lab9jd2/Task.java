package lab9jd2;

/**
 * Напишите программу, преобразующую созданный в предыдущих за-даниях xml файл в html,
 * аналогично данному примеру, в каждой ячейке дополнительно к координате
 * должны выводиться единицы измерения. Результат должен записываться в файл на диске.
 */
public class Task {
    public static void main(String[] args) {
        XMLTransformer transformer = new XMLTransformer();
        transformer.transformToHTML("./apetsenak/src/lab9jd2/point.xml",
                "./apetsenak/src/lab9jd2/point.xsl",
                "./apetsenak/src/lab9jd2/point.html");
    }
}
