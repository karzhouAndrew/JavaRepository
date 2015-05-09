package lab21;

/**
 * Задание 21
 Написать программу, выполняющую поиск в строке всех тегов абза-цев, в т.ч. тех, у которых есть параметры,
 например <p id=p1>, и замену их на простые теги абзацев <p>.
 */
public class Lab21 {
    public static void main(String[] args) {
        String str = "ertert ertet 0x7FFF <p id=p1> 0x7AAF <p id=p1> ergerg eerg eergt";
        System.out.println(str.replaceAll("<p id=p1>", "<p>"));
    }
}



