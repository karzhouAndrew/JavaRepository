package lab29;

/**
 * Задание 29
 * Имеется текст. Следует составить для него частотный словарь.
 */
public class Lab29 {
    public static void main(String[] args) {
        String str = "Текст слова Буквы. Ходить гулять буквы, буквы еееее! Текст и из Слова?";
        Table table = new Table();
        table.creationTable(str);
        table.conclusionTable();
    }
}
