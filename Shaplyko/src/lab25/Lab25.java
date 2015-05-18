package lab25;

/**
 * Задание 25
 Создать иерархию классов, описывающих банковские карточки.
 Иерархия должна иметь хотя бы три уровня.
 */
public class Lab25 {
    public static void main(String[] args) {
        Visa visa = new Visa(12345,"Лавров И.Н.",1000,"Беларусь");
        Maestro maestro = new Maestro(2342,"Петров В.П.",2300);
        System.out.println("У Вас на счете = " + visa.getAmountCash());
        System.out.println("У Вас на счете = " + maestro.getAmountCash());
        System.out.println("Карточка принадлежит " + maestro.getPersonalData());
        System.out.println("Карточка принадлежит " + visa.getPersonalData());
    }
}

