package laba31;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму,
//        убрать все повторяющиеся числа и снова распечатать.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ProcessNumbersInFile {
    private List<Integer> numbersInFile;
    private int nextEmptySell;
    private String text;

    public ProcessNumbersInFile() {
        numbersInFile = new ArrayList<>();
    }

    public void addNumberToArrayFromFile(String file) {
        FileReader inputText = null;
        try {
            inputText = new FileReader(file);
            addNumberWhenFind(inputText);
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass());
        } catch (IOException e) {
            System.out.println(e.getClass());
        } finally {
            nextEmptySell = numbersInFile.size();
            if (inputText != null) {
                try {
                    inputText.close();
                } catch (IOException e) {
                    System.out.println(e.getClass());
                }
            }
        }
    }

    private void addNumberWhenFind(FileReader inputText) throws IOException {
        int symbol;
        while ((symbol = inputText.read()) != -1) {
            addNumber((char) symbol);
        }
    }

    private void addNumber(char symbol) {
        try {
            int number = Integer.valueOf(String.valueOf(symbol));
            isNewNumber(number);
        } catch (IllegalArgumentException e) {
            nextEmptySell = numbersInFile.size();
        }
    }

    private void isNewNumber(int number) {
        if (numbersInFile.size() == nextEmptySell) {
            numbersInFile.add(number);
        } else {
            numbersInFile.set(nextEmptySell, constructInteger(number));
        }
    }

    private Integer constructInteger(int number) {
        return number + numbersInFile.get(nextEmptySell) * 10;
    }

    public int sumNumbersInText() {
        int sum = 0;
        for (Integer number : numbersInFile) {
            sum += number;
        }
        return sum;
    }

    public List<Integer> getDifferentNumbers() {
        return new ArrayList<>(new HashSet<>(numbersInFile));
    }

    public List<Integer> getNumbersInFile() {
        return numbersInFile;
    }

    public void addNumberToArrayFromFileByScanner(String file) {
        Scanner scannerIn = null;
        try {
            scannerIn = new Scanner(file);
            while (scannerIn.hasNextInt()) {
                System.out.println(scannerIn.nextInt());
                numbersInFile.add(scannerIn.nextInt());
            }
        } finally {
            nextEmptySell = numbersInFile.size();
            if (scannerIn != null) {
                scannerIn.close();
            }
        }
    }

}
