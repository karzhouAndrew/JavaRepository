package jd02lab09;

/* Задание 9. Напишите программу, преобразующую созданный в предыдущих заданиях xml файл в html, аналогично данному примеру,
в каждой ячейке дополнительно к координате должны выводиться единицы измерения. Результат должен записываться в файл на диске. */

public class JD02Task09 {
    public static void main(String[] args) {

        String INPUT_XML_FILE_PATH = "./Dudinsky/src/jd02lab09/pointsList.xml";
        String STYLE_SHEET_XSL_FILE_PATH = "./Dudinsky/src/jd02lab09/pointListStylesheet.xsl";
        String OUTPUT_HTML_FILE_PATH = "./Dudinsky/src/jd02lab09/pointsList.html";

        XMLTransformer transformer = new XMLTransformer();
        try {
            transformer.transformXMLToHTML(INPUT_XML_FILE_PATH, STYLE_SHEET_XSL_FILE_PATH, OUTPUT_HTML_FILE_PATH);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}