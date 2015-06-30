package lab40;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;

/**
 * Напишите программу, преобразующую созданный в предыдущих заданиях xml файл в html, аналогично данному
 * примеру, в каждой ячейке дополнительно к координате должны выводиться единицы измерения. Результат должен
 * записываться в файл на диске.
 */
public class Lab40 {
    public static void main(String[] args) throws TransformerException, FileNotFoundException {
        XMLTransformer transformer = new XMLTransformer();
        transformer.transform("./src/lab40/lab40.xsl", "./src/lab40/lab37.xml", "./src/lab40/lab40.html");
    }
}

