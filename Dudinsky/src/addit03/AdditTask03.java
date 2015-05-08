package addit03;

/* Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int. */
public class AdditTask03 {
    public static void main(String[] args) {
        int givenNumber = 100;
        int intMax = Integer.MAX_VALUE;
        System.out.println("Наибольшее значение, которое может поместиться в тип int: " + intMax);
        double maxPower = Math.log10(intMax) / Math.log10(givenNumber);
        System.out.println("Наибольшая степень числа " + givenNumber + ", которую можно вычислить, помещая результат в int, равняется: " + maxPower);
        System.out.println("Проверка: " + givenNumber + " в степени " + maxPower + " равняется: " + (int) Math.pow(givenNumber, maxPower) + " (т.е. результат помещается в int)");
    }
}