package lab25;

/* Задание 25.
Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня. */

public class Task25 {
    public static void main(String[] args) {

        StandardIndividCard standardIndividCard = new StandardIndividCard(1234_1234_1234_1234L, "БелСвиссБанк", "Иванов Иван", 2019);
        System.out.println(standardIndividCard);
        standardIndividCard.activateRequest();

        EliteIndividCard eliteIndividCard = new EliteIndividCard(1234_5678_1234_5678L, "Приорбанк", "Петров Петр", 3);
        System.out.println("\n" + eliteIndividCard);
        eliteIndividCard.activateOffLineOperation();
        eliteIndividCard.activateRequest();

        PersonalizedCorpCard personalizedCorpCard = new PersonalizedCorpCard(5678_1234_4321_8765L, "Москва-Минск", "ЗАО Дружба", "Сергеев Сергей");
        System.out.println("\n" + personalizedCorpCard);
        personalizedCorpCard.activateOffLineOperation();
        personalizedCorpCard.activateRequest();

        ImpersonalCorpCard impersonalCorpCard = new ImpersonalCorpCard(5678_8765_4321_1234L, "БелИнвестБанк", "ООО Совесть", 2024);
        System.out.println("\n" + impersonalCorpCard);
        impersonalCorpCard.activateRequest();
    }
}
