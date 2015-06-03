package additionalTask8;

//Взять любой русскоязычный̆ текст, в котором не меньше трёхсот знаков.
//Необходимо провести анализ этого текста на:
//        a)	   Количество согласных и гласных букв.  
//        b)	   Вывести каждое предложение этого текста в отдельной строке с указанием количества символов в нём.  
//        c)	   Посчитать количество пробелов и абзацев (абзацем считается переход на новую строку).  
//        d)	   Создать текст, в котором будут убраны все пробельные символы в исходном тексте, и вывести его.  

public class TaskTest {
    public static void main(String[] args) {
        String text = "Чем бы ни закончился этот чемпионат мира для сборной Беларуси, \n" +
                "он уже ознаменовался как минимум одним серьёзным достижением. Даже \n" +
                "если бы подопечные Дэйва Льюса не вышли из группы, матч против сборной \n" +
                "США остался бы в памяти белорусских болельщиков... Перед тем, как встретится \n" +
                "с Россией, беларусы сотворили одну из главных сенсаций чемпионата мира! \n" +
                "Встретившись с американцами, они не просто обыграли звёздно-полосатых, а сделали это красиво.";
        System.out.println(text);
        System.out.println("Количество гласных: " + AdditionalTask8.calcConsonantQuantity(text));
        System.out.println("Количество согласных: " + AdditionalTask8.calcVowelsQuantity(text));
        StringBuilder[] arrayOffers = AdditionalTask8.findOffers(text);
        for (StringBuilder offers : arrayOffers) {
            System.out.println(offers);
        }
        System.out.println("Количество пробелов: " + AdditionalTask8.calcSpaceQuantity(text));
        System.out.println("Количество абзацев: " + AdditionalTask8.calcParagraphsQuantity(text));
        System.out.println(AdditionalTask8.getTextWithoutSpace(text));
    }
}
