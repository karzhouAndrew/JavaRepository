package task23;

//Создать класс и объекты описывающие Банкомат.
// Набор купюр находящихся в банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20 50 100.
// Сделать методы для добавления денег в банкомат. Сделать функцию снимающую деньги.
// На вход передается сумма денег. На выход – булевское значение (операция удалась или нет).
// При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.
public class CashMachine {
    private int denomination20;
    private int denomination50;
    private int denomination100;

    public CashMachine(int denomination20, int denomination50, int denomination100) {
        this.denomination20 = denomination20;
        this.denomination50 = denomination50;
        this.denomination100 = denomination100;
    }

    public int getDenomination20() {
        return denomination20;
    }

    public void setDenomination20(int denomination20) {
        this.denomination20 = denomination20;
    }

    public int getDenomination50() {
        return denomination50;
    }

    public void setDenomination50(int denomination50) {
        this.denomination50 = denomination50;
    }

    public int getDenomination100() {
        return denomination100;
    }

    public void setDenomination100(int denomination100) {
        this.denomination100 = denomination100;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                "denomination20=" + denomination20 +
                ", denomination50=" + denomination50 +
                ", denomination100=" + denomination100 +
                '}';
    }

    public void addDenominations(int quantity20, int quantity50, int quantity100) {
        denomination20 += quantity20;
        denomination50 += quantity50;
        denomination100 += quantity100;
    }

    public boolean withdrawCash(int sum) {
        int[] denomination = {100, 50, 20};
        int[] quantity = {denomination100, denomination50, denomination20};
        int numberDifferentDenomination = denomination.length;
        int[] countDenomination = new int[numberDifferentDenomination];
        int increment = 0;
        int tempSum = 0;
        boolean ableCoverRequestedSumPresenceDenominations = sum % denomination[0] % denomination[1] % denomination[2] == 0;
        if (ableCoverRequestedSumPresenceDenominations == true) {
            while (increment < numberDifferentDenomination) {
                countDenomination[increment] = 0;
                while (countDenomination[increment] < quantity[increment]) {
                    tempSum += denomination[increment];
                    countDenomination[increment]++;
                    if (sum - tempSum < denomination[increment]) {
                        break;
                    }
                }
                if (tempSum == sum) {
                    break;
                }
                increment++;
            }
            for (int i = 0; i < countDenomination.length; i++) {
                quantity[i] -= countDenomination[i];
                if (denomination[i] == 100) {
                    denomination100 = quantity[i];
                } else if (denomination[i] == 50) {
                    denomination50 = quantity[i];
                } else if (denomination[i] == 20) {
                    denomination20 = quantity[i];
                }
            }
            for (int i = 0; i < countDenomination.length; i++) {
                System.out.println(denomination[i] + " -  " + countDenomination[i]);
            }
            return true;
        } else {
            return false;
        }
    }
}
