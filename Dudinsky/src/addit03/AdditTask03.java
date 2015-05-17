package addit03;

/* Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int. */
public class AdditTask03 {
    public static void main(String[] args) {
        int givenNumber = 100;
        final int INT_MAX = Integer.MAX_VALUE;
        System.out.println("Наибольшее значение, которое может поместиться в тип int: " + INT_MAX);
        double maxPower = Math.log10(INT_MAX) / Math.log10(givenNumber);
        System.out.println("ОТВЕТ: наибольшая целочисленная степень числа " + givenNumber + ", которую можно вычислить, помещая результат в int, равняется: " + (int) maxPower);
        System.out.println("Наибольшая вещественная степень числа " + givenNumber + ", которую можно вычислить, помещая результат в int, равняется: " + maxPower);
        System.out.println("Проверка: " + givenNumber + " в степени " + maxPower + " равняется: " + (int) Math.pow(givenNumber, maxPower) + " (т.е. результат помещается в int)");
    }
}