package lab42;

import javax.xml.transform.TransformerException;
import java.io.FileNotFoundException;

/*
* Задание 9
Напишите программу, преобразующую созданный в предыдущих заданиях xml файл в html,
аналогично данному примеру, в каждой ячейке дополнительно к координате должны выводиться единицы измерения.
Результат должен записываться в файл на диске
*/
public class RunXSLTTransformer {
    public static void main(String[] args) throws TransformerException, FileNotFoundException {
        XMLTransformer transformer = new XMLTransformer();
        transformer.transform();
    }
}
