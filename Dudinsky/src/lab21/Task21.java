package lab21;

/* Задание 21. Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>. */
public class Task21 {
    public static void main(String[] args) {
        String givenStr = "<body><h1>Заголовок</h1><p id=\"p1\">Тестовая строка</p><p>содержащая</p><P id=\"p2\">разные теги</P></body>";
        TegProcessor tegProcessor = new TegProcessor();
        System.out.println("В строке {\n" + givenStr + "\n} в тегах <p> и <P> удалены все параметры, ниже результат:\n" + tegProcessor.removeAllParamsOfPTegs(givenStr));
    }
}
