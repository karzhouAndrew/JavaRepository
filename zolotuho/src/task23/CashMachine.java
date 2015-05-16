package task23;
//Создать класс и объекты описывающие Банкомат.
// Набор купюр находящихся в банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20 50 100.
// Сделать методы для добавления денег в банкомат. Сделать функцию снимающую деньги.
// На вход передается сумма денег. На выход – булевское значение (операция удалась или нет).
// При снятии денег функция должна рапечатывать каким количеством купюр какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.
public class CashMachine {
    private int numberOf20;
    private int numberOf50;
    private int numberOf100;

    public CashMachine(int numberOf20, int numberOf50, int numberOf100) {
        this.numberOf20 = numberOf20;
        this.numberOf50 = numberOf50;
        this.numberOf100 = numberOf100;
    }

    @Override
    public String toString() {
        return "CashMachine{" +
                "numberOf20=" + numberOf20 +
                ", numberOf50=" + numberOf50 +
                ", numberOf100=" + numberOf100 +
                '}';
    }

    public int getNumberOf20() {
        return numberOf20;
    }

    public void setNumberOf20(int numberOf20) {
        this.numberOf20 = numberOf20;
    }

    public int getNumberOf50() {
        return numberOf50;
    }

    public void setNumberOf50(int numberOf50) {
        this.numberOf50 = numberOf50;
    }

    public int getNumberOf100() {
        return numberOf100;
    }

    public void setNumberOf100(int numberOf100) {
        this.numberOf100 = numberOf100;
    }

    public void addDenominations(int numberOf20, int numberOf50, int numberOf100) {
        this.numberOf20 = this.numberOf20 + numberOf20;
        this.numberOf50 = this.numberOf50 + numberOf50;
        this.numberOf100 = this.numberOf100 + numberOf100;

    }

    public boolean obtainCash(int sum) {
        int[] denomination = {100, 50, 20};
        int[] quantity = {numberOf100, numberOf50, numberOf20};
        int numberDifferentDenomination = denomination.length;
        int[] countDenomination = new int[numberDifferentDenomination];
        int increment = 0;
        int tempSum = 0;
        if (sum % 100 % 50 % 20 == 0) {
            while (increment < numberDifferentDenomination) {
                countDenomination[increment] = 0;
                while (countDenomination[increment] < quantity[increment]) {
                    tempSum += denomination[increment];
                    countDenomination[increment]++;
                    if (sum - tempSum < denomination[increment]) break;
                }
                if (tempSum == sum) break;
                increment++;
            }
            for (int i = 0; i < countDenomination.length; i++) {
                quantity[i] -= countDenomination[i];
                switch (denomination[i]) {
                    case 100:
                        numberOf100 = quantity[i];
                        break;
                    case 50:
                        numberOf50 = quantity[i];
                        break;
                    case 20:
                        numberOf20 = quantity[i];
                        break;
                }
            }
            for (int i = 0; i < countDenomination.length; i++) {
                System.out.println(denomination[i] + " -  " + countDenomination[i]);
            }
            return true;
        } else {
            System.out.println("Appropriate denominates is absent!");
            return false;
        }
    }
}
