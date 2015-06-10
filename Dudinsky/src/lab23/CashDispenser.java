package lab23;

/* Задание 23
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
Сделать методы для добавления денег в банкомат. Сделать функцию снимающую деньги. На вход передается сумма денег. На выход – булевское значение (операция удалась или нет).
При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдается сумма. Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.

УТОЧНЯЮ ЗАДАНИЕ:
- банкомат при выдаче запрошенной суммы выдает не минимальным количеством купюр, а разменивает так, чтобы кроме 'крупняка' гарантировано было несколько мелких купюр, даже в 'кругленьких' суммах;
- при недостаче купюр какого-либо номинала заменяет оставшуюся часть выдачи купюрами другого номинала в соответствующем количестве;
*/
public class CashDispenser {
    private final int HUNDRED_VALUE = 100;
    private final int FIFTY_VALUE = 50;
    private final int TWENTY_VALUE = 20;

    private int hundredValueBankNotes;
    private int fiftyValueBankNotes;
    private int twentyValueBankNotes;

    private int transaction100ValueNotes;
    private int transaction50ValueNotes;
    private int transaction20ValueNotes;

    public CashDispenser(int hundredValueBankNotes, int fiftyValueBankNotes, int twentyValueBankNotes) {
        this.hundredValueBankNotes = hundredValueBankNotes;
        this.fiftyValueBankNotes = fiftyValueBankNotes;
        this.twentyValueBankNotes = twentyValueBankNotes;
    }

    public void addBankNotes(int hundredValueBankNotes, int fiftyValueBankNotes, int twentyValueBankNotes) {
        this.hundredValueBankNotes += hundredValueBankNotes;
        this.fiftyValueBankNotes += fiftyValueBankNotes;
        this.twentyValueBankNotes += twentyValueBankNotes;
        System.out.println("Операция завершена успешно: ДОБАВЛЕНО КОЛИЧЕСТВО купюр по номиналам 100/50/20, шт: " + hundredValueBankNotes + "/" + fiftyValueBankNotes + "/" + twentyValueBankNotes);
        System.out.println(this);
    }

    public void addAmount(int amountToAdd) {
        if (convertAmountToBankNotes(amountToAdd)) {
            addBankNotes(transaction100ValueNotes, transaction50ValueNotes, transaction20ValueNotes);
        } else {
            System.out.println("Невозможно представить указанную сумму купюрами номиналов 100/50/20.");
        }
        transaction100ValueNotes = transaction50ValueNotes = transaction20ValueNotes = 0;
    }

    public boolean withdrawAmount(int requiredAmount) {
        if (workUpCashDemand(requiredAmount)) {
            payOutBankNotes(transaction100ValueNotes, transaction50ValueNotes, transaction20ValueNotes);
            transaction100ValueNotes = transaction50ValueNotes = transaction20ValueNotes = 0;
            System.out.println(this);
            System.out.print("Операция успешно завершена. Результат завершения операции: ");
            return true;
        } else {
            transaction100ValueNotes = transaction50ValueNotes = transaction20ValueNotes = 0;
            System.out.println(this);
            System.out.print("Невозможно выдать указанную сумму имеющимися купюрами. Результат завершения операции: ");
            return false;
        }
    }

    private boolean workUpCashDemand(int requiredAmount) {
        if (convertAmountToBankNotes(requiredAmount)) {
            if (transaction20ValueNotes >= twentyValueBankNotes) {
                return false;
            }
            if (transaction50ValueNotes >= fiftyValueBankNotes) {
                if (transaction50ValueNotes == 2) {
                    transaction50ValueNotes = 0;
                    transaction100ValueNotes++;
                } else {
                    return false;
                }
            }
            if (transaction100ValueNotes >= hundredValueBankNotes) {
                if (!exchange100NotesToOtherAvailableNotes()) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private void payOutBankNotes(int transaction100ValueNotes, int transaction50ValueNotes, int transaction20ValueNotes) {
        hundredValueBankNotes -= transaction100ValueNotes;
        fiftyValueBankNotes -= transaction50ValueNotes;
        twentyValueBankNotes -= transaction20ValueNotes;
        int payOutAmount = transaction100ValueNotes * HUNDRED_VALUE + transaction50ValueNotes * FIFTY_VALUE + transaction20ValueNotes * TWENTY_VALUE;
        System.out.println("ЧЕК: ВЫДАНА СУММА " + payOutAmount + " следующими купюрами по номиналам 100/50/20, шт: " + transaction100ValueNotes + "/" + transaction50ValueNotes + "/" + transaction20ValueNotes);
    }

    private boolean convertAmountToBankNotes(int amountToConvert) {
        if (amountToConvert % 10 == 0 && amountToConvert > 10 && amountToConvert != 30) {
            if (amountToConvert > 130) {
                transaction100ValueNotes = (amountToConvert - 40) / HUNDRED_VALUE;
                amountToConvert -= transaction100ValueNotes * HUNDRED_VALUE;
            }
            changeToSmallNotes(amountToConvert);
            return true;
        } else {
            return false;
        }
    }

    private void changeToSmallNotes(int amountToChange) {
        if (amountToChange == 50 || amountToChange == 70 || amountToChange == 90 || amountToChange == 110 || amountToChange == 130) {
            transaction50ValueNotes = 1;
        }
        if (amountToChange == 100 || amountToChange == 120) {
            transaction50ValueNotes = 2;
        }
        if (amountToChange == 20 || amountToChange == 70 || amountToChange == 120) {
            transaction20ValueNotes = 1;
        }
        if (amountToChange == 40 || amountToChange == 90) {
            transaction20ValueNotes = 2;
        }
        if (amountToChange == 60 || amountToChange == 110) {
            transaction20ValueNotes = 3;
        }
        if (amountToChange == 80 || amountToChange == 130) {
            transaction20ValueNotes = 4;
        }
    }

    private boolean exchange100NotesToOtherAvailableNotes() {
        if ((fiftyValueBankNotes - transaction50ValueNotes) * FIFTY_VALUE > (transaction100ValueNotes - hundredValueBankNotes) * HUNDRED_VALUE) {
            transaction50ValueNotes += (transaction100ValueNotes - hundredValueBankNotes) * HUNDRED_VALUE / FIFTY_VALUE;
            transaction100ValueNotes = hundredValueBankNotes;
            return true;
        } else {
            if ((twentyValueBankNotes - transaction20ValueNotes) * TWENTY_VALUE > (transaction100ValueNotes - hundredValueBankNotes) * HUNDRED_VALUE) {
                transaction20ValueNotes += (transaction100ValueNotes - hundredValueBankNotes) * HUNDRED_VALUE / TWENTY_VALUE;
                transaction100ValueNotes = hundredValueBankNotes;
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "---------- КОЛИЧЕСТВО ДОСТУПНЫХ КУПЮР по номиналам 100/50/20, шт: " + hundredValueBankNotes + "/" + fiftyValueBankNotes + "/" + twentyValueBankNotes + " ----------";
    }
}